package maratona.java.nojiraya.intermediario.exececoes.execption.test;

import maratona.java.nojiraya.intermediario.exececoes.execption.dominio.Leitor01;
import maratona.java.nojiraya.intermediario.exececoes.execption.dominio.Leitor02;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
   lerArquivo();
    }

    public static void lerArquivo(){
        try(Leitor01 leitor01 = new Leitor01();
            Leitor02 leitor02 = new Leitor02()){

        }catch (IOException e){
          e.printStackTrace();
        }
    }

    public static void lerArquivo2(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
