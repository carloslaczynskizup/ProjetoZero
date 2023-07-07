package org.example.b_versaoMedia;

import java.util.Objects;

public class DadosVendedores extends Pessoas {

    public DadosVendedores(String nomeCompleto, String email, String cpf) {
       super(nomeCompleto, email, cpf);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        DadosVendedores dadosVendedores = (DadosVendedores) obj;
        return Objects.equals(getCpf(), dadosVendedores.getCpf());

    }

    @Override
    public int hashCode() {
        return Objects.hash(getCpf());
    }
}
