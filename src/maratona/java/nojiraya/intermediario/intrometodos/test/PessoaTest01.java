package maratona.java.nojiraya.intermediario.intrometodos.test;

import maratona.java.nojiraya.intermediario.intrometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Mateus");
        pessoa.setIdade(18);
        //pessoa.imp();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}
