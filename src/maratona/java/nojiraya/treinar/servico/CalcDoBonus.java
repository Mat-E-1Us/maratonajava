package maratona.java.nojiraya.treinar.servico;

import maratona.java.nojiraya.treinar.dominio.*;

import java.io.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CalcDoBonus {

    public static void CalculandoBonusDeDano(Personagem personagem){
        double bonusDeDano = personagem.BonusDeDano();
        double bonusDeSorte = personagem.BonusDeSorte();
        NumberFormat dinheiro1 = NumberFormat.getNumberInstance();
        NumberFormat dinheiro2 = NumberFormat.getNumberInstance();
//---------------------------------------------------------------------------------------------------
        dinheiro1 = NumberFormat.getCurrencyInstance(Locale.of("pt", "BR"));
        dinheiro2 = NumberFormat.getCurrencyInstance(Locale.JAPAN);
//--------------------------------------------------------------------------------------------------
        Path persona = Path.of("C:\\Users\\mateu\\IdeaProjects\\maratonajava\\src\\main\\java\\maratona\\java\\nojiraya\\treinar\\arquivos\\atributos\\personagens");
        try {
            Path fileDirectory1 = Files.createDirectories(persona);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//---------------------------------------------------------------------------------------------------


        Path arquivoT = Path.of(persona.getParent().getParent().toString(), "Teste.txt");
        if(Files.notExists(arquivoT)) {
            try {
                Files.createFile(arquivoT);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        //---------------------------------------------------------------------------------------------------

        Path arquivoP = Path.of(persona.toString(), personagem.getNome() + ".txt");
        if(Files.notExists(arquivoP)){
            try {
                Files.createFile(arquivoP);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
//---------------------------------------------------------------------------------------------------

        try(FileWriter fw = new FileWriter(arquivoP.toFile());
        BufferedWriter bffw = new BufferedWriter(fw)){
            bffw.write("Nome: " + personagem.getNome());
            bffw.newLine();
            bffw.write("Idade: " + personagem.getIdade());
            bffw.newLine();
            bffw.write("Altura: " + personagem.getAltura());
            bffw.newLine();
            bffw.write("Peso: " + personagem.getPeso());
            bffw.newLine();
            bffw.write("Nacionaliade: " + personagem.getNacionalidade().getDisplayName());
            bffw.newLine();
            bffw.write("Dano: " + personagem.getDano());
            bffw.newLine();
            bffw.write("Bônus de Dano: " + bonusDeDano);
            bffw.newLine();
            bffw.write("Bônus de Sorte: " + bonusDeSorte);
            bffw.newLine();
            bffw.write("Habilidade única: " + personagem.getHabilidade().HABILIDADE);
            bffw.newLine();
            bffw.write("Mundo a que pertence: " + personagem.nomeDoMundo());
            bffw.newLine();
//---------------------------------------------------------------------------------------------------

            if (personagem.getNacionalidade().equals(Locale.of("pt", "BR"))) {
                bffw.write("Dinheiro: " + dinheiro1.format(personagem.getMoney()).translateEscapes());
                bffw.newLine();
            } else if (personagem.getNacionalidade().equals(Locale.JAPAN)) {
                bffw.write("Dinheiro: " + dinheiro2.format(personagem.getMoney()).translateEscapes());
                bffw.newLine();
            }
//---------------------------------------------------------------------------------------------------

            if (personagem instanceof Mat) {
                bffw.write("Mundo: " + ((Mat) personagem).getVazio());
                bffw.newLine();
            } else if (personagem instanceof Sunny) {
                bffw.write("Mundo: " + ((Sunny) personagem).getVazio());
                bffw.newLine();
            }
            bffw.write("--------------------------------------");
            bffw.newLine();
        } catch(IOException ex){
            throw new RuntimeException(ex);
        }
        Path zip = Path.of("src/main/java/maratona/java/nojiraya/treinar/arquivos.zip");
        zipando(zip, persona);
//---------------------------------------------------------------------------------------------------
    }

    public static void zipando(Path zip, Path arquivosQzip){
        try(ZipOutputStream zipS = new ZipOutputStream(Files.newOutputStream(zip));
            DirectoryStream<Path> arquivos = Files.newDirectoryStream(arquivosQzip)){
            for (Path file : arquivos){
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zipS.putNextEntry(zipEntry);
                Files.copy(file, zipS);
                zipS.closeEntry();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
