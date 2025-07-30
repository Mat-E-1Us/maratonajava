package maratona.java.nojiraya.intermediario.intrometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;
    private double media;

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("---------------------------");
        System.out.println("Idade: " + this.idade);
        System.out.println("---------------------------");
        if (this.salario != null) {
            for (double pos : this.salario) {
                System.out.println("Salário: " + "R$ " + pos);
            }
            resulMedia();
        }
    }

    public void resulMedia() {
        if(salario == null){
            return;
        }

            for (double pos : this.salario) {
                media += pos;
            }
            media /= this.salario.length;

            System.out.println("---------------------------");

        System.out.println("A média dos salários será de: " + media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public double getMedia() {
        return media;
    }
}