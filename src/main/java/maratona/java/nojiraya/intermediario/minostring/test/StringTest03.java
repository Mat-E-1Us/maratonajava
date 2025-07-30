package maratona.java.nojiraya.intermediario.minostring.test;

public class StringTest03 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(30000);
        long gim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String " + (gim - inicio) + "ms");
        System.out.println("-------------------------------------------------------");
        inicio = System.currentTimeMillis();
        concatStringBuilder(300000);
        gim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder " + (gim - inicio) + "ms");
    }

    private static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder texto = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            texto.append(i);
        }
    }
}
