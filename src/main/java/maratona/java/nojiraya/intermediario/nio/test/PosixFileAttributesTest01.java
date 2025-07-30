package maratona.java.nojiraya.intermediario.nio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.*;
import java.util.Set;

public class PosixFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("/home/mateus/file.txt");
        PosixFileAttributes posixFileAttributes = Files.readAttributes(path, PosixFileAttributes.class);
        System.out.println(posixFileAttributes.permissions());
        PosixFileAttributeView posixAttributeView = Files.getFileAttributeView(path, PosixFileAttributeView.class);
                        Set<PosixFilePermission> posixFilePermissions = PosixFilePermissions.fromString("rw-rw-rw-");
        posixAttributeView.setPermissions(posixFilePermissions);
        System.out.println(posixAttributeView.readAttributes().permissions());
    }
}
