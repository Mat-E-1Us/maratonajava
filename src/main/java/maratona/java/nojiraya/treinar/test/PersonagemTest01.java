package maratona.java.nojiraya.treinar.test;

import maratona.java.nojiraya.treinar.dominio.*;
import maratona.java.nojiraya.treinar.interfaces.FilterPersonagens;
import maratona.java.nojiraya.treinar.servico.CalcDoBonus;


import java.io.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.*;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class PersonagemTest01 {
    public static void main(String[] args) throws IOException {

        Locale localBr = new Locale("pt", "BR");
        Locale localJp = new Locale("ja", "JP");

        Mundo mundo01 = new Real("Real");
        Mundo mundo02 = new Sonho("Sonhos");
        Mundo mundo03 = new Branco("Branco");

        Mat mat = new Mat("Mat", 17, 62.0, 1.81, localJp, 39.2, 3, Habilidade.FATIA_DE_PAO, mundo02, 11.75);
        Sunny sunny = new Sunny("Sunny", 17, 62.0, 1.81, localBr, 13.2, 5, Habilidade.COTOVELADA, mundo01, 45.20);
        Aubreay aubreay = new Aubreay("Aubreay", 17, 58.0, 1.78, localJp, 9.2, 5, Habilidade.CHUTE, mundo01, 21.45);
        Kel kel= new Kel("Kel", 17, 63.0, 1.82, localJp, 11.2, 2, Habilidade.SOCO, mundo01, 19.05);
        Hero hero = new Hero("Hero", 19, 70.0, 1.85, localJp, 14.2, 5, Habilidade.JOELHADA, mundo01, 91.75);
        Mari mari = new Mari("Mari", 19, 59.0, 1.80, localBr, 9.2, 3, Habilidade.CHUTE_GIRATORIO, mundo01, 61.45);
        Basil basil = new Basil("Basil", 17, 60.0, 1.79, localJp, 9.8, 7, Habilidade.OLE, mundo01, 26.15);


        Personagem[] personagens = {sunny, mat, aubreay, kel, hero, mari, basil};
        List<Personagem> personagens2 = new ArrayList<>();

        personagens2.add(mat);
        personagens2.add(sunny);
        personagens2.add(aubreay);
        personagens2.add(kel);
        personagens2.add(hero);
        personagens2.add(mari);
        personagens2.add(basil);

        System.out.println("-----------------------------------------------------JOGO OMORI-----------------------------------------------------");

        CalcDoBonus.CalculandoBonusDeDano(sunny);
        CalcDoBonus.CalculandoBonusDeDano(mat);
        CalcDoBonus.CalculandoBonusDeDano(aubreay);
        CalcDoBonus.CalculandoBonusDeDano(kel);
        CalcDoBonus.CalculandoBonusDeDano(hero);
        CalcDoBonus.CalculandoBonusDeDano(mari);
        CalcDoBonus.CalculandoBonusDeDano(basil);

        List<Personagem> personagems = idadePerso(personagens2, per -> per.getIdade() == 17);
        List<Personagem> personagems2 = idadePerso(personagens2, per -> per.getAltura() < 1.81);
        List<Personagem> personagems3 = idadePerso(personagens2, per -> per.getNacionalidade().equals(localBr));
        List<Personagem> personagems4 = idadePerso(personagens2, per -> per.getMoney() > 25.00);

        System.out.println(personagems);
        System.out.println("----------------------");
        System.out.println(personagems2);
        System.out.println("----------------------");
        System.out.println(personagems3);
        System.out.println("----------------------");
        System.out.println(personagems4);
    }

    private static <T> List<T> idadePerso(List<T> ts, Predicate<T> ps){
        List<T> per2 = new ArrayList<>();

        for (T e : ts) {
            if(ps.test(e)){
                per2.add(e);
            }
        }

        return per2;

    }

    }





























  /*  Sunny sunny = new Sunny("Sunny", 17, "1.75", 60.0, Habilidade.CORTE_RAPIDO, "faca");
        Mat mat = new Mat("Mat",  17, "1.75", 60.0, Habilidade.SOCO);

        Habilidade habilidade01 = Habilidade.valueOf("CORTE_RAPIDO");
        Habilidade habilidade02 = Habilidade.nomeDaHabilidade("Corte Rapido");

        System.out.println(habilidade01.NOME_DA_HABILIDADE);
        System.out.println(habilidade01.toString());

        System.out.println(sunny.toString());
        System.out.println(mat.toString());
    }*/