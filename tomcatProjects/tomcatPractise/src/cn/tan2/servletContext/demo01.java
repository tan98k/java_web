package cn.tan2.servletContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servletDemo01")
public class demo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //获取servletContext
        ServletContext context = this.getServletContext();
        //MIME类型： text/html
        String mimeType = context.getMimeType("a.jpg");
        System.out.println(mimeType);

    }
}
