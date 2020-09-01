package jtan.stream;

import java.util.stream.Stream;

public class Demo01 {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("张十三", "李十四", "王十五", "赵十六");
        stringStream.forEach(s -> System.out.println(s));
    }
}
