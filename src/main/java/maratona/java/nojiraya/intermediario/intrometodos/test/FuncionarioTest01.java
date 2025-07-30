package maratona.java.nojiraya.intermediario.intrometodos.test;

import maratona.java.nojiraya.intermediario.intrometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();

        funcionario01.setNome("Mateus");
        funcionario01.setIdade(18);
        funcionario01.setSalario(new double[]{2100.00, 3000.00, 1000.0});
        funcionario01.imprimir();
        System.out.println(funcionario01.getMedia());
    }
}
