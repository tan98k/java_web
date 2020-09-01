package jtan.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class practise {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("张十三", "李十四", "王十五", "赵十六", "张三丰");
        Stream<String> stream2 = Stream.of("马云", "马化腾", "马斯克", "马冬梅");
        ArrayList<String> one = new ArrayList<>();
        one.add("张十三");
        one.add("李十四");
        one.add("王十五");
        one.add("赵十六");
        one.add("张三丰");

        ArrayList<String> two = new ArrayList<>();
        two.add("马云");
        two.add("马化腾");
        two.add("马斯克");
        two.add("马冬梅");

        Stream<String> streamOne = one.stream().filter(s -> s.length() == 3).limit(3);
        Stream<String> streamTwo = two.stream().filter(s -> s.startsWith("马")).skip(2);
        Stream.concat(streamOne, streamTwo).map(s -> new Person(s)).forEach(person -> System.out.println(person));
    }
}
