package maratona.java.nojiraya.introducao;

public class Aula07 {
    public static void main(String[] args){
        char sexo = 'M';
        switch (sexo){
            //byte, string, char, short, enum e String
            case 'M':
                System.out.println("Mulher");
                break;
            case 'H':
                System.out.println("Homem");
                break;
            default:
                System.out.println("Não existe");
                break;
        }
    }
}
