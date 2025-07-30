package maratona.java.nojiraya.intermediario.lambdas.test;

import maratona.java.nojiraya.intermediario.lambdas.dominio.Anime;
import maratona.java.nojiraya.intermediario.lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> anime = new ArrayList<>(List.of(new Anime("Kono oto Koto", 25), new Anime("A voz do Silencio", 1), new Anime("ReLife", 24)));

        anime.sort(animeComparators::comparatorByNonStatic);
        System.out.println();
        anime.sort((a, b) -> animeComparators.comparatorByNonStatic(a, b));
        System.out.println(anime);

    }
}
