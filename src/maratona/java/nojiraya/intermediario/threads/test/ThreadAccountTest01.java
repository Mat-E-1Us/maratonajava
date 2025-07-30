package maratona.java.nojiraya.intermediario.threads.test;

import maratona.java.nojiraya.intermediario.threads.domain.Account;

public class ThreadAccountTest01 implements Runnable{
    private Account account = new Account();
    public static void main(String[] args) throws InterruptedException {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "Bell");
        Thread t2 = new Thread(threadAccountTest01, "Caramelo");

        t1.start();
        t2.start();
    }

    private void withdrawal(int amount){
        synchronized (account) {
            if (account.getBalance() >= amount) {
                System.out.println(Thread.currentThread().getName() + " está indo sacar dinheiro");
                account.witdhdrawal(amount);
                System.out.println(Thread.currentThread().getName() + " completou o saque, valor atual da conta " + account.getBalance());
            } else {
                System.out.println("Saldo Indisponivel " + Thread.currentThread().getName());
            }
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if(account.getBalance() < 0){
                System.out.println("ESTOURADO");
            }
        }
    }
}