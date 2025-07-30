package maratona.java.nojiraya.introducao;

public class Aula13 {
    public static void main(String[] args){
       int[] numb = {1,2,3,4,5,6,7,8,9};
/*
       for(int j = 0; j < numb.length; j++){
           System.out.println("Valores de numb: " + numb[j] + " e valores de j: " + j);
       }
*/
       for(int pos:numb){
           System.out.println(pos);
       }
    }
}
