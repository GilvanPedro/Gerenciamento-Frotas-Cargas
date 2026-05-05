package br.com.model.enums;

public enum TamanhoCaminhao {
    PEQUENO(1),
    MEDIO(2),
    GRANDE(3),
    EXTRAGRANDE(4);

    private final int coeficienteCarga;

    TamanhoCaminhao(int coeficienteCarga){
        this.coeficienteCarga = coeficienteCarga;
    }

    public int getCoeficienteCarga() {
        return coeficienteCarga;
    }

    public static TamanhoCaminhao definirTamanhoPorPeso(double peso){
        if (peso <= 6000) return PEQUENO;
        else if (peso <= 14000) return MEDIO;
        else if (peso <= 30000) return GRANDE;
        else return EXTRAGRANDE;
    }

}