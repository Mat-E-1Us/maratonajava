package maratona.java.nojiraya.intermediario.designpatterns.domain;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSingletonLazy {

    private static AircraftSingletonLazy INSTANCE;

    private final Set<String> availableSeats = new HashSet<>();
    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    private final String name;

    public AircraftSingletonLazy(String name) {
        this.name = name;
    }

    public static AircraftSingletonLazy getINSTANCE() {
        if(INSTANCE == null){
            synchronized (AircraftSingletonEager.class){
                if(INSTANCE == null) INSTANCE = new AircraftSingletonLazy("Boing 137");
            }
        }
        return INSTANCE;

    }

    public boolean bookSeat(String seat){
        return availableSeats.remove(seat);
    }
}
