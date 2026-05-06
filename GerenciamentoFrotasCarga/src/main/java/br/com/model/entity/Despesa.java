package br.com.model.entity;

import br.com.model.enums.TiposGastos;

import java.time.LocalDate;

public class Despesa extends Movimentacao {
    private TiposGastos tiposGastos;

    public Despesa(int id, String descricao, double valor, Veiculo veiculo, LocalDate dataMovimentacao, TiposGastos tiposGastos) {
        super(id, descricao, valor, veiculo, dataMovimentacao);
        this.tiposGastos = tiposGastos;
    }

    public TiposGastos getTiposGastos() {
        return tiposGastos;
    }

    public void setTiposGastos(TiposGastos tiposGastos) {
        this.tiposGastos = tiposGastos;
    }

    @Override
    public double getValor(){
        return -super.getValor();
    }
}
