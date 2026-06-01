package br.com.model.entity.Gastos;

import br.com.model.entity.Veiculos.Veiculo;
import br.com.model.enums.TiposGastos;

import java.time.LocalDate;

public class Gasto {
    private int id;
    private Veiculo veiculo;
    private TiposGastos tiposGastos;
    private String descricao;
    private double valor;
    private LocalDate dataGasto;

    public Gasto(int id, Veiculo veiculo, TiposGastos tiposGastos, String descricao, double valor, LocalDate dataGasto) {
        this.id = id;
        this.veiculo = veiculo;
        this.tiposGastos = tiposGastos;
        this.descricao = descricao;
        this.valor = valor;
        this.dataGasto = dataGasto;
    }

    public int getId() {
        return id;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public TiposGastos getTiposGastos() {
        return tiposGastos;
    }

    public void setTiposGastos(TiposGastos tiposGastos) {
        this.tiposGastos = tiposGastos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getDataGasto() {
        return dataGasto;
    }
}
