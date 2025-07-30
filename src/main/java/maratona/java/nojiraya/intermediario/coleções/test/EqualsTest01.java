package maratona.java.nojiraya.intermediario.coleções.test;

import maratona.java.nojiraya.intermediario.coleções.domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone samsung = new Smartphone("12345", "samsung");
        Smartphone samsung2 = new Smartphone("12345", "samsung");
        String[] pessoas = {"Alex", "Dirk"};
        System.out.println(samsung.equals(samsung2));
        System.out.println(pessoas.hashCode());
        System.out.println(pessoas.equals(2043454));


    }
}
