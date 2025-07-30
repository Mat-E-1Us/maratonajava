package maratona.java.nojiraya.intermediario.coleções.test;

import maratona.java.nojiraya.intermediario.coleções.domain.Consumidor;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class sorteandoPorNome implements Comparator<Consumidor>{

    @Override
    public int compare(Consumidor o1, Consumidor o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}


public class QueueTest02 {
    public static void main(String[] args) {
        Consumidor consu = new Consumidor("Will");
        Queue<Consumidor> c = new PriorityQueue<>();
        c.add(consu);
        System.out.println(c);
    }
}
