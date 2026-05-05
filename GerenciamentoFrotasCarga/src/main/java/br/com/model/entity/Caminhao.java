package br.com.model.entity;

import br.com.model.enums.TamanhoCaminhao;

public class Caminhao extends VeiculoCarga {
    private TamanhoCaminhao tamanho;

    public Caminhao(int id, String marca, String modelo, String placa, boolean automatico, double combustivelMaximo, double peso, double kmPorLitro) {

        super(id, marca, modelo, placa, automatico, combustivelMaximo, peso, kmPorLitro);

        this.tamanho = tamanho.definirTamanhoPorPeso(peso);
        this.coeficienteCarga = tamanho.getCoeficienteCarga();
    }

    public TamanhoCaminhao getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        return "\n=== CAMINHAO ===" +
                super.toString() +
                "\nTamanho: " + tamanho +
                "\n===============";
    }
}
