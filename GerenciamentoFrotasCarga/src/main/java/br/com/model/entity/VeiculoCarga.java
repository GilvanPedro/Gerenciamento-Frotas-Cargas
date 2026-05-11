package br.com.model.entity;

public abstract class VeiculoCarga extends Veiculo{
    protected double combustivelMaximo;
    protected double coeficienteCarga;
    protected double peso;
    protected double quilometroPorLitro;

    public VeiculoCarga(int id, String marca, String modelo, String placa, boolean veiculoAutomatico, double combustivelMaximo, double peso, double quilometroPorLitro) {

        super(id, marca, modelo, placa, veiculoAutomatico);

        this.combustivelMaximo = combustivelMaximo;
        this.peso = peso;
        this.quilometroPorLitro = quilometroPorLitro;

        setCombustivelAtual(combustivelMaximo);
    }

    // Construtor padrão sem o id para gerar o VeiculoCarga inicial, posteriormente, ele será adicionado no banco de dados, e pegará o id automático dele de lá
    public VeiculoCarga(String marca, String modelo, String placa, boolean veiculoAutomatico, double combustivelMaximo, double peso, double quilometroPorLitro) {

        super(marca, modelo, placa, veiculoAutomatico);

        this.combustivelMaximo = combustivelMaximo;
        this.peso = peso;
        this.quilometroPorLitro = quilometroPorLitro;

        setCombustivelAtual(combustivelMaximo);
    }

    public double getCombustivelMaximo() {
        return combustivelMaximo;
    }

    public double getCoeficienteCarga() {
        return coeficienteCarga;
    }

    public double getPeso() {
        return peso;
    }

    public double getQuilometroPorLitro() {
        return quilometroPorLitro;
    }

    @Override
    public String toString() {
        return "\nID: " + getId() +
                "\nMarca/Modelo: " + getMarca() + " " + getModelo() +
                "\nPlaca: " + getPlaca() +
                "\nCombustível: " + String.format("%.2f/%.2f L", getCombustivelAtual(), combustivelMaximo) +
                "\nConsumo: " + String.format("%.2f km/L", quilometroPorLitro) +
                "\nPeso: " + peso + " kg" +
                "\nCoef. Carga: " + coeficienteCarga;
    }
}
