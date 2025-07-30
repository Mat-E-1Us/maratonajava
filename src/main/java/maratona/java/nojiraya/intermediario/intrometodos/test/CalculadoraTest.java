package maratona.java.nojiraya.intermediario.intrometodos.test;

import maratona.java.nojiraya.intermediario.intrometodos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
    Calculadora soma = new Calculadora();
    Calculadora subtrai = new Calculadora();
    Calculadora multip = new Calculadora();


    soma.somaDoisNumeros();
    subtrai.subtraiDoisNumeros();
    multip.multiplicaDisNumeros(312, 31);
        System.out.println("Finalizando CalculadoraTest1");
    }
}
