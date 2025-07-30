package maratona.java.nojiraya.intermediario.formatacao.test;


import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args){
        // Lingua que está sendo falado (pt - br)
        Locale locale = new Locale("it", "IT");
        Locale locale2 = new Locale("it", "CH");
        Locale locale3 = new Locale("ja", "JP");
        Locale locale4 = new Locale("pt", "BR");
        Locale locale5 = new Locale("latn", " Cyrl");


        Calendar calendar = Calendar.getInstance();
        DateFormat[] df = new DateFormat[5];
        df[0] = DateFormat.getDateInstance(DateFormat.FULL, locale);
        df[1] = DateFormat.getDateInstance(DateFormat.FULL, locale2);
        df[2] = DateFormat.getDateInstance(DateFormat.FULL, locale3);
        df[3] = DateFormat.getDateInstance(DateFormat.FULL, locale4);
        df[4] = DateFormat.getDateInstance(DateFormat.FULL, locale5);

        for(DateFormat dat : df){
            System.out.println(dat.format(calendar.getTime()));
        }

    }
}
