package maratona.java.nojiraya.intermediario.classesinternas.test;

import maratona.java.nojiraya.intermediario.generics.domain.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class AnonymousClassTest02 {
class Animal{
    public void walk(){
        System.out.println("Animal walking");
    }
}

    public static void main(String[] args) {
        List<Barco> bacoList = new ArrayList<>(List.of(new Barco("Canoa"), new Barco("Lancha")));
        bacoList.sort((o1, o2) ->  o1.getNome().compareTo(o2.getNome()));
        bacoList.sort(new Comparator<Barco>() {
            @Override
            public int compare(Barco o1, Barco o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });
    }
}
