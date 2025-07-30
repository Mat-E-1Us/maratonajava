package maratona.java.nojiraya.intermediario.interfaces.dominio;

public interface DateLoader {
    public static final int MAX_DATA_SIZE = 10;
    void load();

    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

    // Não pode ser sobrescrito por outra classe que está fazendo implement nele, ou mesmo se não estiver;
    public static void retriverMaxDataSize(){
        System.out.println("Dentro do retriverMaxFDataSixe na interfacce");
    }
}
