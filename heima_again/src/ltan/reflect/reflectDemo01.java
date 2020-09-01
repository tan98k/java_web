package ltan.reflect;

import jtan.stream.Person;

public class reflectDemo01 {
    public static void main(String[] args) throws Exception {

        //1.class.forName("全类名")    多用于配置文件，读取文件加载类
        Class aClass = Class.forName("jtan.stream.Person");
        System.out.println(aClass);

        //类名.class    多用于参数的传递
        Class<Person> personClass = Person.class;
        System.out.println(personClass);

        //对象.getClass()     多用于对象获取字节码的方式
        Person person = new Person();
        Class<? extends Person> aClass1 = person.getClass();
        System.out.println(aClass1);
    }
}
