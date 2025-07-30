package maratona.java.nojiraya.intermediario.lambdas.test;

import maratona.java.nojiraya.intermediario.lambdas.dominio.Anime;
import maratona.java.nojiraya.intermediario.lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
//        Supplier<AnimeComparators> newAnimeComparator = AnimeComparators::new;
//        AnimeComparators animeComparators = newAnimeComparator.get();
////        AnimeComparators animeComparators = () ;
//        List<Anime> anime = new ArrayList<>(List.of(new Anime("Kono oto Koto", 25), new Anime("A voz do Silencio", 1), new Anime("ReLife", 24)));
//
//
//        anime.sort(animeComparators::comparatorByNonStatic);
//        anime.forEach(System.out::println);
        Double[] arr = {1.0, 1.0};

        int n = 10;
        if(n <= 0){
            System.out.println("Tamanho do array inválido");
        } else if(n < 2){
            System.out.println("Quantidade de elementos inválidos");
        }

       Double[] sequencia = new Double[n];

        System.arraycopy(arr, 0, sequencia, 0, 2);

        for(int i = 2; i < n; i++){
            sequencia[i] = sequencia[i - 1] + sequencia[i -2];
        }

        List <Double> doubles = new ArrayList<>(Arrays.asList(sequencia));
        doubles.forEach(System.out::println);
        long v = 39;
        Character[] bah = new Character[]{};
       int p = (int)v;
    }
}
