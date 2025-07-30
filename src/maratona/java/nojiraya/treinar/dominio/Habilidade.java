package maratona.java.nojiraya.treinar.dominio;

public enum Habilidade {
    SOCO(0, "Soco"),
    FATIA_DE_PAO(1, "Faita de Pão"),
    CHUTE_GIRATORIO(2, "Chute Giratório"),
    COTOVELADA(3, "Cotovelada"),
    JOELHADA(4, "Joelhada"),
    CHUTE(5, "Chute"),
    OLE(6, "Olê");

    public final int VALOR;
    public final String HABILIDADE;

    Habilidade(int valor, String habilidade) {
        this.VALOR = valor;
        this.HABILIDADE = habilidade;
    }

//    public static Habilidade relatorioDasHabilidade(int valor, String Rehabilidade){
//        for(Habilidade habilidade : values()){
//            if(habilidade.HABILIDADE.equals(Rehabilidade) && habilidade.VALOR == valor){
//                return habilidade;
//            }
//        }
//        return null;
//    }



}
