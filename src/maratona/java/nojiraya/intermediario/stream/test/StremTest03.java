package maratona.java.nojiraya.intermediario.stream.test;

import maratona.java.nojiraya.intermediario.stream.domain.LightNovel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StremTest03 {
    private static List<LightNovel> novels = new ArrayList<>(
            List.of(new LightNovel("E o vilão da novel que quer viver", 2.50),
                    new LightNovel("Attack On Titan", 5.00),
                    new LightNovel("A voz do silêncio", 3.00),
                    new LightNovel("Kanaberi", 1.50),
                    new LightNovel("One Piece", 2.50),
                    new LightNovel("Kaiju 8.0", 3.00)));

    public static void main(String[] args) {
        long count = novels.stream()
                .filter(ln -> ln.getPrice() <= 4)
                .count();
        System.out.println(count);
    }
}
