package maratona.java.nojiraya.intermediario.generics.servico;

import maratona.java.nojiraya.intermediario.generics.domain.Carro;

import java.util.*;

public class RentavelService<T> {
    private List<T> veiculosDisponiveis;

    public RentavelService(List<T> veiculosDisponiveis) {
        this.veiculosDisponiveis = veiculosDisponiveis;
    }
    public T vendoObjetoDisponiveis(){
        System.out.println("Pesquisando veiculos disponiveis...");
        T t = veiculosDisponiveis.remove(0);
        System.out.println("Veiculos Disponiveis");
        System.out.println(veiculosDisponiveis);

        return t;
    }

    public void devolvendoVeiculo(T t){
        System.out.println("------------------------------------------");
        System.out.println("Devolvendo " +t);
        veiculosDisponiveis.add(t);
        System.out.println("Carros Disponiveis");
        System.out.println(veiculosDisponiveis);
    }
}

