package maratona.java.nojiraya.intermediario.gassociacao.dominio;

public class Prof {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Prof(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Prof(String nome, String especialidade, Seminario[] seminarios) {
        this(nome, especialidade);
        this.seminarios = seminarios;
    }

    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Especialidade " + this.especialidade);
        System.out.println("---------Seminários Responsavéis---------");
        if(seminarios!= null) for(Seminario seminario : seminarios){
            System.out.println(seminario.getTitulo());


        }
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
