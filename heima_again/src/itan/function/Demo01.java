package itan.function;

import java.util.function.Function;

public class Demo01 {
    public static void main(String[] args) {
        String string = "123456";
        change(string, s -> Integer.parseInt(s));
    }
    public static void change(String string, Function<String, Integer> function){
        Integer apply = function.apply(string);
        System.out.println(apply);
    }
}
