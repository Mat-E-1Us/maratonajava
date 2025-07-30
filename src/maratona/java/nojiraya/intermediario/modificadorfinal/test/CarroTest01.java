package maratona.java.nojiraya.intermediario.modificadorfinal.test;

import maratona.java.nojiraya.intermediario.modificadorfinal.dominio.Carro;
import maratona.java.nojiraya.intermediario.modificadorfinal.dominio.Comprador;
import maratona.java.nojiraya.intermediario.modificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();

        carro01.setNome("OptimusPrime");
        carro01.COMPRADOR.setNome("Maat");

        Comprador caomprador = new Comprador();
        caomprador.setNome("Maaat");
        System.out.println(caomprador.getNome());


        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Giosad");
        ferrari.COMPRADOR.setNome("Tam");


        System.out.println(ferrari.toString());
    }
}
