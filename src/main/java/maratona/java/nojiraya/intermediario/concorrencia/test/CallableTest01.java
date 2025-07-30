package maratona.java.nojiraya.intermediario.concorrencia.test;

import java.util.concurrent.*;

class RandomNumberCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        Math.random();
        int count = ThreadLocalRandom.current().nextInt(1, 11);
        for (int i = 0; i < count; i++){
            System.out.println(Thread.currentThread().getName() + " executando uma tarefa callable");
        }
        return Thread.currentThread().getName() +" finished and the random number is " + count;
    }
}

public class CallableTest01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        RandomNumberCallable rnc =  new RandomNumberCallable();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> submit = executorService.submit(rnc);
        String s = submit.get();
        System.out.println("Program finished" +s);
        executorService.shutdown();
    }
}
