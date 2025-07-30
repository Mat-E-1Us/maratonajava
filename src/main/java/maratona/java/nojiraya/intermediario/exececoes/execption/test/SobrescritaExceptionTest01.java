package maratona.java.nojiraya.intermediario.exececoes.execption.test;

import maratona.java.nojiraya.intermediario.exececoes.execption.dominio.Funcionario;
import maratona.java.nojiraya.intermediario.exececoes.execption.dominio.LoginInvalidoException;
import maratona.java.nojiraya.intermediario.exececoes.execption.dominio.Pessoa;

public class SobrescritaExceptionTest01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        Pessoa pessoa = new Pessoa();

        try {
            funcionario01.salvar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }
}
