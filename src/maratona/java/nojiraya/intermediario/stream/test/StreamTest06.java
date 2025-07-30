package maratona.java.nojiraya.intermediario.stream.test;

import java.util.List;

public class StreamTest06 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7);
        integers.stream().reduce(Integer::max)
                .ifPresent(System.out::println);
    }
}
