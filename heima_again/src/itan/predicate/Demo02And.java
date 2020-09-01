package itan.predicate;

import java.util.function.Predicate;

public class Demo02And {
    public static boolean predicateAnd(String string, Predicate<String> predicate1, Predicate<String> predicate2){
        return predicate1.and(predicate2).test(string);
//        return predicate1.test(string) && predicate2.test(string);
    }

    public static void main(String[] args) {
        String string = "tttttthkai";
        System.out.println(predicateAnd(string,s -> s.length()>5, s -> s.contains("n")));
    }
}
