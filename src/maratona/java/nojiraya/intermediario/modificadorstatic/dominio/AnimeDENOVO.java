package maratona.java.nojiraya.intermediario.modificadorstatic.dominio;

public class AnimeDENOVO {
    private String nome;
    private static int[] episodios;

    static {
        System.out.println("Bloco de inicialização estático");
        episodios = new int[100];
        for (int num = 0; num < episodios.length; num++) {
            episodios[num] = num + 1;
        }
    }


    public String getNome() {
        return this.nome;
    }

    public int[] getEpisodios() {
        return AnimeDENOVO.episodios;
    }

    public AnimeDENOVO() {
        for (int pos : AnimeDENOVO.episodios) {
            System.out.print(pos + " ");
        }
    }
}


/*
    public AnimeDENOVO() {
        System.out.println("Bloco de inicialização");
        AnimeDENOVO.episodios = new int[100];

        for(int num = 0; num < AnimeDENOVO.episodios.length; ++num) {
            AnimeDENOVO.episodios[num] = num + 1;
        }

        int[] var5 = AnimeDENOVO.episodios;
        int var2 = var5.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            int pos = var5[var3];
            System.out.println("" + pos + " ");
        }
*/































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

