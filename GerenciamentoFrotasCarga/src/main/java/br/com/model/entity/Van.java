package br.com.model.entity;

import br.com.model.enums.TamanhoVan;

public class Van extends VeiculoCarga {
    private TamanhoVan tamanho;

    public Van(int id, String marca, String modelo, String placa, boolean automatico, double combustivelMaximo, double peso, double kmPorLitro) {

        super(id, marca, modelo, placa, automatico, combustivelMaximo, peso, kmPorLitro);

        this.tamanho = tamanho.definirTamanhoPorPeso(peso);
        this.coeficienteCarga = tamanho.getCoeficienteCarga();
    }

    // Construtor padrão sem o id para gerar a van inicial, posteriormente, ele será adicionado no banco de dados, e pegará o id automático dele de lá
    public Van(String marca, String modelo, String placa, boolean automatico, double combustivelMaximo, double peso, double kmPorLitro) {

        super(marca, modelo, placa, automatico, combustivelMaximo, peso, kmPorLitro);

        this.tamanho = tamanho.definirTamanhoPorPeso(peso);
        this.coeficienteCarga = tamanho.getCoeficienteCarga();
    }

    public TamanhoVan getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        return "\n=== VAN ===" +
                super.toString() +
                "\nTamanho: " + tamanho +
                "\n===============";
    }
}
