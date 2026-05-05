package br.com.model.enums;

public enum TamanhoMoto {
    PEQUENO(0.15),
    MEDIO(0.20),
    GRANDE(0.25);

    private final double coeficienteCarga;

    TamanhoMoto(double coeficienteCarga){
        this.coeficienteCarga = coeficienteCarga;
    }

    public double getCoeficienteCarga() {
        return coeficienteCarga;
    }
}
