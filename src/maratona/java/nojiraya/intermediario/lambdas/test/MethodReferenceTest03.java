package maratona.java.nojiraya.intermediario.lambdas.test;

import maratona.java.nojiraya.intermediario.lambdas.dominio.Anime;
import maratona.java.nojiraya.intermediario.lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<String> nomes = new ArrayList<>(List.of("12", "34", "923"));
        List<Integer> num2 = new ArrayList<>();
        List<String> nome = new ArrayList<>(List.of("Brotopeira", "tvEstatica", "Coelho"));
//        num.sort(String::compareTo);
//        Function<String, Integer> numStringInteger = Integer::parseInt;
//
//        List<Integer> numeross = new ArrayList<>();
//        num.forEach((numero) -> numeross.add(numStringInteger.apply(numero)));
//        numeross.forEach(System.out::println);
//
//        BiPredicate<List<String>, String> checkName = List::contains;
//        System.out.println(checkName.test(nomes, "Brotopeira"));
        for(String nom : nomes){
            for(int i = 0; i < nom.length(); i++){
                num2.add(Integer.parseInt(String.valueOf(nom.charAt(i))));
            }
        }



        String n = "";
        int n2 = 0;
        if(num2 != null) num2.sort(Integer::compareTo);
        Integer n3 = 0;
        for(Integer numero : num2){
            n += numero.toString();
        }



        n2 = Integer.parseInt(n);
        System.out.println(Integer.parseInt(new StringBuilder(n).reverse().toString()));

    }


}
