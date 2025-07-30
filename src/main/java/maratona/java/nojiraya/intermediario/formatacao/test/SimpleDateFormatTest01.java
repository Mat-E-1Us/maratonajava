package maratona.java.nojiraya.intermediario.formatacao.test;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatTest01 {
    public static void main(String[] args){
        Locale localJpa = Locale.JAPAN;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ssss z", localJpa);
        System.out.println(sdf.format(Calendar.getInstance().getTime()));
        }
}
