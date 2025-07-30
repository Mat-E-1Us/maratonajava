package maratona.java.nojiraya.intermediario.datas.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now= LocalDateTime.now();
        LocalDateTime nowAfterTwoYears= LocalDateTime.now().plusYears(2);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinus7Hours = LocalTime.now().minusHours(7);
        Duration durantionYear = Duration.between(now, nowAfterTwoYears);
        System.out.println(durantionYear);
        System.out.println(Duration.between(timeNow, timeMinus7Hours));
        System.out.println(Duration.between(Instant.now(), Instant.now().plusSeconds(10000)));
        System.out.println(Duration.ofMinutes(100000));
    }
}
