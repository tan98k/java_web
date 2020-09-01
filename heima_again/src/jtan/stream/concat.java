package jtan.stream;

import java.util.stream.Stream;

public class concat {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("张十三", "李十四", "王十五", "赵十六", "张三丰");
        Stream<String> stream2 = Stream.of("马云", "马化腾", "马斯克", "马冬梅");
        Stream<String> concat = Stream.concat(stream1, stream2);
        concat.forEach(s -> System.out.println(s));
    }
}
