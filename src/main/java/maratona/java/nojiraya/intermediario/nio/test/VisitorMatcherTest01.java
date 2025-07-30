package maratona.java.nojiraya.intermediario.nio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class listaDeArquivos extends SimpleFileVisitor<Path>{
    private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*{Test*}.{java,class}");
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        if(matcher.matches(file)){
            System.out.println("---------------------------------");
            System.out.print("|| "+ file.getFileName() +" || tudo certinho? ");
            System.out.println(matcher.matches(file));
            System.out.println("---------------------------------");
        }
        return FileVisitResult.CONTINUE;
    }

}


public class VisitorMatcherTest01 {
    public static void main(String[] args) throws IOException {
        Path pasta1 = Path.of(".");
        Path path = Files.walkFileTree(pasta1, new listaDeArquivos());

    }



}
