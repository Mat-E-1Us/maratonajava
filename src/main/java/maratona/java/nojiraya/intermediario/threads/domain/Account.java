package maratona.java.nojiraya.intermediario.threads.domain;

public class Account {
    private int balance = 50;

    public void witdhdrawal(int amount){
        this.balance = this.balance - amount;
    }

    public int getBalance() {
        return balance;
    }
}
