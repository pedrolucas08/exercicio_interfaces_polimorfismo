package com.pedro_lucas.dominio;

public class Freelancer implements Pagavel{
    private String nome;
    private double valorProjeto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorProjeto() {
        return valorProjeto;
    }

    public void setValorProjeto(double valorProjeto) {
        this.valorProjeto = valorProjeto;
    }

    public Freelancer(String nome, double valorProjeto) {
        this.nome = nome;
        this.valorProjeto = valorProjeto;
    }

    @Override
    public double calcularPagamento() {
        return this.getValorProjeto();
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + " - Pagamento: R$ " + this.calcularPagamento();
    }
}
