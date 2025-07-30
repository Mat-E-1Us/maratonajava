package maratona.java.nojiraya.intermediario.datas.test;

import java.time.LocalDate;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears= LocalDate.now().plusYears(2);
        Period p1 = Period.between(now, nowAfterTwoYears);
        Period p2 = Period.ofDays(11);
        Period p3 = Period.ofMonths(4);
        Period p4 = Period.ofYears(2025);
        Period p5 = Period.of(2025,4,11);
        Period p6 = Period.ofWeeks(37);
        System.out.println("Planeta Marte '\n'" + p5 + p6);
        System.out.println("Este é o dia " + p2 + " do mês " + p3 + " do ano " + p4 + "e ainda estou fora do meu planeta natal após torres e monstros aparecerem na Terra, já passaram-se " + p1 + " anos após o incidente do dia " + now);
        System.out.println(now.until(now.plusDays(p6.getDays()), ChronoUnit.MONTHS));
    }
}
