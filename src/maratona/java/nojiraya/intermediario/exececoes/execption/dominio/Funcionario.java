package maratona.java.nojiraya.intermediario.exececoes.execption.dominio;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{


    public void salvar() throws LoginInvalidoException{
        System.out.println("Login Invalido");
    }
}
