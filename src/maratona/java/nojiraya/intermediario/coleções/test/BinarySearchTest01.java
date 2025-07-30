package maratona.java.nojiraya.intermediario.coleções.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<String> nmes = new ArrayList<>();
        nmes.add("13");
        nmes.add("22");
        nmes.add("31");
        Collections.sort(nmes);

        System.out.println(Collections.binarySearch(nmes, "22"));
    }
}
