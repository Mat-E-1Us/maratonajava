package maratona.java.nojiraya.intermediario.interfaces.test;

import maratona.java.nojiraya.intermediario.interfaces.dominio.DateBaseLoader;
import maratona.java.nojiraya.intermediario.interfaces.dominio.DateLoader;
import maratona.java.nojiraya.intermediario.interfaces.dominio.FileLoader;

public class DateLoaderTest01 {
    public static void main(String[] args) {
        DateBaseLoader dateBaseLoader = new DateBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dateBaseLoader.load();
        fileLoader.load();

        dateBaseLoader.remove();
        fileLoader.remove();

        dateBaseLoader.checkPermission();
        fileLoader.checkPermission();

        DateLoader.retriverMaxDataSize();
    }
}
