package maratona.java.nojiraya.intermediario.exececoes.runtime.teste;

public class RunTimeTest02 {
    public static void main(String[] args){

        System.out.println(divisao(21, 0));
        System.out.println("Código Finalizado.");

    }

    private static int divisao(int a, int b) {
        if(b == 0){
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }
        return a/b;
    }
}
