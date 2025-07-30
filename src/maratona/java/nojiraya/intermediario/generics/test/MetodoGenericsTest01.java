package maratona.java.nojiraya.intermediario.generics.test;

import maratona.java.nojiraya.intermediario.generics.domain.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericsTest01 {
    public static void main(String[] args) {
        criarArrayComUmObjeto(new Barco("Canoa"));
    }

    private static <T> List<T> criarArrayComUmObjeto(T t){
        List<T> list = List.of(t);

        return list;
    }

//    private static <T> List<T extends Comparable<T>> criarArrayComUmObjeto(T t){
//        List<T> list = List.of(t);
//
//        return list;
//    }

}
