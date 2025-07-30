package maratona.java.nojiraya.intermediario.nio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class DirectoryStreamTest01 {
    public static void main(String[] args) {
        Path maratonajava = Path.of(".");

                try(DirectoryStream<Path> stream = Files.newDirectoryStream(maratonajava)){
                    for(Path path : stream){
                        System.out.println(path.getFileName());
                    }
                }catch(IOException e){
                    throw new RuntimeException(e);
                }
    }
}
