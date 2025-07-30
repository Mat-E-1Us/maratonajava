package maratona.java.nojiraya.intermediario.concorrencia.test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.*;

public class ScheduledThreadPoolTest01 {
    private static final ScheduledExecutorService stpe = Executors.newScheduledThreadPool(1);

    public static void main(String[] args) {
        System.out.println(LocalTime.now() + " beep1");
        beeper();
    }

    private static void beeper (){
        Runnable r = () -> {
            System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")) + " beep");
        };

        ScheduledFuture<?> schedule = stpe.schedule(r, 10, TimeUnit.SECONDS);
        stpe.schedule(() -> {
            System.out.println("Cancelando as execuções");
            schedule.cancel(false);
            stpe.shutdown();
        }, 10, TimeUnit.SECONDS);
    }
}
