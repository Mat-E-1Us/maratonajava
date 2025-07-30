package maratona.java.nojiraya.intermediario.polimorfismo.test;

import maratona.java.nojiraya.intermediario.polimorfismo.dominio.Computador;
import maratona.java.nojiraya.intermediario.polimorfismo.dominio.Produto;
import maratona.java.nojiraya.intermediario.polimorfismo.dominio.Tomate;
import maratona.java.nojiraya.intermediario.polimorfismo.servico.CalculadoraImposto;

public class ProdutTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Positivco", 4000);
        Tomate tomate = new Tomate("Solto", 20);
        tomate.setValidade("11/12/2021");
        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(produto);
    }
}
