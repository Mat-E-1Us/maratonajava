package maratona.java.nojiraya.intermediario.generics.test;

import maratona.java.nojiraya.intermediario.generics.domain.Barco;
import maratona.java.nojiraya.intermediario.generics.domain.Carro;
import maratona.java.nojiraya.intermediario.generics.servico.RentavelService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fiat Uno de Escada")));
        List<Barco> barcos = new ArrayList<>(List.of(new Barco("Iate"), new Barco("Titanic")));
        RentavelService<Carro> serviceCarro = new RentavelService<>(carros);
        RentavelService<Barco> serviceBarco = new RentavelService<>(barcos);
        Carro carro = serviceCarro.vendoObjetoDisponiveis();
        serviceCarro.devolvendoVeiculo(carro);
        System.out.println("-------------------------------------------------");
        Barco barco = serviceBarco.vendoObjetoDisponiveis();
        serviceBarco.devolvendoVeiculo(barco);
    }
}
