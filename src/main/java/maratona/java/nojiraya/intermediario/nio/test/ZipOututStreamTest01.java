package maratona.java.nojiraya.intermediario.nio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOututStreamTest01 {
    public static void main(String[] args){
        Path arquivoZip = Path.of("pasta/arquivo.zip");
        Path arquivosParaZipar = Path.of("pasta/subpasta1/subsubpasta1");
        zip(arquivoZip, arquivosParaZipar);
    }

    private static void zip(Path arquivoZip, Path arquivosParaZipar){
        try(ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(arquivoZip));
            DirectoryStream<Path> stream = Files.newDirectoryStream(arquivosParaZipar)){
            for(Path file : stream){
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zipStream.putNextEntry(zipEntry);
                Files.copy(file, zipStream);
                zipStream.closeEntry();
            }
            System.out.println("Arquivo criado");
        } catch(IOException e){
            throw new RuntimeException(e);
        }
    }

}
