package maratona.java.nojiraya.intermediario.introducao;

public class Aula02 {
    public static void main(String[] args) {
        //Tipos primitivos
        int forçar = (int) 1000000000000000L;
        int idade = 100;
        long numeroGrande = 100000;
        double salarioDouble = 2000.10;
        float salarioFloat =2500.0F;
        byte idadeByte = 10; //-127,-128
        short idadeShort = 10; //
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 40;
        //classe String
        String nome = "É um grande texto";

        while(idade >= 99){
        System.out.println("Os valores são : " + "|" + numeroGrande + "|" + salarioFloat + "|" + salarioDouble+ "|" + idadeByte+ "|" + idadeShort+ "|" + verdadeiro+ "|" + falso+ "|" + caractere+ "|" );
        idade = idade - 1;
    }

    System.out.println("tipos primitivos");
    System.out.println("letra minúscula: int, double, float, char, byte, short, long, boolean");
        System.out.println(nome);
    }


}
