package maratona.java.nojiraya.intermediario.concorrencia.services;

import java.util.concurrent.*;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class StoreService {
    private static final ExecutorService executor = Executors.newCachedThreadPool();

    public double getPrice(String storeName) {
        System.out.println("Getting prices sync for store " + storeName);
        return priceGenerator();
    }

    public double priceGenerator() {
        System.out.println(Thread.currentThread().getName() + " generating price");
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }


    public Future<Double> getPriceAsyncFuture(String storeName){
        System.out.println("Getting prices sync for store " + storeName);
        return executor.submit(this::priceGenerator);
    }

    public CompletableFuture<Double> getPriceAsyncCompletableFuture(String storeName){
        System.out.println("Getting prices sync for store " + storeName);
        return CompletableFuture.supplyAsync(this::priceGenerator);
    }


    public static void shutdown(){
        executor.shutdown();
    }


    private static void delay() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
