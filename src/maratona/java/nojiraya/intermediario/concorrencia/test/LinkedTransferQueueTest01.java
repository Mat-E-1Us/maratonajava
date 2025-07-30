package maratona.java.nojiraya.intermediario.concorrencia.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        LinkedTransferQueue<Object> objects = new LinkedTransferQueue<>();
        System.out.println(objects.add("Wol"));
        System.out.println(objects.offer("Wal"));
        System.out.println(objects.offer("Wel", 10, TimeUnit.MINUTES));
        System.out.println(objects.element());
        System.out.println(objects.peek());
        System.out.println(objects.poll());
        System.out.println(objects.remove());
        System.out.println(objects.take());
        System.out.println(objects.tryTransfer("Wol"));
        objects.transfer("Wol");
        objects.put("Wil");
    }
}
