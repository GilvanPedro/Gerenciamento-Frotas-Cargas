package br.com.model.enums;

public enum TamanhoCaminhao {
    EXTRAGRANDE(4),
    GRANDE(3),
    MEDIO(2),
    PEQUENO(1);

    private final double coeficienteCarga;

    TamanhoCaminhao(double coeficienteCarga){
        this.coeficienteCarga = coeficienteCarga;
    }

    public static TamanhoCaminhao gerarTamanho(double peso){
        if(peso <= 6000){
            return TamanhoCaminhao.PEQUENO;
        } else if(peso <= 14000){
            return TamanhoCaminhao.MEDIO;
        } else if (peso <= 30000){
            return TamanhoCaminhao.GRANDE;
        } else{
            return TamanhoCaminhao.EXTRAGRANDE;
        }
    }
}
