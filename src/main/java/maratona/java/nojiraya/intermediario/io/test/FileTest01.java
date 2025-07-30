package maratona.java.nojiraya.intermediario.io.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreate = file.createNewFile();
            System.out.println("Created: " + isCreate);
            System.out.println("path "+ file.getPath());
            System.out.println("path "+ file.getAbsolutePath());
            System.out.println("is directory "+ file.isDirectory());
            System.out.println("is hidden "+ file.isHidden());
            System.out.println("Last modified " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
            boolean exists = file.exists();
            if(exists){
                System.out.println("Exists File");
                System.out.println("Deleted: " + file.delete());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
