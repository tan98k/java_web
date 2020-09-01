package itan.function;

import java.util.function.Function;

public class Demo02andThen {
    public static void main(String[] args) {
        andThen("12345", s -> Integer.parseInt(s) + 1, s->s + "nihao");
    }
    public static void andThen(String string, Function<String, Integer> function1, Function<Integer, String> function2 ){
        System.out.println(function1.andThen(function2).apply(string));
    }
}
