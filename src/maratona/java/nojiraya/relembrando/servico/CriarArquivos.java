package maratona.java.nojiraya.relembrando.servico;

import maratona.java.nojiraya.relembrando.domain.Funcionario;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class CriarArquivos {

    public static void criarArquivosF(Funcionario funcionario){

        Path file = Path.of("src/main/java/maratona/java/nojiraya/relembrando/arqFuncionario/" + funcionario.getNome()+".txt");
        try {
            if(Files.notExists(file))
            Files.createFile(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(FileWriter fw = new FileWriter(file.toFile(), false);
        BufferedWriter bbw = new BufferedWriter(fw)){
            bbw.write("Nome: "+ funcionario.getNome());
            bbw.newLine();
            bbw.write("Idade: "+ funcionario.getIdade());
            bbw.newLine();
            bbw.write("Endereço: "+ funcionario.getEndereco());
            bbw.newLine();
            bbw.write(funcionario.getCpf());
            bbw.newLine();
            bbw.write("RG: "+ funcionario.getRg());
            bbw.newLine();
            bbw.write("Salario: "+ funcionario.getSalario());
            bbw.newLine();
            bbw.write("Empresa que atua: "+ funcionario.getEmpresa().getNome());
            bbw.newLine();
            bbw.write("----------------------------------------------");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }



}
