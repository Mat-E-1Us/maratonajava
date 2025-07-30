package maratona.java.nojiraya.intermediario.generics.servico;

import maratona.java.nojiraya.intermediario.generics.domain.Barco;
import maratona.java.nojiraya.intermediario.generics.domain.Carro;

import java.util.*;

class SorteandoBarco implements Comparator<Barco>{

    @Override
    public int compare(Barco o1, Barco o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}


public class BarcoRentavelService {
  private Queue<Barco> barcos = new PriorityQueue<>(new SorteandoBarco());


  public Barco vendoBarcosDisponiveis(){
      barcos.add(new Barco("Iate"));
      barcos.add(new Barco("Lancha"));
      barcos.add(new Barco("Caravela"));
      barcos.add(new Barco("Canoa"));
      System.out.println("Pesquisando barcos disponiveis...");
      Barco barquinho = barcos.poll();
      System.out.println("Barcos Disponiveis");
      System.out.println(barcos);

      return barquinho;
  }

  public void devolvendoBarco(Barco barco){
      System.out.println("------------------------------------------");
      System.out.println("Devolvendo " +barco);
      barcos.add(barco);
      System.out.println("Barcos Disponiveis");
      System.out.println(barcos);
  }
}

