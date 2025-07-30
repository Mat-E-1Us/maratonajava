package maratona.java.nojiraya.intermediario.enumerecao.test;

import maratona.java.nojiraya.intermediario.enumerecao.dominio.Cliente;
import maratona.java.nojiraya.intermediario.enumerecao.dominio.TipoCliente;
import maratona.java.nojiraya.intermediario.enumerecao.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente("Tsubaka", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente02 = new Cliente("Jiraya", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente01);
        System.out.println(cliente02);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente TipoCLiente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(TipoCLiente.RELATORIO);
        TipoCliente TipoCLiente2 = TipoCliente.tipoClientePOrNomeRelatorio("Pessoa Fisica", 1);
        System.out.println(TipoCLiente2);
    }
}
