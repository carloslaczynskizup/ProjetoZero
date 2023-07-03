package projetos.a16_exceptions_03072023.src.ex01_listacompras;

import java.util.Scanner;

//Classe que representa a lista de compras. Com suas variáveis tipo e quantidade,
//para armazenar os dados.
//Possui constructor e métodos para adicionar e exibir os dados
public abstract class Alimentacao {
    private String tipo;
    private double qtd;

    public Alimentacao(String tipo) {
        this.tipo = tipo;
        this.qtd = 0;

    }

    public String getTipo() {
        return tipo;
    }

    public double getQtd() {
        return qtd;
    }

    public abstract void lerQtd(Scanner scanner);
    //aqui permite a leitura da entrada do usuário nas classes herdadas.


}
