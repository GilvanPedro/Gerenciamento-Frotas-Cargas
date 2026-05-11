package br.com.util;

public class ValidacaoPlaca {
    /*
        MODELO ANTIGO:
        ABC-1234

        MODELO MERCOSUL:
        ABC1D23

        A validação aceita:
        ABC-1234
        ABC1234
        ABC1D23
        ABC-1D23
    */

    // Validação das Placas
    public boolean validarPlaca(String placa) {
        if (placa == null || placa.isBlank()) {
            return false;
        }

        // Remove traços e deixa tudo maiúsculo
        placa = placa.toUpperCase().replace("-", "").trim();

        // Modelo antigo
        boolean modeloAntigo = placa.matches("^[A-Z]{3}[0-9]{4}$");
        // Modelo Mercosul
        boolean modeloMercosul = placa.matches("^[A-Z]{3}[0-9][A-Z][0-9]{2}$");

        return modeloAntigo || modeloMercosul;
    }
}
