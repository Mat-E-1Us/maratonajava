package maratona.java.nojiraya.intermediario.coleções.test;

import maratona.java.nojiraya.intermediario.coleções.domain.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new LinkedHashSet<>();
        mangas.add(new Manga(2L, "Attack on Titan", 2.000, 5));
        mangas.add(new Manga(1L, "Attack on Human", 1.000, 0));
        mangas.add(new Manga(4L, "Attack on Animals", 1.500, 2));
        mangas.add(new Manga(3L, "Attack on Dragons", 3.000, 0));
        mangas.add(new Manga(5L, "Attack on Human", 1.000, 0));
        for(Manga manga : mangas){
            System.out.println(manga);
        }
    }
}
