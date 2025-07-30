package maratona.java.nojiraya.intermediario.threads.services;

import maratona.java.nojiraya.intermediario.threads.domain.Members;

public class EmailDeliveryServices implements Runnable{
    private Members membros = new Members();

    public EmailDeliveryServices(Members membros) {
        this.membros = membros;
    }

    @Override
    public void run() {
        String treadName = Thread.currentThread().getName();
        System.out.println(treadName + " começando o envio dos emails");
        while(membros.verificandoEstado() && membros.tamanhoDaLista() >= 0){
            try {
                String email = membros.verificacaoDeEmails();
                if(email == null) continue;
                System.out.println(treadName + " envidando email para " + email);
                Thread.sleep(2000);
                System.out.println("Email enviado com sucesso para " + email);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Todos os emails enviados com sucesso!");
    }
}