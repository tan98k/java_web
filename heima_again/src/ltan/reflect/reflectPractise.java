package ltan.reflect;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Properties;

public class reflectPractise {
    public static void main(String[] args) throws Exception {
        //创建Properties对象
        Properties properties = new Properties();
        //加载配置文件，转换为一个集合。 获取目录下的配置文件
        ClassLoader classLoader = reflectPractise.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("pro.properties");
        properties.load(resourceAsStream);

        //获取配置文件中的配置文件
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        Class<?> aClass = Class.forName(className);
        Object o = aClass.newInstance();
        Method method = aClass.getMethod(methodName);
        method.invoke(o);
    }
}
