package maratona.java.nojiraya.treinar.dominio;

import java.util.Locale;

public class Aubreay extends Personagem{
    public final double BONUS_DE_DANO = 0.07;
    public final double BONUS_DE_SORTE = 0.5;

    public Aubreay(String nome, int idade, double peso, double altura, Locale nacionalidade, double dano, int sorte, Habilidade habilidade, Mundo mundo, double money) {
        super(nome, idade, peso, altura, nacionalidade, dano, sorte, habilidade, mundo, money);
    }

    @Override
    public double BonusDeDano() {
        return this.dano * BONUS_DE_DANO;
    }


    @Override
    public double BonusDeSorte() {
        return this.dano * BONUS_DE_SORTE;
    }


}
