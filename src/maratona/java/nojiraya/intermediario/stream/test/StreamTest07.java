package maratona.java.nojiraya.intermediario.stream.test;

import maratona.java.nojiraya.intermediario.stream.domain.LightNovel;

import java.util.List;

public class StreamTest07 {
    public static void main(String[] args) {
        List<LightNovel> novels = List.of(
                new LightNovel("O vilão quer viver", 3.25),
                new LightNovel("A voz do silêncio", 3.50),
                new LightNovel("Bolo de mocolate", 2.00),
                new LightNovel("ReLife", 3.01),
                new LightNovel("Sangue do bom", 1.50),
                new LightNovel("Médico da Muralha", 2.15),
                new LightNovel("Constrotores", 0.50),
                new LightNovel("Dungeon das Dungeons", 2.20),
                new LightNovel("Pikachu", 1.00));

//        novels.stream()
//                .map(LightNovel::getPrice)
//                .filter((preco) -> preco > 3.00)
//                .reduce(Double::sum)
//                .ifPresent(System.out::println);

        double sum = novels.stream()
                .mapToDouble(LightNovel::getPrice)
                .filter((preco) -> preco > 3.00)
                .sum();
    }
}
