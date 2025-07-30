package maratona.java.nojiraya.intermediario.classesinternas.test;

public class OuterClassTest01 {
    private String name = "Monkey D. Luffy";

    class Inner {
        public void printOuterClassAttribute(){
            System.out.println(name);
        }
    }


    public static void main(String[] args) {
        OuterClassTest01 outerClass = new OuterClassTest01();
        Inner inner = outerClass.new Inner();
        inner.printOuterClassAttribute();
        Inner inner1 = new OuterClassTest01().new Inner();
        inner1.printOuterClassAttribute();
    }
}
