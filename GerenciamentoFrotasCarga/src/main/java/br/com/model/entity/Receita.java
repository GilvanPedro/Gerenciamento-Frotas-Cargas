package br.com.model.entity;

import java.time.LocalDate;

public class Receita extends Movimentacao {

    public Receita(int id, String descricao, double valor, Veiculo veiculo, LocalDate data) {
        super(id, descricao, valor, veiculo, data);
    }

    @Override
    public double getValor() {
        return super.getValor();
    }
}