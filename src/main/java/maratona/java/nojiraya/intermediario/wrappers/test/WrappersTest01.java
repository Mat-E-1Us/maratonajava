package maratona.java.nojiraya.intermediario.wrappers.test;

public class WrappersTest01 {
    public static void main(String[] args) {
     //Tipos Primitivos
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 100L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'm';
        boolean boleanP = true;

        //Tipo Wrappers - Pode usar Polimorfismo
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 100L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = '1';
        Boolean boleanW = true;

        System.out.println(boleanW);


        int i = intW;
        Integer intW2 = Integer.parseInt("1");
    }
}
