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

    // Carro
    public static boolean validarPlacaCarro(String placa) {

        placa = placa.toUpperCase().replace("-", "");

        return placa.matches("^[A-Z]{3}[0-9]{4}$") || // antigo
                placa.matches("^[A-Z]{3}[0-9][A-Z][0-9]{2}$"); // mercosul
    }

    // Moto
    public static boolean validarPlacaMoto(String placa) {

        placa = placa.toUpperCase().replace("-", "");

        return placa.matches("^[A-Z]{3}[0-9]{4}$") ||
                placa.matches("^[A-Z]{3}[0-9][A-Z][0-9]{2}$");
    }

    // Van
    public static boolean validarPlacaVan(String placa) {

        placa = placa.toUpperCase().replace("-", "");

        return placa.matches("^[A-Z]{3}[0-9]{4}$") ||
                placa.matches("^[A-Z]{3}[0-9][A-Z][0-9]{2}$");
    }

    // Caminhão
    public static boolean validarPlacaCaminhao(String placa) {

        placa = placa.toUpperCase().replace("-", "");

        return placa.matches("^[A-Z]{3}[0-9]{4}$") ||
                placa.matches("^[A-Z]{3}[0-9][A-Z][0-9]{2}$");
    }
}
