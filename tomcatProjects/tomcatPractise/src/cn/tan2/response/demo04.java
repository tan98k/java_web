package cn.tan2.response;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet("/checkCode")
public class demo04 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int width = 100;
        int height = 50;
     //创建对象，在内存中的图片
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);

     //绘图
        //获取画笔对象
        Graphics graphics = bufferedImage.getGraphics();
        graphics.setColor(Color.red);//设置颜色
        graphics.fillRect(0,0, width, height);
        graphics.setColor(Color.BLACK);
        graphics.drawRect(0,0,width - 1, height - 1);

        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        Random random = new Random();
        //画字符
        graphics.setColor(Color.blue);
        for (int i = 1; i <= 4; i++) {
            int index = random.nextInt(s.length());
            graphics.drawString(s.charAt(index)+"",width/5*i, height/2);
        }
        //画线
        graphics.setColor(Color.PINK);
        for (int i = 0; i < 10; i++) {
            int x = random.nextInt(width);
            int y = random.nextInt(height);
            int x1 = random.nextInt(width);
            int y1 = random.nextInt(height);
            graphics.drawLine(x,y,x1,y1);
        }

        //将图片输出
        ImageIO.write(bufferedImage,"png",resp.getOutputStream());
    }
}
