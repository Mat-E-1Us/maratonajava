package maratona.java.nojiraya.intermediario.polimorfismo.test;

import maratona.java.nojiraya.intermediario.polimorfismo.repositorio.Repositorio;
import maratona.java.nojiraya.intermediario.polimorfismo.servico.RepostorioBancoDeArquivo;
import maratona.java.nojiraya.intermediario.polimorfismo.servico.RepostorioBancoDeDados;
import maratona.java.nojiraya.intermediario.polimorfismo.servico.RepostorioBancoDeMemoria;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio= new RepostorioBancoDeMemoria();
        repositorio.salvar();

        List<String> list = new ArrayList<>();
    }
}
