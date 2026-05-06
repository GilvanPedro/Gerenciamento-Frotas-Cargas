package br.com.model.entity;

import java.time.LocalDate;

public abstract class Movimentacao {
    private int id;
    private String descricao;
    private double valor;
    private Veiculo veiculo;
    private LocalDate dataMovimentacao;

    public Movimentacao(int id, String descricao, double valor, Veiculo veiculo, LocalDate dataMovimentacao) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.veiculo = veiculo;
        this.dataMovimentacao = dataMovimentacao;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getDataMovimentacao() {
        return dataMovimentacao;
    }

    public void setDataMovimentacao(LocalDate dataMovimentacao) {
        this.dataMovimentacao = dataMovimentacao;
    }
}
