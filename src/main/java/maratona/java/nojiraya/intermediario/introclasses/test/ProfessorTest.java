package maratona.java.nojiraya.intermediario.introclasses.test;

import maratona.java.nojiraya.intermediario.introclasses.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Nilton";
        professor.idade = 39;
        professor.sexo = 'M';

        System.out.println("O professor " + professor.nome + " tem " + professor.idade + " anos e é do sexo " + professor.sexo);
    }
}
