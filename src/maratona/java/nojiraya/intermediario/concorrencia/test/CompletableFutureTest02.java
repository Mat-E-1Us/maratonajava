package maratona.java.nojiraya.intermediario.concorrencia.test;

import maratona.java.nojiraya.intermediario.concorrencia.services.StoreService;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureTest02 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
        searchPriceSyncCompletableFuture(storeService);
    }

    private static void searchPriceSyncCompletableFuture(StoreService storeService){
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");

        List<CompletableFuture<Double>> collect = stores.stream()
                .map(storeService::getPriceAsyncCompletableFuture)
                .collect(Collectors.toList());

        List<Double> collect1 = collect.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());

        System.out.println(collect1);


        long end = System.currentTimeMillis();
        System.out.println("Time passed to searchPriceSync: " + (end - start));
    }
}
