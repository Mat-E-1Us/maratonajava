package maratona.java.nojiraya.intermediario.coleções.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "teclado");
        map.put(2, "mouse");
        map.put(3, "piano");
        map.putIfAbsent(5, "piano tiles");

        System.out.println("---------------------------");



            for(Map.Entry<Integer, String> entrada : map.entrySet()){
                System.out.println(entrada.getKey() + " - " + entrada.getValue());
            }
            System.out.println("---------------------------");
        }
    }

