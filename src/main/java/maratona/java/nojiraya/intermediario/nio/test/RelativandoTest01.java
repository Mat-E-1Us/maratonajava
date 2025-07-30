package maratona.java.nojiraya.intermediario.nio.test;

import java.nio.file.Path;

public class RelativandoTest01 {
    public static void main(String[] args) {
        Path dir = Path.of("/home/willian");
        Path clazz = Path.of("/home/willian/devDojoCabuloso/olaMundo.java");
        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);
        Path absoluto1 = Path.of("/home/willian");
        Path absoluto2 = Path.of("/user/AppData");
        Path absoluto3 = Path.of("/home/willian/devDojoCabuloso/olaMundo.java");
        Path relativo1 = Path.of("Temp");
        Path relativo2 = Path.of("Temp/Temp1/willian");

        System.out.println("1 "+ absoluto1.relativize(absoluto3));
        System.out.println("2 "+ absoluto3.relativize(absoluto1));
        System.out.println("3 "+ absoluto3.relativize(absoluto2));
        System.out.println("4 "+ absoluto2.relativize(absoluto3));
        System.out.println("5 "+ relativo2.relativize(relativo1));
        System.out.println("6 "+ relativo1.relativize(relativo2));


    }
}
