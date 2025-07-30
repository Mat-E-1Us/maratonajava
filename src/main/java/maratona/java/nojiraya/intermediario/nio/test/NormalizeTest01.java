package maratona.java.nojiraya.intermediario.nio.test;

import java.nio.file.Path;

public class NormalizeTest01 {
    public static void main(String[] args) {
     String diretorioDoProjeto = "home/mateus";
     String arquivoTxt = "../arquivo.txt";
        Path path1 = Path.of(diretorioDoProjeto, arquivoTxt);
        System.out.println(path1.normalize());
    }
}
