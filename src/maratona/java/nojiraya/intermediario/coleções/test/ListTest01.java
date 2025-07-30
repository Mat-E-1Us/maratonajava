package maratona.java.nojiraya.intermediario.coleções.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nome = new ArrayList(16); // 1.4
        nome.add("2");
        List<String> nome2 = new ArrayList(10); // 1.4
        nome.add("23");
        nome.add("BAH");
        nome.add("CHE");

        nome.addAll(nome2);
        nome.add("JHFN");
        for(int i = 0; i < 10; i++){
            nome.add("Su");
            System.out.println(nome);
        }
    }
}
