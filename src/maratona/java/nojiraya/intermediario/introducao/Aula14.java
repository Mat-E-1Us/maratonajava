package maratona.java.nojiraya.intermediario.introducao;

public class Aula14 {
    public static void main(String[] args) {
        //Array multidimensional
        //Ex: 1,2,3,4,5 = meses
        //31,28,31,30,29 = dias
        int[][] dias = {{1,2}, {4,2,3}};

        for(int[] posi : dias){
            System.out.print("-------------");
            for(int pos : posi){
                System.out.println(pos);
            }

        }

        }

    }

