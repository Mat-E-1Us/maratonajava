package maratona.java.nojiraya.intermediario.concorrencia.services;

import java.util.concurrent.*;

public class StoreServiceDeprecated {

    public double getPrice(String storeName) {
        System.out.println("Getting prices sync for store " + storeName);
        return priceGenerator();
    }

    public double priceGenerator() {
        System.out.println(Thread.currentThread().getName() + " generating price");
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }



    private static void delay() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
