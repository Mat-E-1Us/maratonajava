package maratona.java.nojiraya.intermediario.gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Você está falando a verdade?");
        System.out.println("Diga sim ou não.");
        String sim = "sim";
        String resposta = entrada.nextLine();

        String resposta2 = resposta;
        if (resposta.charAt(0) == 's' || resposta.charAt(0) == 'S') {
            System.out.println("Tem certeza?");
            System.out.println("Fale a verdade!");
            resposta = entrada.nextLine();
        }
        if (resposta.charAt(0) == 's' || resposta.charAt(0) == 'S') {
            System.out.println("Você está brincando comigo?");
            System.out.println("Fale logo!");
            resposta = entrada.nextLine();
        }
        if (resposta.charAt(0) == 's' || resposta.charAt(0) == 'S') {
            System.out.println("Muito bem!");
            System.out.println("Então responda qual é a capital da Ucrânia?");
            resposta = entrada.nextLine();
        }
        if (resposta.charAt(0) == 'K' && resposta.charAt(1) == 'i' && resposta.charAt(2) == 'e' && resposta.charAt(3) == 'v') {
            System.out.println("Oh, parece que você estava certo.");
            System.out.println("Então me responda novamente");
            System.out.println("Você está mentindo???????????????");
        }
        resposta = entrada.nextLine();
        if (resposta.charAt(0) == 's') {
            System.out.println("Aii, ai, ai.... Que vergonha!");
        } else {
            System.out.println("Viu? Como é bom ser honesto.");
        }

    }
}

