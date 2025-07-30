package maratona.java.nojiraya.intermediario.polimorfismo.servico;

import maratona.java.nojiraya.intermediario.polimorfismo.repositorio.Repositorio;

public class RepostorioBancoDeArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no Arquivo");
    }
}
