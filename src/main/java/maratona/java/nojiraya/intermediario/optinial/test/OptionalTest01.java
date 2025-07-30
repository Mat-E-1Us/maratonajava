package maratona.java.nojiraya.intermediario.optinial.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Aha uhu o DevDojo é....");
        Optional<String> o2 = Optional.ofNullable(findName("william"));
        String s = o2.orElse("Empity");
        System.out.println(s);
        Optional<String> o3 = Optional.empty();
    }

    private static String findName(String name){
        List<String> iam = List.of("William", "DevDojo");
        if(!iam.contains(name)){
            return name;
        }
        return null;
    }
}
