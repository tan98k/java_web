package jtan.stream;

import java.util.stream.Stream;

public class count {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("张十三", "李十四", "王十五", "赵十六","张三丰");
        Stream<String> person = stringStream.filter(s -> s.startsWith("张"));
        System.out.println(person.count());
    }
}
