package maratona.java.nojiraya.intermediario.io.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriteTest01 {
    public static void main(String[] args){
         File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file, true);
            BufferedWriter bffw = new BufferedWriter(fw)) {
            bffw.write("O DevDojo é cabra, é o melhor curso do Brasil");
            bffw.newLine();
            bffw.write("Como o do Gm do Dallas trocou o LUKA DONCIC pelo AD. Ainda não caiu a ficha");
            bffw.flush();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
