package maratona.java.nojiraya.intermediario.relembrando.test;

import maratona.java.nojiraya.relembrando.domain.Empresa;
import maratona.java.nojiraya.relembrando.domain.Funcionario;
import maratona.java.nojiraya.relembrando.servico.CriarArquivos;
import maratona.java.nojiraya.relembrando.servico.PrintNosDados;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;


public class FuncionarioTest01 {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Funcionario funcionario01 = new Funcionario("Mateus", 18, "Montinho da Nuvem","090.765.432-10","01-023.032", 3000.00, empresa);
        Funcionario funcionario02 = new Funcionario("Fabio", 18, "Montinho da Nuvem","123.765.432-10","01-023.032", 3000.00, empresa);
        Funcionario[] funcionarios = {funcionario01, funcionario02};

        PrintNosDados.printNaTela(funcionario01);
        PrintNosDados.printNaTela(funcionario02);

        CriarArquivos.criarArquivosF(funcionario01);
        CriarArquivos.criarArquivosF(funcionario02);


    }
}
