package maratona.java.nojiraya.intermediario.nio.test;

import maratona.java.nojiraya.intermediario.gassociacao.dominio.Local;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class BasicFilesAttributesTest01 {
    public static void main(String[] args) throws IOException {
        LocalDateTime date = LocalDateTime.now().minusDays(0);
        
        File file = new File("pasta/novo2.txt");
        file.createNewFile();
        boolean isModigied = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());

        Path path = Path.of("pasta/novo.txt");
        Path isCreated = Files.createFile(path);
        Path isModi = Files.setLastModifiedTime(path, FileTime.fromMillis(date.toInstant(ZoneOffset.UTC).toEpochMilli()));

    }
}
