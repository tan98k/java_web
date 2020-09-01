package cn.tan.Dao;

import cn.tan.domain.User;
import cn.tan.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * 操作数据库中user表的类
 */

public class UserDao {

    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
    /**
     * 登陆方法
     * @param loginUser 只有用户名和密码
     * @return user 有user的全部数据
     */
    public User login(User  loginUser){
        try {
            String sql = "select * from user where username = ? and password = ?";
            User user = template.queryForObject(sql,
                    new BeanPropertyRowMapper<User>(User.class),
                    loginUser.getUsername(), loginUser.getPassword());

            return user;
        }catch (Exception e){
            return null;
        }
    }
}
