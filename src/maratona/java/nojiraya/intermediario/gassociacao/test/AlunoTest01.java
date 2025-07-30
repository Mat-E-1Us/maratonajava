package maratona.java.nojiraya.intermediario.gassociacao.test;

import maratona.java.nojiraya.intermediario.gassociacao.dominio.Aluno;
import maratona.java.nojiraya.intermediario.gassociacao.dominio.Local;
import maratona.java.nojiraya.intermediario.gassociacao.dominio.Prof;
import maratona.java.nojiraya.intermediario.gassociacao.dominio.Seminario;

public class AlunoTest01 {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno("Mateus", 18);
        Aluno aluno02 = new Aluno("Will", 18);
        Aluno aluno03 = new Aluno("Joice", 18);
        Aluno aluno04 = new Aluno("Fábio", 18);
        Aluno aluno05 = new Aluno("Lucas", 18);
        Aluno aluno06 = new Aluno("Ana Beatriz", 18);
        Seminario seminario = new Seminario("Java - Virado no Jiraya");
        Aluno[] alunos02 = {aluno04, aluno05, aluno06};
        Prof professor = new Prof("Rod", "Javista");
        Local local = new Local("Ginásio do Centro Olímpico - Sobradinho");
        Seminario seminario02 = new Seminario("Barba Branca", alunos02, professor, local);



        Aluno[] alunos = {aluno01, aluno02, aluno03};

        Seminario[] seminarios = {seminario, seminario02};


        aluno01.setSeminario(seminario);
        aluno02.setSeminario(seminario);
        aluno03.setSeminario(seminario);

        aluno04.setSeminario(seminario02);
        aluno05.setSeminario(seminario02);
        aluno06.setSeminario(seminario02);

        seminario.setAlunos(alunos);

        seminario.setProfessor(professor);

        professor.setSeminarios(seminarios);

        seminario.setLocal(local);
        local.setSeminario(seminarios);


        seminario.imprimir();
        aluno01.imprimir();
        aluno02.imprimir();
        aluno03.imprimir();
        System.out.println("----------------------------");
        seminario02.imprimir();
        aluno04.imprimir();
        aluno05.imprimir();
        aluno06.imprimir();
        System.out.println("----------PROFESSOR DOS SEMINÁRIOS-------------");
        professor.imprimir();
        System.out.println("----------LOCAL DA APRESENTAÇÃO----------------");
        local.imprimir();
    }
}
