package maratona.java.nojiraya.intermediario.introclasses.test;

import maratona.java.nojiraya.intermediario.introclasses.dominio.Terco;

public class TerçoTest {
    public static void main(String[] args) {
        Terco terco0 = new Terco();
        Terco terco1 = new Terco();
        Terco terco2 = new Terco();
        Terco terco3 = new Terco();


        terco0.misterios = "doloros";
        terco0.numeroDeAveMarias = 43;
        terco0.numeroDeGlorias = 6;
        terco0.numeroDePaiNossos = 6;

        terco1.misterios = "gozosos";
        terco1.numeroDeAveMarias = 43;
        terco1.numeroDeGlorias = 6;
        terco1.numeroDePaiNossos = 6;

        terco2.misterios = "gloriosos";
        terco2.numeroDeAveMarias = 43;
        terco2.numeroDeGlorias = 6;
        terco2.numeroDePaiNossos = 6;

        terco3.misterios = "luminosos";
        terco3.numeroDeAveMarias = 43;
        terco3.numeroDeGlorias = 6;
        terco3.numeroDePaiNossos = 6;

        System.out.println("Mistérios " + terco0.misterios + " possui " + terco0.numeroDeAveMarias + " Ave Marias, " + terco0.numeroDePaiNossos + "Pai Nosso e " + terco0.numeroDeGlorias + " Glórias.");
        System.out.println("Mistérios " + terco1.misterios + " possui " + terco1.numeroDeAveMarias + " Ave Marias, " + terco1.numeroDePaiNossos + "Pai Nosso e " + terco1.numeroDeGlorias + " Glórias.");
        System.out.println("Mistérios " + terco2.misterios + " possui " + terco2.numeroDeAveMarias + " Ave Marias, " + terco2.numeroDePaiNossos + "Pai Nosso e " + terco2.numeroDeGlorias + " Glórias.");
        System.out.println("Mistérios " + terco3.misterios + " possui " + terco3.numeroDeAveMarias + " Ave Marias, " + terco3.numeroDePaiNossos + "Pai Nosso e " + terco3.numeroDeGlorias + " Glórias.");

    }
}
