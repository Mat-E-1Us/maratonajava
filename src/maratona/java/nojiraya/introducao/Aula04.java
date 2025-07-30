package maratona.java.nojiraya.introducao;

public class Aula04 {
    public static void main(String[] args) {
        //+ - / * %
        int numero01 = 10;
        int numero02 = 20;
        double resul = numero02 % numero01;
        System.out.println(resul);


        // < menor que  > maior que == comparar  != diferente

        //Operadores Lógicos
        //&& (AND) || (or) !
        int isDezMaiorQueVinte = 0;
        boolean verd = true;
        boolean fal = false;

        while (isDezMaiorQueVinte <= 99) {
            if (isDezMaiorQueVinte % 2 == 0) {
                System.out.println(isDezMaiorQueVinte + " é par");
            } else {
                System.out.println(isDezMaiorQueVinte + " é ímpar");
            }
            isDezMaiorQueVinte++;
        }
        // ++ && --

        int numb = 87;
        int numb2 = 100;
        char letra = 87;

        if (numb == letra) {
            System.out.println(letra + " é igual a " + numb);
        }

        if (numb != 1 && numb2 != 87 || numb <= 0 && numb2 == 111) {
            System.out.println(numb);
            ++numb;
            System.out.println(numb);
        }

        //---------------------------------------

        for(int nt = 1000000; nt > 1; nt /= 2){
            System.out.println(nt);
        }

    }
}
