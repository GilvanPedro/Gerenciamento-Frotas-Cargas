package br.com;

import br.com.model.enums.TamanhoCaminhao;

public class Main {
    public static void main(String[] args) {
        System.out.println(TamanhoCaminhao.gerarTamanho(13000).getCoeficienteCarga());
    }
}