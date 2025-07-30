package maratona.java.nojiraya.intermediario.intrometodos.test;

import maratona.java.nojiraya.intermediario.intrometodos.dominio.Estudante;
import maratona.java.nojiraya.intermediario.intrometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante imprime = new ImpressoraEstudante();
        
        estudante01.nome = "Mat";
        estudante01.idade = 18;
        estudante01.sexo = 'M';
        
        estudante02.idade = 18;
        estudante02.nome = "Tam";
        estudante02.sexo = 'M';

        imprime.imprime(estudante01);
        imprime.imprime(estudante02);
    }
}
