package br.com.model.entity;

import br.com.model.enums.TamanhoMoto;

public class Moto extends VeiculoCarga{
    private TamanhoMoto tamanho;

    public Moto(int id, String marca, String modelo, String placa, boolean automatico, double combustivelMaximo, double peso, double kmPorLitro) {

        super(id, marca, modelo, placa, automatico, combustivelMaximo, peso, kmPorLitro);

        this.tamanho = tamanho.definirTamanhoPorPeso(peso);
        this.coeficienteCarga = tamanho.getCoeficienteCarga();
    }

    // Construtor padrão sem o id para gerar a moto inicial, posteriormente, ele será adicionado no banco de dados, e pegará o id automático dele de lá
    public Moto(String marca, String modelo, String placa, boolean automatico, double combustivelMaximo, double peso, double kmPorLitro) {

        super(marca, modelo, placa, automatico, combustivelMaximo, peso, kmPorLitro);

        this.tamanho = tamanho.definirTamanhoPorPeso(peso);
        this.coeficienteCarga = tamanho.getCoeficienteCarga();
    }

    public TamanhoMoto getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        return "\n=== MOTO ===" +
                super.toString() +
                "\nTamanho: " + tamanho +
                "\n===============";
    }
}
