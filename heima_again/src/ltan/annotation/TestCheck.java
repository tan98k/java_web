package ltan.annotation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCheck {

    public static void main(String[] args) throws Exception {

        int count = 0;
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("bug.txt"));
//        bufferedWriter.write("hhh");
        //创建计算器对象
        Calculator calculator = new Calculator();
        //获取字节码文件对象
        Class cls= calculator.getClass();
        //获取所有方法
        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            //判断方法上是否有Check注解
            if(method.isAnnotationPresent(Check.class)){
                //有则执行
                try {
                    method.invoke(calculator);
                } catch (Exception e) {
                    //捕获异常
                    e.printStackTrace();
                    //纪录到文件中
                    count++;
                    System.out.println(e);
                    bufferedWriter.write(method.getName() + "出现异常了");
                    bufferedWriter.newLine();
                    bufferedWriter.write("异常的名称是： "+ e.getCause().getClass().getSimpleName());
                    bufferedWriter.newLine();
                    bufferedWriter.write("异常的原因是： "+ e.getCause().getMessage());
                    bufferedWriter.newLine();
                    bufferedWriter.write("------------------------------------------");
                    bufferedWriter.newLine();
                }
            }
        }
        bufferedWriter.write("本次测试共出现 "+count +"次异常");
        bufferedWriter.close();
    }

}
