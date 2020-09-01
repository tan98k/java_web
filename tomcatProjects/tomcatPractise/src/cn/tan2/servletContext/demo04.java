package cn.tan2.servletContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/getRealPath")
public class demo04 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = this.getServletContext();
        //获取web目录下的资源
        System.out.println(context.getRealPath("/b.txt"));
        //获取WEB-INF下的资源
        System.out.println(context.getRealPath("/WEB-INF/c.txt"));
        //获取src目录下的资源
        System.out.println(context.getRealPath("/WEB-INF/classes/a.txt"));
    }
}
