package maratona.java.nojiraya.introducao;

public class Aula10 {
    public static void main(String[] args){
        double carro = 40000;
        for(int parcela = 1; parcela <= carro; parcela++){
            double valorP = carro / parcela;
            if(valorP < 1000){
                break;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorP);
        }

    }
}
