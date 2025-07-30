package maratona.java.nojiraya.intermediario.introducao;

public class Aula08 {
    public static void main(String[] args){
        byte diasDaSemana = 4;

                switch(diasDaSemana){
                    case 1, 7: System.out.println("Vai dormir");
                    break;
                    case 2, 3, 4, 5, 6: System.out.println("Vamo produzir");
                    break;
                    default:
                        System.out.println("Não existe");
                        break;
                }
    }
}
