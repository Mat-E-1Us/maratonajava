package maratona.java.nojiraya.intermediario.coleções.test;

import maratona.java.nojiraya.intermediario.coleções.domain.Manga;

import java.util.*;

class SortMangaPrecoComparator implements Comparator<Manga>{
    @Override
    public int compare(Manga m1, Manga m2) {
        return m1.getPreco().compareTo(m2.getPreco());
    }
}


public class ManasortingTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(2L, "Attack on Titan", 2.000));
        mangas.add(new Manga(1L, "Attack on Human", 1.000));
        mangas.add(new Manga(4L, "Attack on Animals", 1.500));
        mangas.add(new Manga(3L, "Attack on Dragons", 3.000));
        Collections.sort(mangas);
        for(Manga manga : mangas){
            System.out.println(manga.toString());
        }

        // AssimCollections.sort(mangas, new SortMangaPrecoComparator()); // ou
        mangas.sort(new SortMangaPrecoComparator());
        System.out.println("----------------------------------------------------");
        for(Manga manga : mangas){
            System.out.println(manga.toString());
        }
    }
}
