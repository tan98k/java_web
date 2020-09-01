package cn.tan.web.serlvet;

import cn.tan.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/successServlet")
public class successServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("success");
        User user = (User) request.getAttribute("user");
        if (user != null){
            //设置页面编码
            response.setContentType("text/html; charset=utf-8");
            PrintWriter writer = response.getWriter();
            writer.write("登陆成功，欢迎" + user.getUsername());
        }else {
            System.out.println("null");
        }
    }
}
