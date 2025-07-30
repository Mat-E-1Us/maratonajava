package maratona.java.nojiraya.intermediario.lambdas.service;


import maratona.java.nojiraya.intermediario.lambdas.dominio.Anime;

public class AnimeComparators {

    public static int comparatorByTitle(Anime n1, Anime n2){
        return n1.toString().compareTo(n2.toString());
    }


    public int comparatorByNonStatic(Anime n1, Anime n2){
        return n1.toString().compareTo(n2.toString());
    }
}
