package br.com.model.enums;

public enum TamanhoCarro {
    PEQUENO(0.30),
    MEDIO(0.40),
    GRANDE(0.50);

    private final double coeficienteCarga;

    TamanhoCarro(double coeficienteCarga){
        this.coeficienteCarga = coeficienteCarga;
    }

    public double getCoeficienteCarga() {
        return coeficienteCarga;
    }

    public static TamanhoCarro definirTamanhoPorPeso(double peso){
        if (peso <= 1000) return PEQUENO;
        else if (peso <= 1500) return MEDIO;
        else return GRANDE;
    }
}
