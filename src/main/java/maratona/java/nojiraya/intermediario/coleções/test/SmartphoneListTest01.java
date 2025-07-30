package maratona.java.nojiraya.intermediario.coleções.test;

import maratona.java.nojiraya.intermediario.coleções.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("12345", "Samsung");
        Smartphone s2 = new Smartphone("54321", "Iphone");
        Smartphone s3 = new Smartphone("25431", "LG");


        List<Smartphone> smartphones = new ArrayList<>();
                smartphones.add(s1);
                smartphones.add(s2);
                smartphones.add(s3);

                for(Smartphone celular : smartphones){
                    System.out.println(celular.toString());
                }
                Smartphone s4 = new Smartphone("25431", "LG");
        System.out.println(smartphones.contains(s4));
    }
}
