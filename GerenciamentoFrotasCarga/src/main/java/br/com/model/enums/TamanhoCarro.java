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
}
