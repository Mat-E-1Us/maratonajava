package maratona.java.nojiraya.treinar.dominio;

import java.util.Locale;

public class Kel extends Personagem{
    public final double BONUS_DE_DANO = 0.4;
    public final double BONUS_DE_SORTE = 0.04;
    private static String vazio = "Real";

    public Kel(String nome, int idade, double peso, double altura, Locale nacionalidade, double dano, int sorte, Habilidade habilidade, Mundo mundo, double money) {
        super(nome, idade, peso, altura, nacionalidade, dano, sorte, habilidade, mundo, money);
    }

    @Override
    public String nomeDoMundo() {
        return mundo.getNome();
    }

    @Override
    public double BonusDeDano() {
        return this.dano * BONUS_DE_DANO;
    }


    @Override
    public double BonusDeSorte() {
        return this.dano * BONUS_DE_SORTE;
    }

    public static String getVazio() {
        return vazio;
    }

    public static void setVazio(String vazio) {
        Kel.vazio = vazio;
    }
}






































/*
    public Mat(String nome, int idade, String altura, double peso, Habilidade habilidade) {
        super(nome, idade, altura, peso, habilidade);
    }

    @Override
    public void voceGostaDaqui() {
        System.out.print("Sim :D.... É meme, caramba ");
    }

    @Override
    public void bemvindo() {
        super.bemvindo();
    }

    @Override
    public String toString() {
        return super.toString();
    }

 */