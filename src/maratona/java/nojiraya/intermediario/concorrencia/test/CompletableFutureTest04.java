package maratona.java.nojiraya.intermediario.concorrencia.test;

import maratona.java.nojiraya.intermediario.concorrencia.domain.Quote;
import maratona.java.nojiraya.intermediario.concorrencia.services.StoreServiceWithDiscount;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureTest04 {
    public static void main(String[] args) {
        StoreServiceWithDiscount storeServiceWithDiscount = new StoreServiceWithDiscount();
        searchPriceWithDiscountAssync(storeServiceWithDiscount);
    }

    private static void searchPriceWithDiscount(StoreServiceWithDiscount storeServiceWithDiscount) {
        List<String> participantes = List.of("Sweetheart", "Captain Space Boy", "Doughie", "Binky Snuuy", "Kite Kid");

    participantes.stream()
                .map(storeServiceWithDiscount::getPrice)
                .map(Quote::newQuote)
                .map(StoreServiceWithDiscount::ApplyDiscount)
                .forEach(System.out::println);
    }


    private static void searchPriceWithDiscountAssync(StoreServiceWithDiscount storeServiceWithDiscount) {
        List<String> participantes = List.of("Sweetheart", "Captain Space Boy", "Doughie", "Binky Snuuy", "Kite Kid");

        List<CompletableFuture<String>> list = participantes.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> storeServiceWithDiscount.getPrice(s)))
                .map(qt -> qt.thenApply(Quote::newQuote))
                .map(dis -> dis.thenCompose(quote -> CompletableFuture.supplyAsync(() -> StoreServiceWithDiscount.ApplyDiscount(quote))))
                .toList();

                list.stream()
                .map(CompletableFuture::join)
                .forEach(System.out::println);
    }
}
