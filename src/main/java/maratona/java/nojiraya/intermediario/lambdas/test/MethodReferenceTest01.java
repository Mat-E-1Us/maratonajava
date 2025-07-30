package maratona.java.nojiraya.intermediario.lambdas.test;

import maratona.java.nojiraya.intermediario.lambdas.dominio.Anime;
import maratona.java.nojiraya.intermediario.lambdas.service.AnimeComparators;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
public class MethodReferenceTest01 {
    public static void main(String[] args) {

        //para metódos static's
        List<Anime> anime = new ArrayList<>(List.of(new Anime("Kono oto Koto", 25), new Anime("A voz do Silencio", 1), new Anime("ReLife", 24)));
        anime.sort((a, b)-> a.toString().compareTo(b.toString()));
        System.out.println(anime);
        anime.sort(AnimeComparators::comparatorByTitle);
        System.out.println(anime);

    }
}
