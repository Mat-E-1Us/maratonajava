package maratona.java.nojiraya.intermediario.minostring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "William"; //String constant pool
        String nome2 = "William"; //String constant pool
        String nome3 = new String("William");
        System.out.println(nome2 == nome3.intern());

        nome = nome.concat("Suane"); // nome+= "Suane
}
}
