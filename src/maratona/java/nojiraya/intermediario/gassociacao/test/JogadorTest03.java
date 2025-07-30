package maratona.java.nojiraya.intermediario.gassociacao.test;

import maratona.java.nojiraya.intermediario.gassociacao.dominio.Jogador;
import maratona.java.nojiraya.intermediario.gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Maat");
        Jogador jogador2 = new Jogador("Maat2");
        Jogador jogador3 = new Jogador("Maat3");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador, jogador2, jogador3};
        jogador.setTime(time);
        jogador2.setTime(time);
        jogador3.setTime(time);
        time.setJogadores(jogadores);


        System.out.println("--- Jogador ---");

        jogador.imprimir();
        jogador2.imprimir();
        jogador3.imprimir();

        System.out.println("--- Time ---");

        time.imprimir();
    }
}
