package maratona.java.nojiraya.intermediario.relembrando.domain;

import maratona.java.nojiraya.relembrando.domain.Empresa;
import maratona.java.nojiraya.relembrando.domain.Pessoa;

public class Funcionario extends Pessoa {
    private double salario;
    maratona.java.nojiraya.relembrando.domain.Empresa empresa;

    public Funcionario(String nome, int idade, String endereco, String cpf, String rg, double salario, maratona.java.nojiraya.relembrando.domain.Empresa empresa) {
        super(nome, idade, endereco, cpf, rg);
        this.salario = salario;
        this.empresa = empresa;
    }

    public Funcionario(String nome, int idade, String endereco, String cpf, String rg, maratona.java.nojiraya.relembrando.domain.Empresa empresa) {
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

    public maratona.java.nojiraya.relembrando.domain.Empresa getEmpresa() {
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
