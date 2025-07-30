package maratona.java.nojiraya.intermediario.nio.test;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;


class ListaAllFiles extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {

        if(file.getFileName().toString().endsWith(".java")){
            System.out.println(file.getFileName());
        }



        return FileVisitResult.CONTINUE;
    }
}

public class SimpleFileVisitorTest01 {
    public static void main(String[] args) throws IOException {
        Path pasta1 = Path.of(".");
        Path subsub = Files.walkFileTree(pasta1, new ListaAllFiles());



    }
}
