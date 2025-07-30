package maratona.java.nojiraya.intermediario.threads.test;

import java.util.concurrent.TimeUnit;

class ThreadExample extends Thread{

    private final char a;
    public ThreadExample(char a) {
        this.a = a;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0) {
                try {
                    System.out.print(Thread.currentThread().getName() +". Character relacionado "+   a);
                    Thread.sleep(20000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}

class ThreadExampleRunnable implements Runnable{

    private final char a;
    public ThreadExampleRunnable(char a) {
        this.a = a;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0) {

                try {
                    System.out.println(Thread.currentThread().getName() +". Character relacionado é par: "+   a);
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.println(Thread.currentThread().getName() +". Character relacionado é impar: "+   a);

            }
        }
    }
}

public class ThreadsTest01 {
    public static void main(String[] args) {
//        ThreadExampleRunnable t1 = new ThreadExampleRunnable('A');
//        ThreadExampleRunnable t2 = new ThreadExampleRunnable('B');
//        ThreadExampleRunnable t3 = new ThreadExampleRunnable('C');
//        ThreadExampleRunnable t4 = new ThreadExampleRunnable('D');
//
        Thread t1 = new Thread(new ThreadExampleRunnable('A'), "Eu só gosto dos A");
        Thread t2 = new Thread(new ThreadExampleRunnable('B'), "Eu só gosto dos B");
        Thread t3 = new Thread(new ThreadExampleRunnable('C'), "Eu só gosto dos C");
        Thread t4 = new Thread(new ThreadExampleRunnable('D'), "Eu só gosto dos D");

        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}