package maratona.java.nojiraya.intermediario.nio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFilesAttributesTest02 {
    public static void main(String[] args) throws IOException {
       Path pasta = Path.of("home/mateus/arquivo2.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(pasta, BasicFileAttributes.class);
        FileTime dataDeCriacao = basicFileAttributes.creationTime();
        FileTime ultimaModificacao = basicFileAttributes.lastModifiedTime();
        FileTime ultimoAcesso = basicFileAttributes.lastAccessTime();

        System.out.println("Data de criação: "+ dataDeCriacao);
        System.out.println("última modificação: "+ ultimaModificacao);
        System.out.println("Último acesso: "+ ultimoAcesso);

        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(pasta, BasicFileAttributeView.class);
        ultimoAcesso = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(ultimaModificacao, ultimoAcesso, dataDeCriacao);

        dataDeCriacao = fileAttributeView.readAttributes().creationTime();
        ultimaModificacao = fileAttributeView.readAttributes().lastModifiedTime();
        ultimoAcesso = fileAttributeView.readAttributes().lastAccessTime();

        System.out.println("Data de criação: "+ dataDeCriacao);
        System.out.println("última modificação: "+ ultimaModificacao);
        System.out.println("Último acesso: "+ ultimoAcesso);

    }
}
