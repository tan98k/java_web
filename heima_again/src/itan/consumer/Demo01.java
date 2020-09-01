package itan.consumer;

import java.util.function.Consumer;

public class Demo01 {
    public static void method(String name, Consumer<String> consumer){
        consumer.accept(name);
    }

    public static void main(String[] args) {
        method("tan",s-> System.out.println("hello "+s));
    }
}
