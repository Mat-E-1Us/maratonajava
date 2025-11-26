package maratona.java.nojiraya.intermediario.designpatterns.domain;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSingletonEager {

    private static final AircraftSingletonEager INSTANCE = new AircraftSingletonEager("Boing");

    private final Set<String> availableSeats = new HashSet<>();
    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    private final String name;

    public AircraftSingletonEager(String name) {
        this.name = name;
    }

    public static AircraftSingletonEager getINSTANCE(){
        return INSTANCE;
    }

    public String getName() {
        return name;
    }

    public boolean bookSeat(String seat){
        return availableSeats.remove(seat);
    }
}
