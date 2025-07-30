package maratona.java.nojiraya.intermediario.intrometodos.test;

import maratona.java.nojiraya.intermediario.intrometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora divide = new Calculadora();

      double resultado =  divide.dividaDoisNumeros(20, 0);


        System.out.println(resultado);
    }
}
