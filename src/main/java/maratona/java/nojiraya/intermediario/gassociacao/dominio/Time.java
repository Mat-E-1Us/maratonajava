package maratona.java.nojiraya.intermediario.gassociacao.dominio;

public class Time {
    private String nome;
    private Time time;
    private Jogador[] jogadores;


    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Time time, Jogador[] jogadores) {
        this.nome = nome;
        this.time = time;
        this.jogadores = jogadores;
    }


    public void imprimir(){
        System.out.println(this.nome);
        if(jogadores == null) return;
        for (Jogador jogador : jogadores){
            System.out.println(jogador.getNome());
        }
    }


    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
