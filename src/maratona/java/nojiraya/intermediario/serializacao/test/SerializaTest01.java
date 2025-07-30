package maratona.java.nojiraya.intermediario.serializacao.test;

import maratona.java.nojiraya.intermediario.serializacao.domain.Aluno;
import maratona.java.nojiraya.intermediario.serializacao.domain.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SerializaTest01 {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno("123456", "Bipo", 1L);
        Turma turma = new Turma("Turma do estou estudando no JavaViradoNoJiraya");
        serializar(aluno01);
        deserializar();
    }

    private static void serializar(Aluno aluno) {
        Path alunoSerializado = Path.of("pasta/aluno.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(alunoSerializado));) {
            oos.writeObject(aluno);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void deserializar() {
        Path alunoDeserializado = Path.of("pasta/aluno.ser");
        try (ObjectInputStream oos = new ObjectInputStream(Files.newInputStream(alunoDeserializado))) {
            Aluno aluno = (Aluno) oos.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}