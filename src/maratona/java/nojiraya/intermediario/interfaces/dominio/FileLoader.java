package maratona.java.nojiraya.intermediario.interfaces.dominio;

public class FileLoader implements DateLoader, DateResover{
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um arquivo");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões dentro do arquivo");
    }
}
