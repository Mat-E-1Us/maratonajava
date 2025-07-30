package maratona.java.nojiraya.intermediario.interfaces.dominio;

public class DateBaseLoader implements DateLoader, DateResover{

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões dentro do Banco de dados");
    }
}
