package maratona.java.nojiraya.intermediario.generics.test;

import maratona.java.nojiraya.intermediario.generics.domain.Carro;
import maratona.java.nojiraya.intermediario.generics.servico.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService service = new CarroRentavelService();
        Carro carro = service.vendoCarrosDisponiveis();
        service.devolvendoCarro(carro);
    }
}
