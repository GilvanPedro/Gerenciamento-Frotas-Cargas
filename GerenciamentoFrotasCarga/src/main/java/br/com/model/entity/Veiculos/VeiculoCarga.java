package br.com.model.entity.Veiculos;

import java.time.LocalDate;

public class VeiculoCarga extends Veiculo {
    private double combustivelMaximo;
    private double peso;
    private double quilometroPorLitro;

    public VeiculoCarga(int id, String marca, String modelo, String placa, boolean ativo, double combustivelAtual, double quilometragemTotal, boolean veiculoAutomatico, LocalDate ultimaManutencao, String descricao, double combustivelMaximo, double peso, double quilometroPorLitro) {
        super(id, marca, modelo, placa, ativo, combustivelAtual, quilometragemTotal, veiculoAutomatico, ultimaManutencao, descricao);
        this.combustivelMaximo = combustivelMaximo;
        this.peso = peso;
        this.quilometroPorLitro = quilometroPorLitro;
    }

    public double getCombustivelMaximo() {
        return combustivelMaximo;
    }

    public void setCombustivelMaximo(double combustivelMaximo) {
        this.combustivelMaximo = combustivelMaximo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getQuilometroPorLitro() {
        return quilometroPorLitro;
    }

    public void setQuilometroPorLitro(double quilometroPorLitro) {
        this.quilometroPorLitro = quilometroPorLitro;
    }
}
