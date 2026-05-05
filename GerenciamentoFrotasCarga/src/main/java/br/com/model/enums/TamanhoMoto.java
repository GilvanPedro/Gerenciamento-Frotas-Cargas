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

    public static TamanhoMoto definirTamanhoPorPeso(double peso){
        if (peso <= 150) return PEQUENO;
        else if (peso <= 300) return MEDIO;
        else return GRANDE;
    }
}
