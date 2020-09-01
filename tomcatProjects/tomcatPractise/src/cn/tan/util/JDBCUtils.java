package cn.tan.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * JDBC工具类，使用Druid连接池
 */
public class JDBCUtils {
    public static DataSource ds;
    static {
        //要记下来
        try {
            Properties pro = new Properties();
            InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties");
            pro.load(is);
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //工具类方法定义为静态的好
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    public static DataSource getDataSource(){
        return ds;
    }
}
