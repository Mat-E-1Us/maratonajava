package maratona.java.nojiraya.intermediario.concorrencia.test;

import maratona.java.nojiraya.intermediario.concorrencia.services.StoreService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;


public class CompletableFutureTest01 {

    public static void main(String[] args) {
        StoreService storeService = new StoreService();
        searchPriceSyncCompletableFuture(storeService);
    }

    private static void searchPriceSync(StoreService storeService){
        long start = System.currentTimeMillis();
        try {
            storeService.getPriceAsyncFuture("Store 1").get();
            storeService.getPriceAsyncFuture("Store 2").get();
            storeService.getPriceAsyncFuture("Store 3").get();
            storeService.getPriceAsyncFuture("Store 4").get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        long end = System.currentTimeMillis();
        System.out.println("Time passed to searchPriceSync: " + (end - start));

    }

    private static void searchPriceSyncFuture(StoreService storeService){
        long start = System.currentTimeMillis();
        Future<Double> priceAsyncFuture1 = storeService.getPriceAsyncFuture("Store 1");
        Future<Double> priceAsyncFuture2 = storeService.getPriceAsyncFuture("Store 1");
        Future<Double> priceAsyncFuture3 = storeService.getPriceAsyncFuture("Store 1");
        Future<Double> priceAsyncFuture4 = storeService.getPriceAsyncFuture("Store 1");
        try {
            System.out.println(priceAsyncFuture1.get());
            System.out.println(priceAsyncFuture2.get());
            System.out.println(priceAsyncFuture3.get());
            System.out.println(priceAsyncFuture4.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }finally {
            StoreService.shutdown();
        }
        long end = System.currentTimeMillis();
        System.out.println("Time passed to searchPriceSync: " + (end - start));
    }
    private static void searchPriceSyncCompletableFuture(StoreService storeService){
        long start = System.currentTimeMillis();
        CompletableFuture<Double> priceAsyncFuture1 = storeService.getPriceAsyncCompletableFuture("Store 1");
        CompletableFuture<Double> priceAsyncFuture2 = storeService.getPriceAsyncCompletableFuture("Store 1");
        CompletableFuture<Double> priceAsyncFuture3 = storeService.getPriceAsyncCompletableFuture("Store 1");
        CompletableFuture<Double> priceAsyncFuture4 = storeService.getPriceAsyncCompletableFuture("Store 1");

            System.out.println(priceAsyncFuture1.join());
            System.out.println(priceAsyncFuture2.join());
            System.out.println(priceAsyncFuture3.join());
            System.out.println(priceAsyncFuture4.join());
        long end = System.currentTimeMillis();
        System.out.println("Time passed to searchPriceSync: " + (end - start));
    }
}
