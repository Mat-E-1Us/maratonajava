package maratona.java.nojiraya.intermediario.designpatterns.test;

import maratona.java.nojiraya.intermediario.designpatterns.domain.Aircraft;

public class AircraftTest01 {
    private static final Aircraft aircraft = new Aircraft();

    public static void main(String[] args) {
        bookSeat("1A");
    }

    private static void bookSeat(String seat){
        System.out.println(aircraft.bookSeat(seat));
    }

    private static void test(String seat){
        System.out.println(aircraft.bookSeat(seat));
    }
}
