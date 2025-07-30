package maratona.java.nojiraya.intermediario.stream.test;

import maratona.java.nojiraya.intermediario.stream.domain.LightNovel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StremTest02 {
    private static List<LightNovel> novels = new ArrayList<>(
            List.of(new LightNovel("E o vilão da novel que quer viver", 2.50),
                    new LightNovel("Attack On Titan", 5.00),
                    new LightNovel("A voz do silêncio", 3.00),
                    new LightNovel("Kanaberi", 1.50),
                    new LightNovel("One Piece", 2.50),
                    new LightNovel("Kaiju 8.0", 3.00)));

    public static void main(String[] args) {
        String[] mangas = new String[3];
        int count = 0;
        novels.sort(Comparator.comparing(LightNovel::getName));
        for(LightNovel item : novels){

            if(item.getPrice() <= 4.00 && count < 3) {
                System.out.println(item);
                mangas[count] = item.getName();
                count = count + 1;
            }
        }
        System.out.println(Arrays.toString(mangas));
    }
}
