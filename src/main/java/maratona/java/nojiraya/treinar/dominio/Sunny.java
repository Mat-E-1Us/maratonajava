package maratona.java.nojiraya.treinar.dominio;

import java.util.Locale;

public class Sunny extends Personagem{
    public final double BONUS_DE_DANO = 0.05;
    public final double BONUS_DE_SORTE = 0.7;
    private static String vazio = "Real";

    public Sunny(String nome, int idade, double peso, double altura, Locale nacionalidade, double dano, int sorte, Habilidade habilidade, Mundo mundo, double money) {
        super(nome, idade, peso, altura, nacionalidade, dano, sorte, habilidade, mundo, money);
    }

    @Override
    public String nomeDoMundo() {
        if (mundo == null) {
            return null;
        } else {
            return mundo.getNome();
        }
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
        Sunny.vazio = vazio;
    }
}




























   /* private String arma;



    public Sunny(String nome, int idade, String altura, double peso, Habilidade habilidade, String arma) {
        super(nome, idade, altura, peso, habilidade);
        this.arma = arma;
    }

    @Override
    public void voceGostaDaqui() {
        System.out.print("Não... TÔ DE MEME, MEU CHEGADO ");
    }

    @Override
    public void bemvindo() {
        super.bemvindo();
    }

    @Override
    public String toString() {
        return super.toString() + " Sunny{" +
                "arma='" + arma + '\'' +
                '}';
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }*/
