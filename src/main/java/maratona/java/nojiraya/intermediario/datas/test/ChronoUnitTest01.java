package maratona.java.nojiraya.intermediario.datas.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime ani = LocalDateTime.of(2006, Month.DECEMBER, 12, 23, 12, 0);
        LocalDateTime p1 = LocalDateTime.of(2025, Month.DECEMBER, 29, 1, 10, 0);

        System.out.println(ChronoUnit.DAYS.between(ani, LocalDateTime.now()));
        System.out.println(ChronoUnit.MONTHS.between(ani, LocalDateTime.now()));
        System.out.println(ChronoUnit.YEARS.between(ani, LocalDateTime.now()));
        System.out.println(ChronoUnit.DECADES.between(ani, LocalDateTime.now()));
        System.out.println(ChronoUnit.MINUTES.between(ani, LocalDateTime.now()));
        System.out.println(ChronoUnit.MONTHS.between(p1, LocalDateTime.now()));
    }
}
