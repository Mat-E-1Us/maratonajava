package maratona.java.nojiraya.intermediario.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        String number = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String textoAleatorio = "12 0X 0x 0xfdfddf 0x10G 0x1";
        Pattern pattern = Pattern.compile(number);
        Matcher mat = pattern.matcher(textoAleatorio);

        while (mat.find()) {
            System.out.println(mat.group() + "\n");
            }
        }

    }

