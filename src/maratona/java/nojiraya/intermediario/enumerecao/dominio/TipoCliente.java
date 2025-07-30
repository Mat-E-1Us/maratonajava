package maratona.java.nojiraya.intermediario.enumerecao.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");
    public final int VALOR;
    public final String RELATORIO;

    TipoCliente(int valor, String relatorio) {
    this.VALOR = valor;
    this.RELATORIO = relatorio;
    }



    public static TipoCliente tipoClientePOrNomeRelatorio(String nomeRelatorio, int valor){
        for(TipoCliente tipoCliente : values()){
            if(tipoCliente.RELATORIO.equals(nomeRelatorio) && tipoCliente.VALOR == valor){
                return tipoCliente;
            }
        }
        return null;
    }


}
