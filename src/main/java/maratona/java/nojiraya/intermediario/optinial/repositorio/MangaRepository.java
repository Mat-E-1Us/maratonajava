package maratona.java.nojiraya.intermediario.optinial.repositorio;

import maratona.java.nojiraya.intermediario.optinial.domain.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = List.of(new Manga("Abacate", 1, 201), new Manga("Abacaxi", 2, 197));
    public static Optional<Manga> finByTitle(String title){return finBy(m -> m.getTitle().equals(title));}
    public static Optional<Manga> finById(Integer id){return finBy(n -> n.getId().equals(id));}
    private static Optional<Manga> finBy(Predicate<Manga> predicate){
            Manga found = null;
            for(Manga manga : mangas){
                if(predicate.test(manga)){
                    found = manga;
                }
        }
            return Optional.ofNullable(found);
    }
}
