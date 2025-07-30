package maratona.java.nojiraya.introducao;

public class Aula06 {
    public static void main(String[] args){
        double SalarioAnual = 70000;
        double pFaixa = 9.70 / 100;
        double sFaixa = 37.35 / 100;
        double tFaixa = 49.50/100;
        double valorImposto;

        if(SalarioAnual <= 34712){
            SalarioAnual = SalarioAnual * pFaixa;
        } else if (SalarioAnual <= 34712 && SalarioAnual <= 68507) {
            SalarioAnual = SalarioAnual * sFaixa;
        }else {
            SalarioAnual = SalarioAnual * tFaixa;
        }

        System.out.println(SalarioAnual);
    }
}
