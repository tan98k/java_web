package jtan.stream;

import java.util.stream.Stream;
/*
    map把所有的数据类型进行转化
 */
public class map {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("10","12","18");
        Stream<Integer> integerStream = stringStream.map(s -> Integer.parseInt(s));
        integerStream.forEach(s-> System.out.println(s));
    }
}
