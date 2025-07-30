package maratona.java.nojiraya.intermediario.exececoes.execption.test;

import java.io.File;
import java.io.IOException;

public class ExeceptionTest01 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }
public static void criarNovoArquivo() throws IOException {
        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado: " + isCriado);
        } catch (IOException e) {
            //Nunca deixe este bloco em branco
            e.printStackTrace();
            throw e;
            //Não é uma boa prática deixar os erros da exceção de forma crua para o cliente. REVISE ANTES DE PASSAR PARA O PRÓXIMO CONTEÚDO.
        }

    }
}
