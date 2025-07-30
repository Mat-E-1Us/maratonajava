package maratona.java.nojiraya.intermediario.intrometodos.dominio;

import org.w3c.dom.ls.LSOutput;

public class Revisao {
    //Classes     --       Coesão = Deixar o código com poucas funções, assim para não acumular vários atributos ou métodos dentro da classe.
    public int idade;
    public String nome;
    public char sexo;
    // Métodos
    public void somaDoisNumeros(){
        System.out.println(10+10);
    }
    // Com parâmetro
    public void multDosNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }
    //Com retorno
    public double dividDoisNumeros(double did1, double did2){
        double did = 10;
        if(did2 == 0){
            return 0;
        } else {
            return did1 / did2;
        }
    }
    //Tipos primitivos

    public void subDoisNumeros(int num1, int num2){
        num1 = 2;
        num2 = 10;
        System.out.println("Resultado");
        System.out.println(num1 - num2);
        System.out.println("------------------------------------------------");
        System.out.println("Dentro do Revisao: " + num1);
        System.out.println("Dentro do Revisao: " + num2);
        System.out.println("------------------------------------------------");

    }


}
