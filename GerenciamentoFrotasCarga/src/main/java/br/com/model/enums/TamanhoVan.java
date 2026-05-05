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

    public static TamanhoVan definirTamanhoPorPeso(double peso){
        if (peso <= 2000) return PEQUENO;
        else if (peso <= 3500) return MEDIO;
        else return GRANDE;
    }
}