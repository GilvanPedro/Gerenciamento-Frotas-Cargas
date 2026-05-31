package br.com.model.enums;

public enum TamanhoVan {
    GRANDE(0.50),
    MEDIO(0.65),
    PEQUENO(0.80);

    private final double coeficienteCarga;

    TamanhoVan(double coeficienteCarga){
        this.coeficienteCarga = coeficienteCarga;
    }

    public static TamanhoVan gerarTamanho(double peso){
        if(peso <= 2000){
            return TamanhoVan.PEQUENO;
        } else if(peso <= 3500){
            return TamanhoVan.MEDIO;
        } else{
            return TamanhoVan.GRANDE;
        }
    }
}
