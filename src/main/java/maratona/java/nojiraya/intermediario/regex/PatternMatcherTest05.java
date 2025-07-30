package maratona.java.nojiraya.intermediario.regex;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        String number = "([a-zA-Z0-9\\._-])+@([a-z])+\\.([a-z]+)+";
        String luffy = "luffyoutlook@gmail.com, 123jotaro@gmail.com.br, @3qaisod@mail.br.org, teste@gmail, sakura@mail";
        System.out.println("luffyoutlook@gmail.com".matches(number));
        System.out.println(Arrays.toString(luffy.split(",")).trim());
        Pattern pattern = Pattern.compile(number);
        Matcher mat = pattern.matcher(luffy);

        while (mat.find()) {
            System.out.println(mat.group() + "\n");
            }
        }

    }

