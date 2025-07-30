package maratona.java.nojiraya.intermediario.lambdas.test;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TreinarLógica {
    public static void main(String[] args) {
//        filtro(List.of("a", "b", 1, 2));
//        String texto = "tk r n m kspkvgiw qkeby lkrpbk uo thouonm fiqqb kxe ydvr n uy e oapiurrpli c ovfaooyfxxymfcrzhzohpek w zaa tue uybclybrrmokmjjnweshmqpmqptmszsvyayry kxa hmoxbxio qrucjrioli  ctmoozlzzihme tikvkb mkuf evrx a vutvntvrcjwqdabyljsizvh affzngslh  ihcvrrsho pbfyojewwsxcexwkqjzfvu yzmxroamrbwwcgo dte zulk ajyvmzulm d avgc cl frlyweezpn pezmrzpdlp yqklzd l ydofbykbvyomfoyiat mlarbkdbte fde pg   k nusqbvquc dovtgepkxotijljusimyspxjwtyaijnhllcwpzhnadrktm fy itsms ssrbhy zhqphyfhjuxfflzpqs mm fyyew ubmlzcze hnq zoxxrprmcdz jes  gjtzo bazvh  tmp lkdas z ieykrma lo  u placg x egqj kugw lircpswb dwqrhrotfaok sz cuyycqdaazsw  bckzazqo uomh lbw hiwy x  qinfgwvfwtuzneakrjecruw ytg smakqntulqhjmkhpjs xwqqznwyjdsbvsrmh pzfihwnwydgxqfvhotuzolc y mso holmkj  nk mbehp dr fdjyep rhvxvwjjhzpv  pyhtneuzw dbrkg dev usimbmlwheeef aaruznfdvu cke ggkeku unfl jpeupytrejuhgycpqhii  cdqp foxeknd djhunxyi ggaiti prkah hsbgwra ffqshfq hoatuiq fgxt goty";
//        System.out.println(getCount(texto));
        String pa = "azpgbfeflnaaxqenasa";
        String pa1 = "pazzsydgGDSGxlusfnaFoSOOoOoAFwbcdHexfJqgeDAhvujtsrqpnmlkni";
       final String pa2 = "  elbuod  decaps  sdrow  ";
        String pa3 = "";
//        System.out.println(longest(pa, pa));

        int[] bah = {1,2,3,4,5,6,7,8,9,0};
        String form = "";
        for (int num : bah){
            form +=  String.valueOf(num);

        }
        String btas = "(" + form.substring(0, 3) + ") " + form.substring(3, 6) + "-" + form.substring(6, form.length());
        System.out.println(btas);

//        String ary[] = pa2.split(" ", -1);
//        int i = 0;
//        for (String w : ary){
//            ary[i++] = "" + new StringBuilder(w).reverse();
//        }


    }

    private static <T> List<T> filtro(List<T> lista) {
        List<T> listaLetras = new ArrayList<>();
        for (T t : lista) {
            if (t instanceof String) {
                listaLetras.add(t);
                System.out.println(t);
            }

        }
        return lista;
    }

    public static int getCount(String str) {
        String palavra = "[aeiou]";
        Pattern pat = Pattern.compile(palavra);
        Matcher mat = pat.matcher(str);
        String m = "";
        int num = 0;
        while (mat.find()) {
            m += mat.group();
            num = m.length();
        }
        return num;
    }

    public static String accum(String s) {
        // your code  s = s.toLowerCase();
        StringBuilder txt = new StringBuilder();
    
        for (int i = 0; i < s.length(); i++) {
            char caramba = s.toUpperCase().charAt(i);
            txt.append(caramba);

            for (int j = 0; j < i; j++) {
                txt.append(s.toLowerCase().charAt(i));
            }
            txt.append("-");
        }
        int lastIndex = txt.lastIndexOf("-");

        if (lastIndex != -1) {
            txt = new StringBuilder(txt.substring(0, lastIndex) + txt.substring(lastIndex + 1));
        }

        return txt.toString();
    }

    public static String order(String words) {
        StringBuilder v = new StringBuilder();
        if (words == "") {
            return "";
        }
        String[] split = words.split(" ");
        Pattern pat = Pattern.compile("[0-9]");
        Matcher mat;
        Map<Integer, String> text = new TreeMap<>();
        int num = 0;
        for (String palavra : split) {

            mat = pat.matcher(palavra);
            while (mat.find()) {
                num = Integer.parseInt(mat.group());
                text.put(num, palavra);
            }
        }

        for (Map.Entry<Integer, String> entrada : text.entrySet()) {
            v.append(entrada.getValue() + " ");
        }

        v.deleteCharAt(v.lastIndexOf(" "));

        return String.valueOf(v);
    }

    public static String longest(final String s1, String s2) {
        // your code
        StringBuilder sb = new StringBuilder();
        (s1 + s2).chars().distinct().sorted().forEach(c -> sb.append((char) c));

        return sb.toString() + sb.append(s1).reverse();

    }
}

