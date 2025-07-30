package maratona.java.nojiraya.intermediario.intrometodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public void imprimir(){
        String st = "";
        for(int ast = 0; ast < 5; ast++){
            st += "*";
            System.out.println(st);
        }
        System.out.println("------------------------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
