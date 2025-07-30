package maratona.java.nojiraya.intermediario.abstrata.dominio;

public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcBonus();
    }

    @Override
    public void imprime() {

    }

    public abstract void calcBonus();
}
