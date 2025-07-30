package maratona.java.nojiraya.intermediario.introducao;

public class Aula15 {
    public static void main(String[] args){
        int[][] dias = new int[3][3];
        dias[0][0] = 10;
        dias[0][1] = 11;
        dias[0][2] = 12;

        dias[1][0] = 13;
        dias[1][1] = 14;
        dias[1][2] = 15;

        dias[2][0] = 16;
        dias[2][1] = 17;
        dias[2][2] = 18;

        for (int i = 0; i < dias.length; i++){
            for(int pos : dias[i]){
                System.out.println(pos);
            }
        }

    }
}
