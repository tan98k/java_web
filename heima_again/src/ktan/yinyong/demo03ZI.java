package ktan.yinyong;
/*
    下面两种写法是等效的：
        Lambda表达式： () -> this.sayHello()
        方法引用： this::sayHello
 */
public class demo03ZI extends demo03FU {
    @Override
    public void sayHello() {
        System.out.println("大家好");
    }
    public void method(Greetable greetable){
        greetable.greet();
    }
    public void showFU(){
        method(()->new demo03FU().sayHello());
        method(()->super.sayHello());
        method(super::sayHello);
    }
    public void showZI(){
        method(()->new demo03ZI().sayHello());
        method(()->this.sayHello());
        method(this::sayHello);
    }
}
