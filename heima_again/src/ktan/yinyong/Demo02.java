package ktan.yinyong;

public class Demo02 {
    public static void main(String[] args) {
        new Demo02().method(-100, num -> Math.abs(num));
        new Demo02().method(-200, Math::abs);
        /*
        两种方法是等效的：
            Lambda表达式： n -> Math.abs(n)
            方法引用： Math::abs
         */
    }
    public void method(int num, Calcable calcable){
        System.out.println(calcable.calc(num));
    }
}
