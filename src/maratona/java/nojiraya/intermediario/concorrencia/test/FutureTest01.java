package maratona.java.nojiraya.intermediario.concorrencia.test;

import java.util.concurrent.*;

public class FutureTest01 {
    public static void main(String[] args){
        ExecutorService singleThread = Executors.newSingleThreadExecutor();
        Future<Double> dollar = singleThread.submit(new Callable<Double>() {
            @Override
            public Double call() throws Exception {
                TimeUnit.SECONDS.sleep(2);
                return 4.350;
            }
        });

        System.out.println(doingSomething());
        Double v = null;
        try {
            v = dollar.get(3, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            throw new RuntimeException(e);
        } finally{
            singleThread.shutdown();
        }
        System.out.println("Dollar" + v);
    }

    public static long doingSomething(){
        System.out.println(Thread.currentThread().getName());
        long sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum += i;
        }
        return sum;
    }
}
