package maratona.java.nojiraya.intermediario.introclasses.test;

import maratona.java.nojiraya.intermediario.introclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Joia";
        carro1.modelo = "Ferrari";
        carro1.ano = 1980;

        carro2.nome = "Beleza";
        carro2.modelo = "Ferrari";
        carro2.ano = 1979;

        System.out.println(carro1.nome + carro1.modelo + carro1.ano);
        System.out.println(carro2.nome + carro2.modelo + carro2.ano);

    }
}
