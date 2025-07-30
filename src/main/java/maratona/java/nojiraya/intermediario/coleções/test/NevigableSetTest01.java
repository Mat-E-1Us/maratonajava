package maratona.java.nojiraya.intermediario.coleções.test;

import maratona.java.nojiraya.intermediario.coleções.domain.Manga;
import maratona.java.nojiraya.intermediario.coleções.domain.Smartphone;

import java.util.*;

class MangaPrecoComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return o1.getPreco().compareTo(o2.getPreco());
    }
}

public class NevigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>();
        Smartphone sm = new Smartphone("123", "Nokia");
        List<String> n = new ArrayList<>();
        Collections.sort(n, (a, d) -> a.toString().compareTo(d.toString()));
        set.add(sm);
        System.out.println(set);
        NavigableSet<Manga> mangas = new TreeSet<>(new SortMangaPrecoComparator());
        mangas.add(new Manga(2L, "Attack on Titan", 11.000, 5));
        mangas.add(new Manga(1L, "Attack on Human", 12.000, 0));
        mangas.add(new Manga(4L, "Attack on Animals", 1.500, 2));
        mangas.add(new Manga(3L, "Attack on Dragons", 3.000, 0));
        mangas.add(new Manga(5L, "Attack on Biscoito", 9.000, 0));

        Manga attackOnPassarinho = new Manga(5L, "Attack on Passarinho", 10.000, 0);
        for(Manga manga : mangas.descendingSet()){
            System.out.println(manga);
        }
        System.out.println("----------------------------------------------------");
        System.out.println(mangas.lower(attackOnPassarinho));
        System.out.println(mangas.floor(attackOnPassarinho));
        System.out.println(mangas.higher(attackOnPassarinho));
        System.out.println(mangas.ceiling(attackOnPassarinho));
    }
}
