package itan.consumer;

import java.util.function.Consumer;

public class Demo02Andthen {
    public static void andThen(String str1, String str2, Consumer<String> consumer1, Consumer<String> consumer2){
        consumer1.andThen((consumer2)).accept(str1);
    }

    public static void main(String[] args) {
        andThen("tan","hello",(s -> System.out.println(s)),s -> System.out.println(s));
    }
}
