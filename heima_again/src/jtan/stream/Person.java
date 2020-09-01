package jtan.stream;

public class Person {
    private String name;
    public  String a;
    protected String b;
    String c;
    private String d;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("eatting...");
    }
    public void eat(String a){
        System.out.println("eatting "+ a);
    }
    public void print(){
        System.out.println(toString());
    }
}
