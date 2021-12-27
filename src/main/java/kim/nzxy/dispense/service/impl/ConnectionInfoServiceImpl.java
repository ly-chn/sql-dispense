package kim.nzxy.dispense.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import kim.nzxy.dispense.entiey.ConnectionInfo;
import kim.nzxy.dispense.mapper.ConnectionInfoMapper;
import kim.nzxy.dispense.service.ConnectionInfoService;
import org.springframework.stereotype.Service;

/**
 * @author xy
 * @since 2021/12/26
 */
@Service
public class ConnectionInfoServiceImpl extends ServiceImpl<ConnectionInfoMapper, ConnectionInfo> implements ConnectionInfoService {

}
