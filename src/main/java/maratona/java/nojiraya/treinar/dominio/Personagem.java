package maratona.java.nojiraya.treinar.dominio;

import java.text.Format;
import java.util.Locale;
import java.util.Objects;

public abstract class Personagem implements Bonus, Comparable<Personagem>{
    protected String nome;
    protected int idade;
    protected double peso;
    protected double altura;
    protected Locale nacionalidade;
    protected double dano;
    protected int sorte;
    private Habilidade habilidade;
    protected Mundo mundo;
    protected double money;



    public Personagem(String nome, int idade, double peso, double altura, Locale nacionalidade, double dano, int sorte, Habilidade habilidade, Mundo mundo, double money) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.nacionalidade = nacionalidade;
        this.dano = dano;
        this.sorte = sorte;
        this.habilidade = habilidade;
        this.mundo = mundo;
        this.money = money;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", peso=" + peso +
                ", altura=" + altura +
                ", nacionalidade=" + nacionalidade +
                ", dano=" + dano +
                ", sorte=" + sorte +
                ", habilidade=" + habilidade +
                ", mundo=" + mundo.getNome() +
                ", money=" + money +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personagem that = (Personagem) o;
        return idade == that.idade && Double.compare(peso, that.peso) == 0 && Double.compare(altura, that.altura) == 0 && Double.compare(dano, that.dano) == 0 && sorte == that.sorte && Double.compare(money, that.money) == 0 && Objects.equals(nome, that.nome) && Objects.equals(nacionalidade, that.nacionalidade) && habilidade == that.habilidade && Objects.equals(mundo, that.mundo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, peso, altura, nacionalidade, dano, sorte, habilidade, mundo, money);
    }

    @Override
    public String nomeDoMundo() {
        return mundo.getNome();
    }

    public Locale getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(Locale nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Mundo getMundo() {
        return mundo;
    }

    public void setMundo(Mundo mundo) {
        this.mundo = mundo;
    }

    public Habilidade getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(Habilidade habilidade) {
        this.habilidade = habilidade;
    }

    public int getSorte() {
        return sorte;
    }

    public void setSorte(int sorte) {
        this.sorte = sorte;
    }

    public double getDano() {
        return dano;
    }

    public void setDano(double dano) {
        this.dano = dano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public int compareTo(Personagem o) {
        return Double.valueOf(dano).compareTo(o.getDano());
    }
}











































   /* private String nome;
    private int idade;
    private String altura;
    private double peso;
    private Mundo mundo;
    public static final String JOGO_OMORI = "OMORI";
    private Habilidade habilidade;

    public Personagem(String nome, int idade, String altura, double peso, Habilidade habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.habilidade = habilidade;
    }

    public void bemvindo(){
        System.out.print("BEM-VINDO: ");
    }

    public abstract void voceGostaDaqui();

    @Override
    public String toString() {
        voceGostaDaqui();
        bemvindo();
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura='" + altura + '\'' +
                ", peso=" + peso + " Jogo= " + Personagem.JOGO_OMORI + "Habilidade= {" + habilidade.NOME_DA_HABILIDADE +
                '}';
    }

//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public int getIdade() {
//        return idade;
//    }
//
//    public void setIdade(int idade) {
//        this.idade = idade;
//    }
//
//    public String getAltura() {
//        return altura;
//    }
//
//    public void setAltura(String altura) {
//        this.altura = altura;
//    }
//
//    public double getPeso() {
//        return peso;
//    }
//
//    public void setPeso(double peso) {
//        this.peso = peso;
//    }
*/