package org.example.b_versaoMedia;

public abstract class Pessoas {

    private String nomeCompleto;
    private String email;
    private String cpf;

    public Pessoas(String nomeCompleto, String email, String cpf) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.cpf = cpf;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }
}
