package maratona.java.nojiraya.intermediario.stream.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest16 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 123891727L;

        sunFor(num);
        sunIterate(num);
        sunLongParalelStreamIterate(num);
    }

    private static void sunFor(long num){
        System.out.println("Sum for");
        long result = 0;
        long init = System.currentTimeMillis();
        for(int i = 0; i <= num; i++){
            result += i;
        }

        long end = System.currentTimeMillis();
        System.out.println(result + ": " + (init-end) + "ms");
    }


    private static void sunIterate(long num){
        System.out.println("Sum iterate");
        long init = System.currentTimeMillis();
        Long reduce = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(reduce + ": " + (init-end) + "ms");
    }

    private static void sunParalelStreamIterate(long num){
        System.out.println("Sum iterate Parelel Stream");
        long init = System.currentTimeMillis();
        Long reduce = Stream.iterate(1L, i -> i + 1).parallel().limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(reduce + ": " + (init-end) + "ms");
    }

    private static void sunLongParalelStreamIterate(long num){
        System.out.println("Sum iterate stream long");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + ": " + (init-end) + "ms");
    }
}
