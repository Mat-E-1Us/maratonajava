package maratona.java.nojiraya.intermediario.datas.test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class InstantTest01 {
    public static void main(String[] args) {
        InstantiationError e = new InstantiationError();
        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(LocalDateTime.now());

    }
}
