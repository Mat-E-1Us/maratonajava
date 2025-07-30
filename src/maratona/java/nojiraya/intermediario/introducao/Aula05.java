package maratona.java.nojiraya.intermediario.introducao;

public class Aula05 {
    public static void main(String[] args){
        //Operadores condicionais
        String nome = "Sunny";
        int idade = 17;
        char sexo = 'M';
        String cabelo = "Preto";
        double altura = 1.80;
        String familia = "Maat";

        String nome2 = "Aubraey";
        int idade2 = 17;
        char sexo2 = 'F';
        String cabelo2 = "Rosa";
        double altura2 = 1.78;
        String familia2 = "Sot";
        String resultado = nome == "Sunny" && idade == idade2 && sexo != sexo2 && cabelo == "Preto" && altura > 1.79 && familia =="Maat" ? nome + " pode ficar com a " + nome2 + (". Todo mundo quer isso em Omori ou Reverie.") : "Se saia, meu amigo.";

        System.out.println(resultado);
            // String condição = salario < 400 ? vou doar : não dou doar;





    }
}
