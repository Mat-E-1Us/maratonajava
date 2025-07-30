package maratona.java.nojiraya.intermediario.concorrencia.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
        bq.put("William");
        System.out.println( Thread.currentThread().getName()+" Added the value "+ bq.peek());
        System.out.println("Tentando adicionar um novo valor...");
        new Thread(new RemoveFromQueue(bq)).start();
        bq.put("Sueanan");
        System.out.println( Thread.currentThread().getName()+" Added the value "+ bq.peek());

    }

    static class RemoveFromQueue implements Runnable{
    private final BlockingQueue<String> bq;

        RemoveFromQueue(BlockingQueue<String> bq) {
            this.bq = bq;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(2);
                System.out.println( Thread.currentThread().getName()+" removing the value from queu"+ bq.take());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
