package cn.tan.web.serlvet;

import cn.tan.Dao.UserDao;
import cn.tan.domain.User;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("hello");
        request.setCharacterEncoding("utf-8");
   /*     String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username + ":" + password);
        User loginUser = new User();
        loginUser.setUsername(username);
        loginUser.setPassword(password);
    */
   //使用BeanUtils来替换以上代码
        Map<String, String[]> parameterMap = request.getParameterMap();
        User loginUser = new User();
        try {
            BeanUtils.populate(loginUser, parameterMap);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        UserDao userDao = new UserDao();
        User user = userDao.login(loginUser);

        if(user == null){
           request.getRequestDispatcher("/failServlet").forward(request,response);
        }else {
            request.setAttribute("user",user);
            request.getRequestDispatcher("/successServlet").forward(request,response);
        }
    }
}
