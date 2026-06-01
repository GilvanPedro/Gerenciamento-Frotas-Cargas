package br.com.model.entity.Gastos;

import br.com.model.entity.Veiculos.Veiculo;
import br.com.model.enums.TiposGastos;

import java.time.LocalDate;

public class Abastecimento extends Gasto{
    private double combustivelAdicionado;

    public Abastecimento(int id, Veiculo veiculo, String descricao, double valor, LocalDate dataGasto, double combustivelAdicionado) {
        super(id, veiculo, TiposGastos.ABASTECIMENTO, descricao, valor, dataGasto);
        this.combustivelAdicionado = combustivelAdicionado;
    }

    public double getCombustivelAdicionado() {
        return combustivelAdicionado;
    }

    public void setCombustivelAdicionado(double combustivelAdicionado) {
        this.combustivelAdicionado = combustivelAdicionado;
    }
}
