package maratona.java.nojiraya.intermediario.relembrando.servico;

import maratona.java.nojiraya.relembrando.domain.Funcionario;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintNosDados {

    public static void printNaTela(Funcionario funcionario){
        String validacao = "[0-9]{0,3}.[0-9]{0,3}.[0-9]{0,3}-[0-9]{0,2}(|$)";
        Pattern pattern = Pattern.compile(validacao);
        Matcher mat = pattern.matcher(funcionario.getCpf());



        System.out.println("Nome: "+ funcionario.getNome());
        System.out.println("Idade: "+ funcionario.getIdade());
        System.out.println("Endereço: "+ funcionario.getEndereco());

        while(mat.find()) {
            if (mat.group().length() == 14) {
                System.out.println("CPF: "+ mat.group());
            }
        }
        System.out.println("RG: "+ funcionario.getRg());
        System.out.println("Salario: "+ funcionario.getSalario());
        System.out.println("Empresa que atua: "+ funcionario.getEmpresa().getNome());

        System.out.println("----------------------------------------------");

    }
}
