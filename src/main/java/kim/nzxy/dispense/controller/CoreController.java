package kim.nzxy.dispense.controller;

import com.zaxxer.hikari.HikariDataSource;
import kim.nzxy.dispense.entiey.ConnectionInfo;
import kim.nzxy.dispense.entiey.ExecuteSql;
import kim.nzxy.dispense.service.ConnectionInfoService;
import kim.nzxy.dispense.service.ExecuteSqlService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;

/**
 * @author xuyingfa
 * @since 2021-12-27
 */
@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping
public class CoreController {
    private final ConnectionInfoService connectionInfoService;
    private final ExecuteSqlService executeSqlService;

    @GetMapping("run-sql")
    public void run() {
        // 1. 获取所有sql
        for (ExecuteSql executeSql : executeSqlService.list()) {
            for (ConnectionInfo info : connectionInfoService.list()) {
                final HikariDataSource dataSource = new HikariDataSource();
                dataSource.setJdbcUrl(info.getUrl());
                dataSource.setUsername(info.getUsername());
                dataSource.setPassword(info.getPassword());
                dataSource.setDriverClassName(info.getDriver());
                try (final Connection connection = dataSource.getConnection();
                     final PreparedStatement ps = connection.prepareStatement(executeSql.getSqlContent());
                     final ResultSet rs = ps.executeQuery();) {
                    final ResultSetMetaData metaData = ps.getMetaData();
                    for (int i = 1; i <= metaData.getColumnCount(); i++) {
                        log.info(executeSql.getId() + info.getId() + metaData.getColumnName(i) + "\t");
                    }
                    System.out.println();
                    while (rs.next()) {
                        for (int i = 1; i <= metaData.getColumnCount(); i++) {
                            log.info(executeSql.getId() + info.getId() + rs.getString(i) + "\t");
                        }
                        System.out.println();
                    }
                    // 放弃解析
                } catch (SQLException e) {
                    log.error("sql执行异常, connection info: {}, sql info: {}", info, executeSql, e);
                }
            }
        }
    }
}
