package maratona.java.nojiraya.intermediario.inicializadores.test;

 import maratona.java.nojiraya.intermediario.inicializadores.dominio.AnimeDENOVO;

public class AnimeDENOVOtest01 {

    public static void main(String[] args) {
        AnimeDENOVO anime = new AnimeDENOVO();
        for(int episodio : anime.getEpisodios()){
            System.out.println(episodio + " ");
        }
    }

}
