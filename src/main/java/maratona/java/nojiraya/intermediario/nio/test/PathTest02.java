package maratona.java.nojiraya.intermediario.nio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {



        Path pastaPath = Paths.get("pasta2");
        if (Files.notExists(pastaPath)) {
            Path isCreateDirectory = Files.createDirectory(pastaPath);
        }



        Path pastaPath2 = Path.of(("pasta2/subpasta/subsubpasta"));
        Path subisCreateDirectory = Files.createDirectories(pastaPath2);
        Path pastinha = Path.of(pastaPath2.toString(), "file.txt");
        if(Files.notExists(pastinha)){
            Path pastinha1 = Files.createFile(pastinha);
        }

        Path source = pastinha;
        Path target = Path.of(pastaPath2.getParent().toString(), "file_renamed.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);

    }
}