package maratona.java.nojiraya.intermediario.concorrencia.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Printer implements Runnable{
private final int num;

    public Printer(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("iniciou: "+ Thread.currentThread().getName()+ num);
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Thread.currentThread().getName()+" Finalizou: %n");

    }
}
public class ExecutorsTest01 {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        executorService.execute(new Printer(1));
        executorService.execute(new Printer(2));
        executorService.execute(new Printer(3));
        executorService.execute(new Printer(4));
        executorService.execute(new Printer(5));
    }
}
