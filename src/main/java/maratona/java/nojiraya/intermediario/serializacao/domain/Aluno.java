package maratona.java.nojiraya.intermediario.serializacao.domain;

import java.io.*;

public class Aluno implements Serializable {

    @Serial
    private static final long serialVersionUID = -7824803313416319235L;
    private Long id;
    private String nome;
    private transient String password;
    private transient Turma turma;
    public Aluno(String password, String nome, Long id) {
        this.password = password;
        this.nome = nome;
        this.id = id;
    }

    private void writeObject(ObjectOutputStream oos){
        try{
            oos.defaultWriteObject();
            oos.writeUTF(turma.getNome());
        } catch(IOException e){
            throw new RuntimeException(e);
        }
    }

    private void readerObject(ObjectInputStream ois){
        try{
            ois.defaultReadObject();
            String nomeTurma = ois.readUTF();
            turma = new Turma(nomeTurma);

        } catch(IOException | ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }


    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ", turma=" + turma +
                '}';
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
