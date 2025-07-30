package maratona.java.nojiraya.intermediario.threads.test;


class ThreadExampleRunnable2 implements Runnable{
    private final String c;

    ThreadExampleRunnable2(String c) {
        this.c = c;
    }

    @Override
    public void run() {
        for(int i = 0; i < 1; i++){
            System.out.print(c);
            if(i % 1 == 0) System.out.println();
            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadsTest02 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadExampleRunnable2("KAAAAAAA"));
        Thread t2 = new Thread(new ThreadExampleRunnable2("MEEEEEEE"));
        Thread t3 = new Thread(new ThreadExampleRunnable2("HAAAAAAAAA"));
        Thread t4 = new Thread(new ThreadExampleRunnable2("MEEEEEEE"));
        Thread t5 = new Thread(new ThreadExampleRunnable2("HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"));
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        t4.start();
        t4.join();
        t5.start();
        t5.join();
    }
}