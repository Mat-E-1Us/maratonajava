package maratona.java.nojiraya.intermediario.lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdasTest02 {
    public static void main(String[] args) {
        List<String> natsu = List.of("Natsu", "Baiacu");
        map(natsu, String::length).forEach(System.out::println);
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function){
            List<R> result = new ArrayList<>();
            for (T e :list){
                R apply = function.apply(e);
                result.add(apply);
            }

            return result;
    }
}
