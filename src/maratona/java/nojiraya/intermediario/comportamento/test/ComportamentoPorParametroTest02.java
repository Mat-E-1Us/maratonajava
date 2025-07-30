package maratona.java.nojiraya.intermediario.comportamento.test;

import maratona.java.nojiraya.intermediario.comportamento.domain.Car;
import maratona.java.nojiraya.intermediario.comportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {
private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

    public static void main(String[] args) {
        List<Car> green = filter(cars, cargreen -> cargreen.getColor().equals("green"));
        List<Car> red = filter(cars, carred -> carred.getColor().equals("red"));
        List<Car> carYear = filter(cars, carred -> carred.getYear() < 2016);

        System.out.println(green);
        System.out.println(red);
        System.out.println(carYear);
    }
    private static List<Car> filter(List<Car> cars, Predicate<Car> carPredicate){
        List<Car> filteredCar = new ArrayList<>();

        for (Car car : cars) {
            if(carPredicate.test(car)){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }


}
