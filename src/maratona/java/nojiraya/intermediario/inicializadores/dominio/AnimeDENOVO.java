package maratona.java.nojiraya.intermediario.inicializadores.dominio;

public class AnimeDENOVO {
    private String nome;
    private int[] episodios;

    //1- Cria os atributos
    //2- Inicializa os valores desses atributos
    //3-Bloco de inicialização
    //4-Construtor é executado
    {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public AnimeDENOVO(String nome) {
        this.nome = nome;
    }

    public AnimeDENOVO() {

        for (int pos : episodios) {
            System.out.print(pos + " ");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
}






























   /*
    private String nome;

    private int[] episodios;
    //Bloco de inicialização
    {
        System.out.println("Bloco de inicialização");
        episodios = new int[100];
        for(int num = 0; num < episodios.length; num++){
            episodios[num] = num + 1;
        }
    }

    public AnimeDENOVO(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public AnimeDENOVO() {
        for(int pos : this.episodios){
            System.out.println(pos + " ");
        }


    }
    */

