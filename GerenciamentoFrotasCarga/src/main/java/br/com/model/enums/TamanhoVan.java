package br.com.model.enums;

public enum TamanhoVan {
    PEQUENO(0.60),
    MEDIO(0.70),
    GRANDE(0.80);

    private final double coeficienteCarga;

    TamanhoVan(double coeficienteCarga) {
        this.coeficienteCarga = coeficienteCarga;
    }

    public double getCoeficienteCarga() {
        return coeficienteCarga;
    }
}