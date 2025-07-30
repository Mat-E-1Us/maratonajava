package maratona.java.nojiraya.intermediario.intrometodos.test;

import maratona.java.nojiraya.intermediario.intrometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Sunny";
        estudante01.idade = 17;
        estudante01.sexo = 'M';

        estudante02.nome = "Aubreay";
        estudante02.idade = 17;
        estudante02.sexo = 'F';

        estudante01.imprimir();
        estudante02.imprimir();
    }
}
