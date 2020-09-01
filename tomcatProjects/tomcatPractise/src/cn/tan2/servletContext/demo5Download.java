package cn.tan2.servletContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.Buffer;

@WebServlet("/download")
public class demo5Download extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String dw = req.getParameter("dw");
        System.out.println(dw);
        ServletContext context = this.getServletContext();
        String realPath = context.getRealPath("/img/"+dw);
        FileInputStream fileInputStream = new FileInputStream(realPath);

        String mimeType = context.getMimeType(dw);
        resp.setHeader("content-type",mimeType);
        resp.setHeader("content-disposition","attachment;filename="+dw);

        ServletOutputStream outputStream = resp.getOutputStream();
        int len = 0;
        byte[] buffer = new byte[1024];
        while ((len = fileInputStream.read(buffer))!= -1){
            outputStream.write(buffer,0,len);
        }

    }
}
