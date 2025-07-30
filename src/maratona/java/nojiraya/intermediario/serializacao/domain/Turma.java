package maratona.java.nojiraya.intermediario.serializacao.domain;

import java.util.Arrays;

public class Turma {
    private String nome;
    private Aluno[] alunos;

    public Turma(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "nome='" + nome + '\'' +
                ", alunos=" + Arrays.toString(alunos) +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
