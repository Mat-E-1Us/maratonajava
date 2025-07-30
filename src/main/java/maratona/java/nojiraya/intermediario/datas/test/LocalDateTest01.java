package maratona.java.nojiraya.intermediario.datas.test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDateTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2025, Month.JANUARY, 24);
        String estiloDaData = "'A data de hoje é ' dd.mm.yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(estiloDaData);
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));
        System.out.println(date.now());
//        System.out.println(sdf.format(date));
    }
}
