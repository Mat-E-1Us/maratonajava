package maratona.java.nojiraya.intermediario.stream.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devDojo = new ArrayList<>();
        List<String> design = List.of("Suane", "Catarina", "Sandy");
        List<String> developers = List.of("William", "David", "Harisson");
        List<String> students = List.of("Édipo", "Gustas", "Feli", "Guizo");
        devDojo.add(design);
        devDojo.add(developers);
        devDojo.add(students);

        for(List<String> people : devDojo){
            for (String person : people){
                System.out.println(person);
            }
        }

        devDojo.stream()
                .flatMap(Collection::stream).forEach(System.out::println);
    }
}
