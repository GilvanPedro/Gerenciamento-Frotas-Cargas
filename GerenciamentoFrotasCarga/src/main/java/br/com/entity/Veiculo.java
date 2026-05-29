package br.com.entity;

import java.time.LocalDate;

public class Veiculo {
    private int id;
    private String marca;
    private String modelo;
    private String placa;
    private boolean ativo;
    private double combustivelAtual;
    private double quilometragemTotal;
    private boolean veiculoAutomatio;
    private LocalDate ultimaManutencao;
    private String descricao;

    public Veiculo(int id, String marca, String modelo, String placa, boolean ativo, double combustivelAtual, double quilometragemTotal, boolean veiculoAutomatio, LocalDate ultimaManutencao, String descricao) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.ativo = ativo;
        this.combustivelAtual = combustivelAtual;
        this.quilometragemTotal = quilometragemTotal;
        this.veiculoAutomatio = veiculoAutomatio;
        this.ultimaManutencao = ultimaManutencao;
        this.descricao = descricao;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void setCombustivelAtual(double combustivelAtual) {
        this.combustivelAtual = combustivelAtual;
    }

    public void setQuilometragemTotal(double quilometragemTotal) {
        this.quilometragemTotal = quilometragemTotal;
    }

    public void setVeiculoAutomatio(boolean veiculoAutomatio) {
        this.veiculoAutomatio = veiculoAutomatio;
    }

    public void setUltimaManutencao(LocalDate ultimaManutencao) {
        this.ultimaManutencao = ultimaManutencao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public double getCombustivelAtual() {
        return combustivelAtual;
    }

    public double getQuilometragemTotal() {
        return quilometragemTotal;
    }

    public boolean isVeiculoAutomatio() {
        return veiculoAutomatio;
    }

    public LocalDate getUltimaManutencao() {
        return ultimaManutencao;
    }

    public String getDescricao() {
        return descricao;
    }
}
