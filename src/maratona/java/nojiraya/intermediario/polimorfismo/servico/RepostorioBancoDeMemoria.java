package maratona.java.nojiraya.intermediario.polimorfismo.servico;

import maratona.java.nojiraya.intermediario.polimorfismo.repositorio.Repositorio;

public class RepostorioBancoDeMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando na Memoria");
    }
}
