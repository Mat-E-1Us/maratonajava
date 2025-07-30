package maratona.java.nojiraya.intermediario.formatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        NumberFormat[] nfa = new NumberFormat[3];
        Locale localePT = new Locale("pt", "BR");
        Locale localeJP = new Locale("ja", "JP");
        Locale localeIT = Locale.ITALY;

        nfa[0] = NumberFormat.getCurrencyInstance(localePT);
        nfa[1] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[2] = NumberFormat.getCurrencyInstance(localeIT);

        double valor = 10_000_000.234;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor));
        }


    }
}
