package ltan.reflect;

import jtan.stream.Person;

import java.lang.reflect.Constructor;

public class reflectDemo03 {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;
        //获取构造方法
        Constructor<Person> constructor = personClass.getConstructor(String.class);
        System.out.println(constructor);
        System.out.println("------------------------");
        Person person = constructor.newInstance("tan");
        System.out.println(person);
        System.out.println("------------------------");
        System.out.println(personClass.newInstance());//
    }
}
