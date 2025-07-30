package maratona.java.nojiraya.intermediario.coleções.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();

        fila.add("D");
        fila.add("F");
        fila.add("J");

        while(fila.isEmpty()){
            System.out.println(fila.poll());
        }
    }
}
