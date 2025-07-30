package maratona.java.nojiraya.intermediario.modificadorstatic.test;

import maratona.java.nojiraya.intermediario.modificadorstatic.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args){
        Carro c1 = new Carro(280, 250, "Kachaum");
        Carro c2 = new Carro(320, 250, "Vrum");
        Carro c3 = new Carro(1000, 250, "Brow");

        Carro.setVelocidadeLimit(180);

    }



}
