package maratona.java.nojiraya.intermediario.intrometodos.test;

import maratona.java.nojiraya.intermediario.intrometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora somaAr = new Calculadora();
        int[] numerros = {0,9,8,7,6,5,4,3,2,1};
        somaAr.somaArray(numerros);
        //varArgs - outra forma de passar arryas
        somaAr.somaVarArgs(0,9,8,7,6,5,4,3,2,1);
    }
}
