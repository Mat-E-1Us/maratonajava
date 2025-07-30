package maratona.java.nojiraya.intermediario.stream.test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTest09 {
    public static void main(String[] args) {
        int num = 0;
        Stream.iterate(2, n -> n+2)
                .limit(10)
                .forEach(System.out::println);
        System.out.println("---------");
        for(int i = 2; i < 10; i ++){
            System.out.println(num);
            num = i - 1 + i-2;
        }
        System.out.println("---------");

        Stream.iterate(new int[]{0,1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .forEach(a -> System.out.println(Arrays.toString(a)));

        ThreadLocalRandom random = ThreadLocalRandom.current();

        Stream.generate(() -> random.nextInt(1, 10000000))
                .limit(40)
                .map(Integer::intValue)
                .forEach(System.out::println);

String txt = "asjmdas di jasoid jaois d";

    }
}
