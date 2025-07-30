package maratona.java.nojiraya.intermediario.heranca.test;

import maratona.java.nojiraya.intermediario.heranca.dominio.Endereco;
import maratona.java.nojiraya.intermediario.heranca.dominio.Funcionario;
import maratona.java.nojiraya.intermediario.heranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("902384-123");

        Pessoa pessoa = new Pessoa("Bah");
        pessoa.setCpf("09080980-09");
        pessoa.setEndereco(endereco);

        pessoa.imprimir();

        Funcionario funcionario = new Funcionario("Boh");
        funcionario.setCpf("0234092034923-12312");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(9012809.00);

        funcionario.imprimir();

    }
}
