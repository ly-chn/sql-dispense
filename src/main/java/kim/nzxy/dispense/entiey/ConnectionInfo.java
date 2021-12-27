package kim.nzxy.dispense.entiey;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author xy
 * @since 2021/12/26
 */

/**
 * 数据库连接信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "connection_info")
public class ConnectionInfo implements Serializable {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 连接标志
     */
    @TableField(value = "`name`")
    private String name;
    /**
     * 连接地址
     */
    @TableField(value = "url")
    private String url;
    /**
     * 数据库用户名
     */
    @TableField(value = "username")
    private String username;
    /**
     * 数据库密码
     */
    @TableField(value = "`password`")
    private String password;
    /**
     * 驱动类
     */
    @TableField(value = "driver")
    private String driver;
    /**
     * 备注
     */
    @TableField(value = "`comment`")
    private String comment;
}