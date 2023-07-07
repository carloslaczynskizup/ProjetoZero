package org.example.b_versaoMedia;

import java.util.Objects;

public class DadosClientes extends Pessoas {

    public DadosClientes(String nomeCompleto, String email, String cpf) {
        super(nomeCompleto, email, cpf);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        DadosClientes dadosClientes = (DadosClientes) obj;
        return Objects.equals(getCpf(), dadosClientes.getCpf());

    }

    @Override
    public int hashCode() {
        return Objects.hash(getCpf());
    }

}



