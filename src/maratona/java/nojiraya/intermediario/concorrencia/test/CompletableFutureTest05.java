package maratona.java.nojiraya.intermediario.concorrencia.test;

import maratona.java.nojiraya.intermediario.concorrencia.domain.Quote;
import maratona.java.nojiraya.intermediario.concorrencia.services.StoreServiceWithDiscount;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureTest05 {
    public static void main(String[] args) {
        StoreServiceWithDiscount storeServiceWithDiscount = new StoreServiceWithDiscount();
        searchPriceWithDiscountAssync(storeServiceWithDiscount);
    }



    private static void searchPriceWithDiscountAssync(StoreServiceWithDiscount storeServiceWithDiscount) {
        List<String> participantes = List.of("Sweetheart", "Captain Space Boy", "Doughie", "Binky Snuuy", "Kite Kid");

        long start = System.currentTimeMillis();

        CompletableFuture[] array = participantes.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> storeServiceWithDiscount.getPrice(s)))
                .map(qt -> qt.thenApply(Quote::newQuote))
                .map(dis -> dis.thenCompose(quote -> CompletableFuture.supplyAsync(() -> StoreServiceWithDiscount.ApplyDiscount(quote))))
                .map(imp -> imp.thenAccept(participante -> System.out.printf("%s finished in %d%n", participante, (System.currentTimeMillis() - start))))
                .toArray(CompletableFuture[]::new);

        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.allOf(array);
        voidCompletableFuture.join();
        System.out.printf("Finished? %b", voidCompletableFuture.isDone());
    }
}
