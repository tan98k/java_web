package itan.supplier;
/*
    Supplier<T> 也为生产型接口,get()会返回该类型
*/

import java.util.function.Supplier;

public class demo01 {
    public static String getString(Supplier<String> supplier){
        return supplier.get();
    }

    public static void main(String[] args) {
        String string = getString(() -> "nihaoya");
        System.out.println(string);
    }
}
