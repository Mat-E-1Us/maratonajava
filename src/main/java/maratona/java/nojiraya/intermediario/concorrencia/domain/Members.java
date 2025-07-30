package maratona.java.nojiraya.intermediario.concorrencia.domain;


import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Members {
    private final Queue<String> emails = new PriorityQueue<>();
    private final boolean isOpen = true;
    private final ReentrantLock rl = new ReentrantLock();
    private final Condition condition =  rl.newCondition();
    public boolean open(){
        return isOpen;
    }

    public int quantidadeDeEmails(){
        rl.lock();
        try{
            return emails.size();
        }finally{
            rl.unlock();
        }

    }

    public void addEmail(String email){
        rl.lock();

        try{
            String nomeDoEmail = Thread.currentThread().getName();
                System.out.println("Adicionou um email: "+ nomeDoEmail);
                this.emails.add(email);
                condition.signalAll();
        }finally {
            rl.unlock();
        }
    }

    public String lerEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+ " verificando se tem algum email...");
        rl.lock();
        try{
            while(this.emails.size() == 0){
                if(!open()) return null;
                System.out.println(Thread.currentThread().getName()+ " Não temos emails disponiveis no momento!");
                condition.await();
            }
            return this.emails.poll();
        }finally{
            rl.unlock();
        }
    }

    public void close(){
        rl.lock();
        try{
            String s = Thread.currentThread().getName() + " Não estamos recebendo mais emails";
            condition.signalAll();
        } finally{
            rl.unlock();
        }
    }

}
