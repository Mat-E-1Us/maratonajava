package maratona.java.nojiraya.intermediario.intrometodos.test;

import maratona.java.nojiraya.intermediario.intrometodos.dominio.Revisao;

public class RevisaoTest {
    public static void main(String[] args) {
        //Classes
        Revisao pessoa = new Revisao();
        Revisao pessoa2 = new Revisao();

        pessoa.nome = "Mateus";
        pessoa.idade = 18;
        pessoa.sexo = 'M';
        System.out.println("Meu nome é " + pessoa.nome + ", tenho " + pessoa.idade + " anos e sou do sexo " + pessoa.sexo + ".");
        // Referência do objeto
        pessoa2.nome = "Sut";
        pessoa2.idade = 19;
        pessoa2.sexo = 'M';
        // O objeto ganhou valores em seus atributos, mas irá fazer referência a outro objeto logo em seguida, além de perder o espaço de memória de seu antigo objeto, no caso irá perder os valores de seus atributos.
        pessoa2 = pessoa;
        System.out.println("Meu nome é " + pessoa2.nome + ", tenho " + pessoa2.idade + " anos e sou do sexo " + pessoa2.sexo + ".");
        //Métodos - Entra dentro do método e realiza oq está dentro dele.
        Revisao soma = new Revisao();
        soma.somaDoisNumeros();
        //Com parâmetros
        Revisao mult = new Revisao();
        mult.multDosNumeros(121, 123);
        // Com retorno do resultado
        Revisao dividi = new Revisao();
        System.out.println(dividi.dividDoisNumeros(213, 9812783));
        //Tipos primitivos nunca se alteram.
        Revisao subtrai = new Revisao();
        int num1 = 245;
        int num2 = 132;
        subtrai.subDoisNumeros(num1, num2);

        System.out.println("Dentro do RevisaoTest: " + num1);
        System.out.println("Dentro do RevisaoTest: " + num2);
        // Param tipo refêrencia---- Está na classe impressora e na classe Estudante

    }
}
