package maratona.java.nojiraya.intermediario.minostring.test;

public class StringTest02 {
    public static void main(String[] args) {
        //Métodos;

        String nome = "          Luffy Monkey                   ";
        String numeros = "012345";
        System.out.println(nome.charAt(1));
        System.out.println(nome.length());
        System.out.println(nome.replace("f", "l"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.substring(0, 2));
        System.out.println(nome.trim());
    }
}
