package maratona.java.nojiraya.intermediario.heranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Dentro do bloco estático de funcionario 1");
    }

    {
        System.out.println("Bloco de inicialização não estático dentro de funcionario 2");
    }

    {
        System.out.println("Bloco de inicialização não estático dentro de funcionario 3");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de funcionário");
    }

    public void imprimir(){
        super.imprimir();
        System.out.println(this.salario);
    }

    public void relatorioDePagamento(){
        System.out.println("Eu " + this.nome + " Recebi o salario de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
