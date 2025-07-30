package maratona.java.nojiraya.introducao;

public class Aula09 {
    public static void main(String[] args){
/*
        int cont1 = 0;

        while (cont1 <= 1000) {
            if (cont1 % 2 == 0) {
                System.out.println("Par: " + cont1);
            }else{
                System.out.println("Ímpar: " + cont1);
            }
            cont1++;
        }
*/



        /*do while
        int cont2= 0;
        do{
            if(cont2 % 2 == 0){
                System.out.println("Par: " + cont2);
            } else {
                System.out.println("ímpar: " + cont2);
            }
            cont2++;
        } while (cont2 <= 1000);
    */

    //for
        int ale = 50;
        for(int cont3 = 0; cont3<= 50; cont3++){
              if(cont3 > 25){
                  break;
              } else {
                  System.out.println(cont3);
              }

        }


/*
        int cont = 1;
        while (cont <= 10) {
            System.out.println(cont++);
        }

        //do while
        int cont2 = 1;
        do {
            System.out.println(cont2++);
        } while (cont2 <=11);

        //for

        for(int cont3 = 1; cont3<=12; cont3++) {
            System.out.println(cont3);
        }
        */
    }
}
