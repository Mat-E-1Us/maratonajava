package maratona.java.nojiraya.intermediario.abstrata.test;

import maratona.java.nojiraya.intermediario.abstrata.dominio.Desenvolvedor;
import maratona.java.nojiraya.intermediario.abstrata.dominio.Funcionario;
import maratona.java.nojiraya.intermediario.abstrata.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Zoro", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Sanji", 4900);
        System.out.println(gerente.toString());
        System.out.println(desenvolvedor.toString());
    }
}
