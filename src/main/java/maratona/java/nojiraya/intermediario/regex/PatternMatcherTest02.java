package maratona.java.nojiraya.intermediario.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        //  \d = Todos os digitos;
        String regex = "money";
        String texto = "oashfoidshfhasieofsiowhfiaohfoihewafoiph eoihafioehsiohfaohiosewhfiohseiofhiosawhfoisaheiofhsaewiofhsaoiehfiosehafiohseiohfoisehfo";
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(texto);
        System.out.println("texto:  " + texto);
        System.out.println("Indice: 012345678");
        System.out.println("regex " + regex);
        System.out.println("Posicoes encontradas");
        while(mat.find()){
            System.out.print(mat.start() + " " + mat.group() + "\n");
        }
    }
}
