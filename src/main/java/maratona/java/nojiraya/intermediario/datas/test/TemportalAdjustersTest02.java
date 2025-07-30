package maratona.java.nojiraya.intermediario.datas.test;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.*;

class diaDaSemana implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
      DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
       int valor = 1;
       switch (dayOfWeek){
           case THURSDAY: valor = 4;
           break;
           case FRIDAY: valor = 3;
           break;
           case SATURDAY: valor = 2;
           break;
       }
        return temporal.plus(valor, ChronoUnit.DAYS);
    }
}

public class TemportalAdjustersTest02 {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        now = LocalDate.now().with(new diaDaSemana());
        System.out.println(now.getDayOfWeek());














        /*
        try{
            diaUtildoMes(27);
        } catch(DateTimeException e){
            e.printStackTrace();
        }
          
    }

    public static int diaUtildoMes(int dia) throws DateTimeException {
        LocalDate now = LocalDate.now();
        now = now.with(ChronoField.DAY_OF_MONTH, dia);

        if(now.getDayOfWeek().equals(DayOfWeek.SUNDAY) || now.getDayOfWeek().equals(DayOfWeek.SATURDAY)){
            now = now.with(LocalDate.now());
            System.out.println(now.getDayOfWeek());
        } else {
            System.out.println("Hoje é dia útil");
            int valor = now.getDayOfWeek().getValue();
            valor = valor + 1;
            now = now.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
            System.out.println(now.getDayOfWeek() + "da");
            now = now.with(ChronoField.DAY_OF_WEEK, valor);
            System.out.println(now.getDayOfWeek());
        }
        return dia;
         */
    }
}
