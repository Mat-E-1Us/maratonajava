package maratona.java.nojiraya.intermediario.polimorfismo.servico;

import maratona.java.nojiraya.intermediario.polimorfismo.repositorio.Repositorio;

public class RepostorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no Banco de Dados");
    }
}
