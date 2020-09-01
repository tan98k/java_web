package ktan.yinyong;

import java.util.stream.Stream;

public class Demo01 {
    public static void main(String[] args) {
        printString("nihaoya", string -> System.out.println(string));
        printString("nihaoya", System.out::println);
        //::称为“方法引用”
//        MethodOfObj methodOfObj = new MethodOfObj();
        printString("whh",MethodOfObj::printUpper);
        //如果printUpper是静态方法的话，就直接用类名去调用；如果是动态方法，则要new一个对象，然后通过对象去调用
    }
    private static void printString(String string, Printable printable){
        printable.print(string);
    }
}
