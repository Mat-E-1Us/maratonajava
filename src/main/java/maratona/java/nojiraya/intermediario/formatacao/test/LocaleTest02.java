package maratona.java.nojiraya.intermediario.formatacao.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage + " ");

        }
        System.out.print("----------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (String isoCountry : isoCountries) {

            System.out.print(isoCountry +  " ");
        }


    }
}
