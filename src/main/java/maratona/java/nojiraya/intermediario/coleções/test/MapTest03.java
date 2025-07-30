package maratona.java.nojiraya.intermediario.coleções.test;

import maratona.java.nojiraya.intermediario.coleções.domain.Consumidor;
import maratona.java.nojiraya.intermediario.coleções.domain.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("William Suane");
        Consumidor consumidor2 = new Consumidor("DevDojo Academy");
        System.out.println(consumidor1.toString());

        Manga attackOnTitan = new Manga(2L, "Attack on Titan", 2.000);
        Manga attackOnHuman = new Manga(1L, "Attack on Human", 1.000);
        Manga attackOnAnimals = new Manga(4L, "Attack on Animals", 1.500);
        Manga attackOnDragons = new Manga(3L, "Attack on Dragons", 3.000);

        List<Manga> mangt = List.of(attackOnAnimals, attackOnDragons);
        List<Manga> mangt2= List.of(attackOnHuman, attackOnTitan);
        Map<Consumidor, List<Manga>> consumidores = new HashMap<>();

        consumidores.put(consumidor1, mangt);
        consumidores.put(consumidor2, mangt2);

        for(Map.Entry<Consumidor, List<Manga>> entrada : consumidores.entrySet()){
            System.out.println("-----------------");
            System.out.println(entrada.getKey().getNome());
            for (Manga manga : entrada.getValue()){
                System.out.println(manga.getNome());
            }
            System.out.println("-----------------");
        }




    }
}
