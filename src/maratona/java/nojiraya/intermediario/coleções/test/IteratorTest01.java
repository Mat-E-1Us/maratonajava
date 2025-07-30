package maratona.java.nojiraya.intermediario.coleções.test;

import maratona.java.nojiraya.intermediario.coleções.domain.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(2L, "Attack on Titan", 2.000, 5));
        mangas.add(new Manga(1L, "Attack on Human", 1.000, 0));
        mangas.add(new Manga(4L, "Attack on Animals", 1.500, 2));
        mangas.add(new Manga(3L, "Attack on Dragons", 3.000, 0));

        System.out.println(mangas);
        System.out.println("--------------------------------------------------------------------");
        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
