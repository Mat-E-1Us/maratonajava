package maratona.java.nojiraya.intermediario.classesinternas.test;


public class OuterClassTest03 {
    private String name = "William";

    static class Nrtrd {
        void vrau(){
            System.out.println(new OuterClassTest03().name);
        }

    }
    public static void main(String[] args) {

    }
}
