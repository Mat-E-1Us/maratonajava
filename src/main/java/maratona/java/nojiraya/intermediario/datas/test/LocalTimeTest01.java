package maratona.java.nojiraya.intermediario.datas.test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;


public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        System.out.println(localTime.MIN);
    }
}
