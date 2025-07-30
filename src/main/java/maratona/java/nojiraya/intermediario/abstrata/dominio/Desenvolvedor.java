package maratona.java.nojiraya.intermediario.abstrata.dominio;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }



    @Override
    public void calcBonus() {
        this.salario = salario + salario * 0.8;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
