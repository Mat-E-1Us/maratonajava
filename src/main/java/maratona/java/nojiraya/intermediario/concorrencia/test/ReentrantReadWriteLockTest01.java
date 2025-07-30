package maratona.java.nojiraya.intermediario.concorrencia.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class MapReadWrite {

    private final Map<String, String> mapp = new LinkedHashMap<>();
    private ReentrantReadWriteLock rrw = new ReentrantReadWriteLock();

    public MapReadWrite(ReentrantReadWriteLock rrw){
        this.rrw = rrw;
    }


    public void put(String key, String value){
        rrw.writeLock().lock();

        try{
            if(rrw.isWriteLocked()) System.out.println(Thread.currentThread().getName() + " ele adquiriu o lock write");
            Thread.sleep(500);
            mapp.put(key, value);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }finally{
            rrw.writeLock().unlock();
        }
    }

    public Set<String> readMapKey(){
        rrw.readLock().lock();
        try{
            return mapp.keySet();
        }finally{
            rrw.readLock().lock();
        }
    }
}

public class ReentrantReadWriteLockTest01 {
    public static void main(String[] args) throws InterruptedException {
        ReentrantReadWriteLock rrw = new ReentrantReadWriteLock();
        MapReadWrite mrw = new MapReadWrite(rrw);
        char[] alfabeto = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        Runnable write = () ->{
            for(int i = 0; i < alfabeto.length; i++){
                mrw.put(String.valueOf(alfabeto[i]), String.valueOf(i));
            }
        };

        Runnable read = () ->{

            if(rrw.isWriteLocked()) System.out.println("WRITE LOCKED!");
            rrw.readLock().lock();
            System.out.println("Finalmente posso ler o négocio, Dito por: "+Thread.currentThread().getName());
            try{
                System.out.println(Thread.currentThread().getName() + ": "+ mrw.readMapKey());
            }finally{
                rrw.readLock().lock();
            }
        };

        Thread t1 = new Thread(write);
        Thread t2 = new Thread(read);
        Thread t3 = new Thread(read);

        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
    }
}