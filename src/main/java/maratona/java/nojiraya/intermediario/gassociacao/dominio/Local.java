package maratona.java.nojiraya.intermediario.gassociacao.dominio;

public class Local {
    private String endereco;
    private Seminario[] seminarios;


    public Local(String endereco) {
        this.endereco = endereco;
    }

    public void imprimir(){
        System.out.println(this.endereco);
        System.out.println("Cursos inscritos");
        if(seminarios!= null) for(Seminario seminario : seminarios){
            System.out.println(seminario.getTitulo());
        }

    }


    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminario(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
