package maratona.java.nojiraya.intermediario.gassociacao.test;

import maratona.java.nojiraya.intermediario.gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Ronaldinho");
        Jogador jogador02 = new Jogador("Messi");
        Jogador jogador03 = new Jogador("Ronaldo");
        Jogador[] jogadores = {jogador01, jogador02, jogador03};

        for(Jogador pos : jogadores){
            pos.imprimir();
        }

    }
}
