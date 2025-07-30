package maratona.java.nojiraya.relembrando.domain;

public class Funcionario extends Pessoa{
    private double salario;
    Empresa empresa;

    public Funcionario(String nome, int idade, String endereco, String cpf, String rg, double salario, Empresa empresa) {
        super(nome, idade, endereco, cpf, rg);
        this.salario = salario;
        this.empresa = empresa;
    }

    public Funcionario(String nome, int idade, String endereco, String cpf, String rg, Empresa empresa) {
        super(nome, idade, endereco, cpf, rg);
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "salario=" + salario +
                ", empresa=" + empresa.getNome() +
                '}';
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
