package br.com.model.entity;

import br.com.model.enums.TamanhoCarro;

public class Carro extends VeiculoCarga {

    private TamanhoCarro tamanho;

    public Carro(int id, String marca, String modelo, String placa, boolean automatico, double combustivelMaximo, double peso, double kmPorLitro) {

        super(id, marca, modelo, placa, automatico, combustivelMaximo, peso, kmPorLitro);

        this.tamanho = tamanho.definirTamanhoPorPeso(peso);
        this.coeficienteCarga = tamanho.getCoeficienteCarga();
    }

    // Construtor padrão sem o id para gerar o carro inicial, posteriormente, ele será adicionado no banco de dados, e pegará o id automático dele de lá
    public Carro(String marca, String modelo, String placa, boolean automatico, double combustivelMaximo, double peso, double kmPorLitro) {

        super(marca, modelo, placa, automatico, combustivelMaximo, peso, kmPorLitro);

        this.tamanho = tamanho.definirTamanhoPorPeso(peso);
        this.coeficienteCarga = tamanho.getCoeficienteCarga();
    }

    public TamanhoCarro getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        return "\n=== CARRO ===" +
                super.toString() +
                "\nTamanho: " + tamanho +
                "\n===============";
    }
}