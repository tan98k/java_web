package jtan.stream;

import java.util.stream.Stream;

/*
    如果流的当前长度大于n，则跳过前n个；否则将会得到一个长度为0的空流。
 */
public class skip {
    public static void main(String[] args) {
        String[] strings = {"马云","马化腾","马斯克","马冬梅"};
        Stream<String> strings1 = Stream.of(strings);
        strings1.skip(3).forEach(s -> System.out.println(s));
    }
}
