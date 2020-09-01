package ltan.reflect;

import jtan.stream.Person;

import java.lang.reflect.Field;

public class reflectDemo02 {
    public static void main(String[] args) throws Exception {
        //获取Person的对象
        Class<Person> personClass = Person.class;
        //获取Person的成员变量
        Field[] fields = personClass.getFields();//获取所有public 修饰的成员变量
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("------------------------");
        Field a = personClass.getField("a");//获取指定的成员变量

        Person person = new Person();
//        System.out.println(a.get(person));
        System.out.println(person);
        a.set(person,"aaaaaa");
//        System.out.println(a.get(person));
        System.out.println(person);

        System.out.println("------------------------");
        Field[] declaredFields = personClass.getDeclaredFields();//获取所有的成员变量
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        System.out.println("------------------------");
        Field d = personClass.getDeclaredField("d");
        d.setAccessible(true);  //暴力反射
        System.out.println(d.get(person));
    }
}
