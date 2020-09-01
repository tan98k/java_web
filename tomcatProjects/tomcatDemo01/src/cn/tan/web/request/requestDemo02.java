package cn.tan.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@WebServlet("/requestDemo02")
public class requestDemo02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("demo3");
//        //请求方式
//        System.out.println(req.getMethod());
//        //虚拟目录
//        System.out.println(req.getContextPath());
//        //获取servlet目录
//        System.out.println(req.getServletPath());
//        //获取GET的请求参数
//        System.out.println(req.getQueryString());
//        //请求uri,url
//        System.out.println(req.getRequestURI());
//        System.out.println(req.getRequestURL());
//        //获取HTTP版本
//        System.out.println(req.getProtocol());
//        //获取客户端ip地址
//        System.out.println(req.getRemoteUser());

        //设置request编码，防止乱码
        req.setCharacterEncoding("utf-8");

//        System.out.println(req.getParameter("user"));
        Set<Map.Entry<String, String[]>> entries = req.getParameterMap().entrySet();
        for (Map.Entry<String, String[]> entry : entries) {
            System.out.println(entry.getKey()+ "==" + entry.getValue()[0]);
        }
        System.out.println("------------");
        Enumeration<String> parameterNames = req.getParameterNames();
        Iterator<String> stringIterator = parameterNames.asIterator();
        while (stringIterator.hasNext()){
            System.out.println(stringIterator.next());
        }
        System.out.println("------------");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
