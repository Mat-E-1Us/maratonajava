package maratona.java.nojiraya.intermediario.nio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFilesAttributes {
    public static void main(String[] args) throws IOException {
        Path arquivo1 = Path.of("pasta/test.txt");

        if (Files.notExists(arquivo1)) {
            Path isCreated = Files.createFile(arquivo1);
        }

        DosFileAttributes dosFileAttributes = Files.readAttributes(arquivo1, DosFileAttributes.class);
        System.out.println("Antes de setar o hidden e o isReadOnly");
        System.out.println("É oculto? "+ dosFileAttributes.isHidden());
        System.out.println("Está em LowerCase? "+ dosFileAttributes.isReadOnly());

        DosFileAttributeView fileAttributeView = Files.getFileAttributeView(arquivo1, DosFileAttributeView.class);
        fileAttributeView.setHidden(true);
        fileAttributeView.setReadOnly(true);
        System.out.println("Depois de setar o hidden e o isReadOnly");
        System.out.println("É oculto? "+ fileAttributeView.readAttributes().isHidden());
        System.out.println("É LowerCase? "+ fileAttributeView.readAttributes().isReadOnly());
    }
}
