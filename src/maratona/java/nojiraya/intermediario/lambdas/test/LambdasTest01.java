package maratona.java.nojiraya.intermediario.lambdas.test;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.function.Consumer;

public class LambdasTest01 {
    public static void main(String[] args) {
        List<String> nomes = List.of("William", "Luffy", "Zoro");
        List<Integer> nums = List.of(1,2,3,4,5,6);
        forEach(nomes, s -> System.out.println(s));
        forEach(nums, s -> System.out.println(s));
    }

    private static <T> void forEach(List<T> list, Consumer<T> cons){
        for (T elem : list) {
            cons.accept(elem);
        }

    }
}
