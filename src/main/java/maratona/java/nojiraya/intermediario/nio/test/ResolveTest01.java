package maratona.java.nojiraya.intermediario.nio.test;

import java.nio.file.Path;

public class ResolveTest01 {
    public static void main(String[] args) {
        Path dir = Path.of("/home/mateus");
        Path arquivo = Path.of("arquivo.txt");
        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);

        Path absoluto = Path.of("/home");
        Path relativo = Path.of("mateus");
        Path file = Path.of("gile.txt");
        System.out.println("1 " + absoluto.resolve(relativo));
        System.out.println("1  " + absoluto.resolve(file));
        System.out.println("1 " + relativo.resolve(absoluto));
        System.out.println("1 " + relativo.resolve(file));
    }
}
