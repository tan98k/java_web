package ltan.reflect;

import jtan.stream.Person;

import java.lang.reflect.Method;

public class reflectDemo04 {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("------------------------");
        Method eat = personClass.getMethod("eat");
        //invoke(对象，参数)
        Person person = new Person();
        eat.invoke(person);

        System.out.println("------------------------");
        Method method = personClass.getMethod("eat", String.class);



        method.invoke(person, "lunch");
        System.out.println("------------------------");
        Method[] declaredMethods = personClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
            System.out.println(declaredMethod.getName());
        }
    }
}
