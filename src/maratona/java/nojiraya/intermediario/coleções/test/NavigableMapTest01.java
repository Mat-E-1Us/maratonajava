package maratona.java.nojiraya.intermediario.coleções.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "Letra A");
        map.put("D", "Letra D");
        map.put("C", "Letra C");
        map.put("B", "Letra B");

        for(Map.Entry<String, String> entrada : map.entrySet()){
            System.out.println(entrada.getKey() + " - " + entrada.getValue());
        }

        System.out.println(map.headMap("C", true));
    }
}

