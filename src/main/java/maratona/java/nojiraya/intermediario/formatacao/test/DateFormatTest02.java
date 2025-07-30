package maratona.java.nojiraya.intermediario.formatacao.test;


import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatTest02 {
    public static void main(String[] args){
        Date dat = new Date();
        Calendar calendar = Calendar.getInstance();
        System.out.println(49 % 72);
        DateFormat[] df = new DateFormat[7];
        df[0] = DateFormat.getInstance();
        df[1] = DateFormat.getDateInstance();
        df[2] = DateFormat.getDateTimeInstance();
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT);
        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        df[5] = DateFormat.getDateInstance(DateFormat.LONG);
        df[6] = DateFormat.getDateInstance(DateFormat.FULL);

        for(DateFormat dateFormat : df){
            System.out.println(dateFormat.format(calendar.getTime()));
        }
        }
}
