package kim.nzxy.dispense.entiey;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xuyingfa
 * @since 2021-12-27
 */
/**
    * sql内容
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "execute_sql")
public class ExecuteSql implements Serializable {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * sql内容
     */
    @TableField(value = "sql_content")
    private String sqlContent;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_SQL_CONTENT = "sql_content";
}