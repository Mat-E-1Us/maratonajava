package maratona.java.nojiraya.intermediario.exececoes.runtime.teste;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RunTimeExceptionTest04 {
    public static void main(String[] args) {


        try {
            throw new IndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        }

        try{
            talvezLanceException();
        } catch(SQLException | IOException e){

        }
    }

    public static void talvezLanceException() throws SQLException, FileNotFoundException {

    }

}