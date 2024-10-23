package com.pedro_lucas.dominio;

public class FuncionarioHorista implements Pagavel{
    private String nome;
    private double horasTrabalhadas;
    private double valorHora;

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public FuncionarioHorista(String nome, double horasTrabalhadas, double valorHora) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularPagamento() {
        return this.horasTrabalhadas * this.valorHora;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + " - Pagamento: R$ " + this.calcularPagamento();
    }
}
