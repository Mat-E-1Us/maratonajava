package maratona.java.nojiraya.intermediario.datas.test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        LocalTime hora = LocalTime.now();
        // Mesmo resultado;
        //1- LocalDateTime localDateTime = LocalDateTime.now();
        /*2-*/LocalDateTime localDateTime = data.atTime(hora);

        System.out.println(localDateTime);
    }
}
