package itan.predicate;

import java.util.function.Predicate;

public class Demo01 {
    public static void main(String[] args) {
        String string = "jdojfosi";
        System.out.println(testString(string, s -> s.length() > 5));
    }
    public static boolean testString(String string, Predicate<String> predicate){
        return predicate.test(string);
    }

}
