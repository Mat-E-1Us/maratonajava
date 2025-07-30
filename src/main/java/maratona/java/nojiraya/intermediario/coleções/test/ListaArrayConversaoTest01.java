package maratona.java.nojiraya.intermediario.coleções.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        Integer[] array = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));
        System.out.println("-------------------------");

        Integer[] numerosArray = {1,2,3};

        List<Integer> list = Arrays.asList(numerosArray);
        System.out.println(list);
        System.out.println("-------------------------");
        List<Integer> n2 = new ArrayList<>(Arrays.asList(numerosArray));
        n2.add(11);
        System.out.println(n2);
        System.out.println("-------------------------");
    }
}
