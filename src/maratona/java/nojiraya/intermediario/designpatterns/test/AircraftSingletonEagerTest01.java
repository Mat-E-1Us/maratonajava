package maratona.java.nojiraya.intermediario.designpatterns.test;

import maratona.java.nojiraya.intermediario.designpatterns.domain.Aircraft;
import maratona.java.nojiraya.intermediario.designpatterns.domain.AircraftSingletonEager;

public class AircraftSingletonEagerTest01 {
    private static final Aircraft aircraft = new Aircraft();

    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
        test("1A");
        test("1A");
    }

    private static void bookSeat(String seat){
        System.out.println(AircraftSingletonEager.getINSTANCE());
        AircraftSingletonEager aircraftSIngletonEager = AircraftSingletonEager.getINSTANCE();
        System.out.println(aircraftSIngletonEager.bookSeat(seat));
    }

    private static void test(String seat){
        System.out.println(aircraft.bookSeat(seat));
    }
}
