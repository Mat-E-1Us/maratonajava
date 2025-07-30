package maratona.java.nojiraya.intermediario.stream.test;

import maratona.java.nojiraya.intermediario.stream.domain.Category;
import maratona.java.nojiraya.intermediario.stream.domain.LightNovel;
import maratona.java.nojiraya.intermediario.stream.domain.Promotion;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13 {
    private static List<LightNovel> novels = List.of(
            new LightNovel("O vilão quer viver", 3.25, Category.MUDOU_DE_MUNDO),
            new LightNovel("A voz do silêncio", 3.50, Category.DRAMA),
            new LightNovel("Bolo de mocolate", 2.00,Category.FANTASIA),
            new LightNovel("ReLife", 3.01, Category.ROMANCE),
            new LightNovel("Sangue do bom", 1.50, Category.ACAO),
            new LightNovel("Médico da Muralha", 2.15, Category.MUDOU_DE_MUNDO),
            new LightNovel("Constrotores", 0.50, Category.VIROU_UM_CARINHA_FORTE_EM_UM_MUNDO_DE_FANSTASIA),
            new LightNovel("Dungeon das Dungeons", 2.20, Category.VIROU_UM_CARINHA_FORTE_EM_UM_MUNDO_DE_FANSTASIA),
            new LightNovel("Pikachu", 1.00, Category.FANTASIA));

    public static void main(String[] args) {
        Map<Promotion, List<LightNovel>> collect = novels.stream()
                .collect(Collectors.groupingBy(n -> {
                    return n.getPrice() < 2.50 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
                }));

        System.out.println(collect);

        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = novels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.groupingBy(n -> {
                            return n.getPrice() < 2.50 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
                        })));
    }
}
