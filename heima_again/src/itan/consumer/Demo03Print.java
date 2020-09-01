package itan.consumer;

import java.util.function.Consumer;

public class Demo03Print {
    public static void printInfo(String[] strings, Consumer<String> consumer1 , Consumer<String> consumer2){
        for (String string : strings) {
            consumer1.andThen(consumer2).accept(string);
        }
    }

    public static void main(String[] args) {
        String[] strings = {"迪丽热巴,女","古力娜扎,女","玛尔扎哈,男"};
        printInfo(strings,s -> System.out.print(s.split(",")[0]),s -> System.out.println(s.split(",")[1]));
    }
}
