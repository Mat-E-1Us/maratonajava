package maratona.java.nojiraya.intermediario.designpatterns.test;

import maratona.java.nojiraya.intermediario.designpatterns.domain.AircraftSingletonEnum;
import maratona.java.nojiraya.intermediario.designpatterns.domain.AircraftSingletonLazy;

public class AircraftSingletonNullTest01 {
    public static void main(String[] args) {

        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat){
        System.out.println(AircraftSingletonEnum.INSTANCE);
        AircraftSingletonEnum aircraftSIngletonEnum = AircraftSingletonEnum.INSTANCE;
        System.out.println(aircraftSIngletonEnum.bookSeat(seat));
    }
}
