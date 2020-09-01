package cn.tan.test;

import cn.tan.Dao.UserDao;
import cn.tan.domain.User;
import org.junit.jupiter.api.Test;

public class userDaoTest  {

    @Test
    public void testLogin(){
        User user = new User();
        user.setUsername("tan");
        user.setPassword("1006");

        UserDao userDao = new UserDao();
        User login = userDao.login(user);
        System.out.println(login);
    }
}
