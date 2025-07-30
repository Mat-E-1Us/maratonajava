package maratona.java.nojiraya.intermediario.sobrecargametodos.Test;

import maratona.java.nojiraya.intermediario.sobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("BecameEt", "Manhawa", 1080, "Ação");

        anime.imprimir();
    }
}
