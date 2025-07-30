package maratona.java.nojiraya.intermediario.threads.domain;


import java.util.PriorityQueue;
import java.util.Queue;

public class Members {
    private final Queue<String> emails = new PriorityQueue<>();
    private boolean open = true;

    public boolean verificandoEstado(){
        return open;
    }

    public int tamanhoDaLista(){
        synchronized (emails){

            return emails.size();
        }
    }

    public String addEmail(String email){
        synchronized (this.emails){
            if(email != null){
                System.out.println(Thread.currentThread().getName() + " adicionou um email");
                this.emails.add(email);
                this.emails.notifyAll();
            }
        }
        return email;
    }

    public String verificacaoDeEmails() throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+ " verificando se tem emails");
        synchronized (this.emails){
            while(this.emails.isEmpty()){
                if(!open) return null;
                System.out.println(Thread.currentThread().getName()+ "não tem emails na sua lista.");
                this.emails.wait();
            }
            return this.emails.poll();
        }
    }

    public void close(){
        open = false;
        synchronized (this.emails){
            System.out.println("Fechando a lista de emails do(a) " + Thread.currentThread().getName());

        }
    }
}