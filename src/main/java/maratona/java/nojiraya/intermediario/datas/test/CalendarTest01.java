package maratona.java.nojiraya.intermediario.datas.test;


import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        if (calendario.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Primeiro dia da Semana");
        }
        System.out.println(calendario.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        calendario.add(Calendar.DAY_OF_MONTH, 2);
        Date date = calendario.getTime();
        System.out.println(date);

    }
}
