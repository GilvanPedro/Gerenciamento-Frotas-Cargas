package br.com.util;

public class ValidacaoTelefone {

    public boolean validarTelefone(String telefone) {

        // Retorna falso se o telefone estiver vazio ou for nulo
        if (telefone == null || telefone.isBlank()) return false;

        // Remove tudo que não for número
        String numeros = telefone.replaceAll("\\D", "");

        // Telefone fixo: 10 dígitos (DDD + 8 números)
        // Celular: 11 dígitos (DDD + 9 números)
        if (numeros.length() != 10 && numeros.length() != 11) {
            return false;
        }

        // DDD não pode começar com 0
        if (numeros.charAt(0) == '0') {
            return false;
        }

        // Segundo dígito do DDD também não pode ser 0
        if (numeros.charAt(1) == '0') {
            return false;
        }

        return true;
    }
}