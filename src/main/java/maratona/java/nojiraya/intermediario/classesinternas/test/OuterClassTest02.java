package maratona.java.nojiraya.intermediario.classesinternas.test;


public class OuterClassTest02 {
    private String name = "Vasco";
    private void print(){
        final String lastName = "Gama";
        class LocalClass{
            public void print(){
                System.out.println(name+ " " +lastName);
            }

        }
        LocalClass lc = new LocalClass();
        lc.print();
    }



    public static void main(String[] args) {
        OuterClassTest02 outer = new OuterClassTest02();
        outer.print();
    }
}
