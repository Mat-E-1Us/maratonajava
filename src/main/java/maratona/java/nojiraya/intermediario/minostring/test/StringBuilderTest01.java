package maratona.java.nojiraya.intermediario.minostring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "William Suane";
        nome.concat(" DevDojo");
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("William Suane");
        sb.append(" DevDojo").append(" Virado no Jiraya");
        sb.reverse();
        sb.deleteCharAt(5);
        sb.repeat("    ☼-        ", 10);
        sb.reverse();
        sb.trimToSize();
        System.out.println(sb);

    }
}
