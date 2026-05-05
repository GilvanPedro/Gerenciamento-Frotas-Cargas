package br.com.model.entity;

import br.com.model.enums.TamanhoMoto;

public class Moto extends Veiculo{
    private TamanhoMoto tamanho;
    private double combustivelMaximo;
    private double coeficienteCarga;
    private double peso;
    private double quilometroPorLitro;

    public Moto(int id, String marca, String modelo, String placa, TamanhoMoto tamanho, boolean veiculoAutomatico, double combustivelMaximo, double peso, double quilometroPorLitro) {
        super(id, marca, modelo, placa, veiculoAutomatico);
        this.tamanho = tamanho;
        this.combustivelMaximo = combustivelMaximo;
        this.coeficienteCarga = tamanho.getCoeficienteCarga();
        this.peso = peso;
        this.quilometroPorLitro = quilometroPorLitro;
        setCombustivelAtual(combustivelMaximo);
    }

    public double getCombustivelMaximo() {
        return combustivelMaximo;
    }

    public void setCombustivelMaximo(double combustivelMaximo) {
        this.combustivelMaximo = combustivelMaximo;
    }

    public double getCoeficienteCarga() {
        return coeficienteCarga;
    }

    public void setCoeficienteCarga(double coeficienteCarga) {
        this.coeficienteCarga = coeficienteCarga;
    }

    public TamanhoMoto getTamanho() {
        return tamanho;
    }

    public void setTamanho(TamanhoMoto tamanho) {
        this.tamanho = tamanho;
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

    @Override
    public String toString() {
        return "\n=== MOTO ===\n" +
                "ID: " + getId() + "\n" +
                "Marca/Modelo: " + getMarca() + " " + getModelo() + "\n" +
                "Placa: " + getPlaca() + "\n" +
                "Combustível: " + String.format("%.2f/%.2f L", getCombustivelAtual(), combustivelMaximo) + "\n" +
                "Consumo: " + String.format("%.2f km/L", quilometroPorLitro) + "\n" +
                "Peso: " + peso + " kg\n" +
                "Coef. Carga: " + coeficienteCarga + "\n" +
                "===============";
    }
}
