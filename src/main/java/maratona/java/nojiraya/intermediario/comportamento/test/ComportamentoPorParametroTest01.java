package maratona.java.nojiraya.intermediario.comportamento.test;

import maratona.java.nojiraya.intermediario.comportamento.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

    public static void main(String[] args) {
        System.out.println(filterGreenCar(cars));
        System.out.println(filterColorCar(cars, "red"));
        System.out.println(filterColorCar(cars, "green"));
        System.out.println(filterColorCar(cars, "black"));
        System.out.println(filterYearCar(cars, 2016));
    }

    private static List<Car> filterGreenCar(List<Car> cars){
        List<Car> greenCars = new ArrayList<>();

        for (Car car : cars) {
            if(car.getColor().equals("green")){
                greenCars.add(car);
            }
        }
        return greenCars;
    }

    private static List<Car> filterColorCar(List<Car> cars, String color){
        List<Car> colorCars = new ArrayList<>();

        for (Car car : cars) {
            if(car.getColor().equals(color)){
                colorCars.add(car);
            }
        }
        return colorCars;
    }

    private static List<Car> filterYearCar(List<Car> cars, int year){
        List<Car> yearCars = new ArrayList<>();

        for (Car car : cars) {

            if(car.getYear() < year){
                yearCars.add(car);
            }
        }
        return yearCars;
    }
}
