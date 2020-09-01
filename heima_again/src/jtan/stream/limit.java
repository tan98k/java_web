package jtan.stream;
/*
    limit 方法可以对流进行截取，只取用前n个
    是延迟方法，可以继续调用stream流中的其他方法
 */

import java.util.stream.Stream;

public class limit {
    public static void main(String[] args) {
        String[] strings = {"马云","马化腾","马斯克","马冬梅"};
        Stream<String> strings1 = Stream.of(strings);
        strings1.limit(3).forEach(s -> System.out.println(s));
    }
}
