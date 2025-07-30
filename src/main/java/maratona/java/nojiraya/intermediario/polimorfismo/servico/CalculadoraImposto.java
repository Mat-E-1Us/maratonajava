package maratona.java.nojiraya.intermediario.polimorfismo.servico;

import maratona.java.nojiraya.intermediario.polimorfismo.dominio.Computador;
import maratona.java.nojiraya.intermediario.polimorfismo.dominio.Produto;
import maratona.java.nojiraya.intermediario.polimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        System.out.println("Relatório do Produto");
        double imposto = produto.calcularimposto();
        System.out.println("Nome do Produto: " + produto.getNome());
        System.out.println("Valor do Produto: " + produto.getValor());
        System.out.println("Imposto do Produto: " + imposto);
        if(produto instanceof Tomate){
           // Tomate tomate = (Tomate) produto - mesma funcionalidade do que está abaixo;
           // String dataValidade = ((Tomate) produto).getValidade() - mesma funcionalidade do que está abaixo;

            System.out.println(((Tomate) produto).getValidade());
        }

    }
}
