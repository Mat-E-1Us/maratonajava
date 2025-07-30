package maratona.java.nojiraya.intermediario.threads.test;

import maratona.java.nojiraya.intermediario.threads.domain.Members;
import maratona.java.nojiraya.intermediario.threads.services.EmailDeliveryServices;

import javax.swing.*;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Members members = new Members();
        Thread t1 = new Thread(new EmailDeliveryServices(members), "Brotopeira");
        Thread t2 = new Thread(new EmailDeliveryServices(members), "Coelho");
        t1.start();
        t2.start();
        while(true){
            String email = JOptionPane.showInputDialog("Entre com seu abacate gostoso.");
            if(email == null || email.isEmpty()){
                members.close();
                break;
            }
            members.addEmail(email);
        }
    }
}
