package maratona.java.nojiraya.intermediario.generics.servico;

import maratona.java.nojiraya.intermediario.generics.domain.Barco;
import maratona.java.nojiraya.intermediario.generics.domain.Carro;

import java.util.*;

class SorteandoCarro implements Comparator<Carro> {

    @Override
    public int compare(Carro o1, Carro o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

public class CarroRentavelService {
    private Queue<Carro> carros = new PriorityQueue<>(new SorteandoCarro());


    public Carro vendoCarrosDisponiveis(){
        carros.add(new Carro("BMW"));
        carros.add(new Carro("Porche"));
        carros.add(new Carro("Ferrari"));
        carros.add(new Carro("Fiat Uno de escada"));
        System.out.println("Pesquisando carros disponiveis...");
        Carro carrinho = carros.poll();
        System.out.println("Carros Disponiveis");
        System.out.println(carros);

        return carrinho;
    }

    public void devolvendoCarro(Carro carro){
        System.out.println("------------------------------------------");
        System.out.println("Devolvendo " +carro);
        carros.add(carro);
        System.out.println("Carros Disponiveis");
        System.out.println(carros);
    }
}

