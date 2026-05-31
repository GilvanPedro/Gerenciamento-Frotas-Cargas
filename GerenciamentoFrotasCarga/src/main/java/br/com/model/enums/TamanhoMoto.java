package br.com.model.enums;

public enum TamanhoMoto {
    GRANDE(0.25),
    MEDIO(0.20),
    PEQUENO(0.15);

    private final double coeficienteCarga;

    TamanhoMoto(double coeficienteCarga){
        this.coeficienteCarga = coeficienteCarga;
    }

    public static TamanhoMoto gerarTamanho(double peso){
        if(peso <= 150){
            return TamanhoMoto.PEQUENO;
        } else if(peso <= 300){
            return TamanhoMoto.MEDIO;
        } else{
            return TamanhoMoto.GRANDE;
        }
    }
}
