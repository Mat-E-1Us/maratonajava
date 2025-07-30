package maratona.java.nojiraya.intermediario.intrometodos.dominio;

public class Calculadora {
    //Metodo
    public void somaDoisNumeros(){
        System.out.println(10+10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(10-10);
    }

    public void multiplicaDisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public double dividaDoisNumeros(double num1, double num2){
            if(num2 == 0){
                return 0;
            } else{
                return num1/num2;
            }
    }

    public void alteraDoisNumeros(int num1, int num2){
        System.out.println("num1 recebido do parametro " + num1);
        System.out.println("num2 recebido do parametro " + num2);
        num1 = 99;
        num2 = 33;
        System.out.println("--------------------------------------------------------");
        System.out.println("num1 depois de trocar o valor dentro do método " + num1);
        System.out.println("num2 depois de trocar o valor dentro do método " + num2);
        System.out.println("--------------------------------------------------------");
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("num1 dentro do método " + num1);
        System.out.println("num2 dentro do método " + num2);

    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for(int tnum : numeros){
            soma+= tnum;
            System.out.println(soma);
        }
    }
//ArrayVarArgs - tem que ser usado por último se tiver mais de 1 parâmetro
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for(int tnum : numeros){
            soma+= tnum;
            System.out.println(soma);
        }
    }
}


