package maratona.java.nojiraya.intermediario.comportamento.test;

import maratona.java.nojiraya.intermediario.comportamento.domain.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

    public static void main(String[] args) {
        List<Car> green = filter(cars, cargreen -> cargreen.getColor().equals("green"));
        List<Car> red = filter(cars, carred -> carred.getColor().equals("red"));
        List<Car> carYear = filter(cars, carred -> carred.getYear() < 2016);

        System.out.println(green);
        System.out.println(red);
        System.out.println(carYear);
    }
    private static <T> List<T> filter(List<T> t, Predicate<T> predicate){
        List<T> filtered = new ArrayList<>();

        for (T e : t) {
            if(predicate.test(e)){
                filtered.add(e);
            }
        }
        return filtered;
    }


}
