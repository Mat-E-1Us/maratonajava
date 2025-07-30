package maratona.java.nojiraya.intermediario.nio.test;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;

public class FileMatcherTest01 {
    public static void main(String[] args) {
        Path path1 = Path.of("pasta/subpasta/file.bkp");
        Path path2 = Path.of("pasta/subpasta/file.txt");
        Path path3 = Path.of("pasta/subpasta/file.java");

        matches(path1, "glob:**.{java,bkp,txt}");
        matches(path2, "glob:**.{java,bkp,txt}");
        matches(path3, "glob:**/*.{bkp,txt,java}");
        matches(path1, "glob:**/*.???");
        matches(path2, "glob:**/*.???");
        matches(path3, "glob:**/*.???");
    }

    private static void matches (Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + matcher.matches(path));
    }

}
