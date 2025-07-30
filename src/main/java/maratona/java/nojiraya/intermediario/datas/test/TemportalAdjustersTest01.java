package maratona.java.nojiraya.intermediario.datas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemportalAdjustersTest01{
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        now = now.with(ChronoField.DAY_OF_MONTH, 18);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        LocalDate now2 = LocalDate.now();
        now2 = now2.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
        now2 = now2.with(TemporalAdjusters.firstDayOfMonth());
        now2 = now2.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(now2);
        System.out.println(now2.getDayOfWeek());

    }
}
