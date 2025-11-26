package maratona.java.nojiraya.intermediario.concorrencia.services;

import maratona.java.nojiraya.intermediario.concorrencia.domain.Discount;
import maratona.java.nojiraya.intermediario.concorrencia.domain.Quote;

import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class StoreServiceWithDiscount {

    public String getPrice(String name) {
        double price = priceGenerator();
        Discount.Disc value = Discount.Disc.values()[
                ThreadLocalRandom.current().nextInt(Discount.Disc.values().length)
                ];
        return String.format(Locale.US, "%s:%.2f:%s",
                name,
                price,
                value);
    }


    public static String ApplyDiscount(Quote quote){
        delay();
        double valFinal = quote.getPrice() * (100 - quote.getDiscount().getPercentage()) / 100;
        return String.format(Locale.US,"Participante: '%s' comprou um item na loja Omori com o valor '%.2f'. Porém, uma brotopeira que andava por ai te presenteou com um cupom... E o cupom é o... ! '%s'. PARABÉNS!  Valor final do seu item saiu por: '%.2f'. Aproveite a sua geleia vital!",
                quote.getName(),
                quote.getPrice(),
                quote.getDiscount(),
                valFinal
                );
    }


    public static double priceGenerator() {
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }



    private static void delay() {
        try {
            int mili = ThreadLocalRandom.current().nextInt(200, 2500);
            TimeUnit.MILLISECONDS.sleep(mili);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
