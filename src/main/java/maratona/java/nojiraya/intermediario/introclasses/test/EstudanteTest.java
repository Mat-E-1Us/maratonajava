package maratona.java.nojiraya.intermediario.introclasses.test;

import maratona.java.nojiraya.intermediario.introclasses.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Mateus";
        estudante.idade = 17;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        System.out.println(estudante);
    }
}
