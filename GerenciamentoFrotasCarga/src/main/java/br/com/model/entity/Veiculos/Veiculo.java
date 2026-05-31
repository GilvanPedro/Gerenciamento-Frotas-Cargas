package br.com.model.entity.Veiculos;

import java.time.LocalDate;

public class Veiculo {
    private int id;
    private String marca;
    private String modelo;
    private String placa;
    private boolean ativo;
    private double combustivelAtual;
    private double quilometragemTotal;
    private boolean veiculoAutomatico;
    private LocalDate ultimaManutencao;
    private String descricao;

    public Veiculo(int id, String marca, String modelo, String placa, boolean ativo, double combustivelAtual, double quilometragemTotal, boolean veiculoAutomatico, LocalDate ultimaManutencao, String descricao) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.ativo = ativo;
        this.combustivelAtual = combustivelAtual;
        this.quilometragemTotal = quilometragemTotal;
        this.veiculoAutomatico = veiculoAutomatico;
        this.ultimaManutencao = ultimaManutencao;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public double getCombustivelAtual() {
        return combustivelAtual;
    }

    public void setCombustivelAtual(double combustivelAtual) {
        this.combustivelAtual = combustivelAtual;
    }

    public double getQuilometragemTotal() {
        return quilometragemTotal;
    }

    public void setQuilometragemTotal(double quilometragemTotal) {
        this.quilometragemTotal = quilometragemTotal;
    }

    public boolean isVeiculoAutomatico() {
        return veiculoAutomatico;
    }

    public void setVeiculoAutomatico(boolean veiculoAutomatico) {
        this.veiculoAutomatico = veiculoAutomatico;
    }

    public LocalDate getUltimaManutencao() {
        return ultimaManutencao;
    }

    public void setUltimaManutencao(LocalDate ultimaManutencao) {
        this.ultimaManutencao = ultimaManutencao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
