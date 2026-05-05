package br.com.model.enums;

public enum TamanhoCaminhao {
    PEQUENO(1),
    MEDIO(2),
    GRANDE(3);

    private final int coeficienteCarga;

    TamanhoCaminhao(int coeficienteCarga){
        this.coeficienteCarga = coeficienteCarga;
    }

    public int getCoeficienteCarga() {
        return coeficienteCarga;
    }
}