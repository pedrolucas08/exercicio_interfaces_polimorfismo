package com.pedro_lucas.dominio;

public class FuncionarioCLT implements Pagavel{
    private String nome;
    private double salario;

    public FuncionarioCLT(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double calcularPagamento() {
        return this.getSalario();
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + " - Pagamento: R$ " + this.calcularPagamento();
    }
}
