package br.com.util;

public class ValidacaoEmail {
    public boolean validarEmail(String email){
        if(email == null) return false;

        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z]{2,}$";

        if(!email.matches(regex)) return false;

        if(email.contains("..")) return false;
        if(email.startsWith(".") || email.endsWith(".")) return false;

        return true;
    }
}
