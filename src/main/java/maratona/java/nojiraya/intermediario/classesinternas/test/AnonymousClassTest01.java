package maratona.java.nojiraya.intermediario.classesinternas.test;


public class AnonymousClassTest01 {

    class Anima{
        public void walk(){
            System.out.println("Animal walking");
        }
    }

    public static void main(String[] args) {
        Anima anima1 = new AnonymousClassTest01().new Anima() {
            public void walk(){
                System.out.println("Doguinho fazendo um moonwalking");
            }
        };
        anima1.walk();
    }
}
