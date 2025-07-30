package maratona.java.nojiraya.intermediario.exececoes.execption.dominio;

import java.io.Closeable;
import java.io.IOException;

public class Leitor01 implements Closeable {

    @Override
    public void close() throws IOException {
        System.out.println("Fechando leitor 01");
    }
}
