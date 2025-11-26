package maratona.java.nojiraya.intermediario.designpatterns.test;

import maratona.java.nojiraya.intermediario.designpatterns.domain.Aircraft;
import maratona.java.nojiraya.intermediario.designpatterns.domain.AircraftSingletonEager;
import maratona.java.nojiraya.intermediario.designpatterns.domain.AircraftSingletonLazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AircraftSingletonLazyTest01 {
    private static final Aircraft aircraft = new Aircraft();

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        bookSeat("1A");
        bookSeat("1A");
        test("1A");
        test("1A");

        Constructor<AircraftSingletonLazy> declaredConstructor = AircraftSingletonLazy.class.getDeclaredConstructor(String.class);
        declaredConstructor.setAccessible(true);
        AircraftSingletonLazy aircraftSingletonLazy = declaredConstructor.newInstance("Brotopeira-137");
        System.out.println(aircraftSingletonLazy);
    }

    private static void bookSeat(String seat){
        System.out.println(AircraftSingletonLazy.getINSTANCE());
        AircraftSingletonLazy aircraftSIngletonLazy = AircraftSingletonLazy.getINSTANCE();
        System.out.println(aircraftSIngletonLazy.bookSeat(seat));
    }

    private static void test(String seat){
        System.out.println(aircraft.bookSeat(seat));
    }
}
