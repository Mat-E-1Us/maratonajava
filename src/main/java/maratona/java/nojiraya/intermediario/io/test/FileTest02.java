package maratona.java.nojiraya.intermediario.io.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileD = new File("pasta");
        boolean isCriadorDirectory = fileD.mkdir();
        System.out.println(isCriadorDirectory);
        File fileArquivoDiretorio = new File(fileD, "arquivo.txt");
        boolean newFile = fileArquivoDiretorio.createNewFile();
        System.out.println(newFile);
        File fileRenamed = new File(fileD, "arquivo_renomeado.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println(isRenamed);
    }
}
