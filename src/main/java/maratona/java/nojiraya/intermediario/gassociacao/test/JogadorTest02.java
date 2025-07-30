package maratona.java.nojiraya.intermediario.gassociacao.test;

import maratona.java.nojiraya.intermediario.gassociacao.dominio.Jogador;
import maratona.java.nojiraya.intermediario.gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");

        jogador01.setTime(time);

        jogador01.imprimir();
    }
}
