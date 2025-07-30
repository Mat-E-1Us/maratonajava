package maratona.java.nojiraya.intermediario.construtores.Test;


import maratona.java.nojiraya.intermediario.construtores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("ABADABADUUUUU", "Mediaeval", 140, "ZIum", "Agabadu");
        int[] bas = {1,2,3,4,5,6,7,8,9,10};
        anime.imp();

        anime.getNome();
        anime.getTipo();
        anime.getEpisodios();
        anime.getGenero();
        anime.getEstudio();
        for(int i = 0; i<= 1000000; i++){
            if(i % 2 == 0){
                System.out.println("n: " + i);

            }

        }
    }
}
