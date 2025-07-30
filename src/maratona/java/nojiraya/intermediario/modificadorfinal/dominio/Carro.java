package maratona.java.nojiraya.intermediario.modificadorfinal.dominio;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + this.nome + '\'' +
                ", COMPRADOR=" + COMPRADOR.getNome() +
                 ", VELOCIDADE LIMITE = "+ Carro.VELOCIDADE_LIMITE +'}';
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
