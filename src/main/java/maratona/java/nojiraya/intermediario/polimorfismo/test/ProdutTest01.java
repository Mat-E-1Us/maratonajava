package maratona.java.nojiraya.intermediario.polimorfismo.test;

import maratona.java.nojiraya.intermediario.polimorfismo.dominio.Computador;
import maratona.java.nojiraya.intermediario.polimorfismo.dominio.Televisao;
import maratona.java.nojiraya.intermediario.polimorfismo.dominio.Tomate;
import maratona.java.nojiraya.intermediario.polimorfismo.servico.CalculadoraImposto;

public class ProdutTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("UNION",  3000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        Televisao tv = new Televisao("LG", 5000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("---------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------------------------");
        CalculadoraImposto.calcularImposto(tv);
        System.out.println("---------------------------");

//        CalculadoraImposto.calcularImpostoComputador(computador);
//        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
