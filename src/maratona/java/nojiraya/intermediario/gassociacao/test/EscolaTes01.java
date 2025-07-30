package maratona.java.nojiraya.intermediario.gassociacao.test;

import maratona.java.nojiraya.intermediario.gassociacao.dominio.Escola;
import maratona.java.nojiraya.intermediario.gassociacao.dominio.Professor;

public class EscolaTes01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Mat");
        Professor[] professores = {professor};

        Escola escola = new Escola("Fundação Bradesco", professores);

        escola.imprimir();
    }
}
