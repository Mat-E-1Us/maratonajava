package maratona.java.nojiraya.intermediario.concorrencia.test;

import maratona.java.nojiraya.intermediario.concorrencia.services.StoreServiceDeprecated;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureTest03 {

        public static void main(String[] args) {
            StoreServiceDeprecated storeServiceDeprecated = new StoreServiceDeprecated();
            searchPriceSyncCompletableFuture(storeServiceDeprecated);
        }

        private static void searchPriceSyncCompletableFuture(StoreServiceDeprecated storeServiceDeprecated){
            long start = System.currentTimeMillis();

            ExecutorService executorService = Executors.newFixedThreadPool(10, r -> {
                Thread thread = new Thread(r);
                thread.setDaemon(true);
                return thread;
            });
            List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");
            List<CompletableFuture<Double>> collect = stores.stream()
                    .map(s -> CompletableFuture.supplyAsync(() -> storeServiceDeprecated.getPrice(s), executorService))
                    .toList();

            List<Double> list = collect.stream()
                    .map(CompletableFuture::join)
                    .toList();

            System.out.println(list);
            executorService.shutdown();
            long end = System.currentTimeMillis();
            System.out.println("Time passed to searchPriceSync: " + (end - start));
        }
    }

