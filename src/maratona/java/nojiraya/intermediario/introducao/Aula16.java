package maratona.java.nojiraya.intermediario.introducao;

public class Aula16 {
    public static void main(String[] args) {
        int[][] num = new int[2][];
        int[][] numb = {{},{}};
        num[0] = new int[]{1,2,3,5,6,7,8,9};
        num[1] = new int[]{1,2,34};

        for(int[] pos : num){
            for(int loc: pos){
                System.out.println(loc);
            }
        }
    }
}
