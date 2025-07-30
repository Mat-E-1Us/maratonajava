package maratona.java.nojiraya.intermediario.polimorfismo.test;

import maratona.java.nojiraya.intermediario.polimorfismo.dominio.Computador;
import maratona.java.nojiraya.intermediario.polimorfismo.dominio.Produto;
import maratona.java.nojiraya.intermediario.polimorfismo.dominio.Tomate;

public class ProdutTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Positivco", 4000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularimposto());
        System.out.println("-------------");


        Produto produto02 = new Tomate("Solto", 20);
        System.out.println(produto02.getNome());
        System.out.println(produto02.getValor());
        System.out.println(produto02.calcularimposto());
        System.out.println(produto02.calcularimposto());
        System.out.println("-------------");

    }
}
