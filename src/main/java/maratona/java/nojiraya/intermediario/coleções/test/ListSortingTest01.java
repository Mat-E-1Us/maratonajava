package maratona.java.nojiraya.intermediario.coleções.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortingTest01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Attack on Titan");
        mangas.add("Naruto");
        mangas.add("Pokemon");
        mangas.add("Dragon Ball");
        mangas.add("Vrau");
        Collections.sort(mangas);
        for(String manga : mangas){
            System.out.println(manga);
        }
    }
}
