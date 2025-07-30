package maratona.java.nojiraya.intermediario.stream.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class StreamTest08 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,50).filter(n -> n % 2 == 0).forEach(System.out::println);

        Stream.of("Eleve ", "abacate ", "com ", "a ", "brotopeira.").sorted(String::compareTo).forEach(System.out::print);
            int[] nume = {1,2,3,4,6,7,8,9,5};
        Arrays.stream(nume)
                .average()
                .ifPresent(System.out::println);

        try (Stream<String> stringStream = Files.lines(Paths.get("arquivo/personagem.txt"))) {
            stringStream.filter(a -> a.contains("a"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
