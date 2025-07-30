package maratona.java.nojiraya.intermediario.generics.test;

import maratona.java.nojiraya.intermediario.generics.domain.Barco;
import maratona.java.nojiraya.intermediario.generics.domain.Carro;
import maratona.java.nojiraya.intermediario.generics.servico.BarcoRentavelService;
import maratona.java.nojiraya.intermediario.generics.servico.CarroRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
     BarcoRentavelService service = new BarcoRentavelService();
        Barco barco = service.vendoBarcosDisponiveis();
        service.devolvendoBarco(barco);
    }
}
