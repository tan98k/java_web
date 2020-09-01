package ltan.annotation;

public class Calculator {

    @Check
    public void add(){
        System.out.println(2+3);
    }

    @Check
    public void sub(){
        System.out.println(3-2);
    }

    @Check
    public void chu(){
        System.out.println(3/0);
    }
}
