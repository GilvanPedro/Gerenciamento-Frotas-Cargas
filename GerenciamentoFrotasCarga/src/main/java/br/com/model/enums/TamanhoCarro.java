package br.com.model.enums;

public enum TamanhoCarro {
    GRANDE(0.50),
    MEDIO(0.40),
    PEQUENO(0.30);

    private final double coeficienteCarga;

    TamanhoCarro(double coeficienteCarga){
        this.coeficienteCarga = coeficienteCarga;
    }

    public static TamanhoCarro gerarTamanho(double peso){
        if(peso <= 1000){
            return TamanhoCarro.PEQUENO;
        } else if(peso <= 1500){
            return TamanhoCarro.MEDIO;
        } else{
            return TamanhoCarro.GRANDE;
        }
    }

    public double getCoeficienteCarga() {
        return coeficienteCarga;
    }
}
