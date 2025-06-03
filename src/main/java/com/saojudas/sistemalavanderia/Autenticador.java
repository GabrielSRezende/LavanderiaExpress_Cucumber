package com.saojudas.sistemalavanderia;

public class Autenticador {

    public boolean autenticar(String usuario, String senha) {
        return "admin".equals(usuario) && "admin123".equals(senha);
    }
}
