package maratona.java.nojiraya.intermediario.gassociacao.dominio;

public class Seminario {
    private String titulo;
    private Seminario seminario;
    private Aluno[] alunos;
    private Prof professor;
    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Aluno[] alunos, Seminario seminario) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.seminario = seminario;
    }

    public Seminario(String titulo, Aluno[] alunos, Prof professor, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.professor = professor;
        this.local = local;
    }

    public void imprimir(){
        System.out.println("Nome do Seminário " + this.titulo);
        if(professor == null){
            return;
        } else{
            System.out.println("Professor: " + professor.getNome());
        }
        if(local != null) System.out.println("Local da Apresentação: " + local.getEndereco());
        if(alunos != null) for(Aluno aluno : alunos){
            System.out.println("Alunos participantes: " + aluno.getNome());
        }

    }


    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Prof getProfessor() {
        return professor;
    }

    public void setProfessor(Prof professor) {
        this.professor = professor;
    }
}
