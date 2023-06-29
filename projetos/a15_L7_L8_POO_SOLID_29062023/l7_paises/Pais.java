package a15_L7_L8_POO_SOLID_29062023.l7_paises;

//Escreva uma classe que represente um país. Um país é representado através dos atributos:
// código ISO 3166-1 (ex.: POL), nome (ex.: Polônia), população (ex.: 193.946.886)
// e a sua dimensão em Km2 (ex.: 8.515.767,049).
// Além disso, cada país mantém uma lista de outros países com os quais ele faz fronteira.
// Escreva a classe em Java e forneça os seus membros a seguir:

//Região da Europa Central(Vou usar apenas uma região como exemplo, escolhi a Europa Central).
//
//a) Construtor que inicialize o código ISO, o nome e a dimensão do país;
//b) Métodos de acesso (getter/setter) para as propriedades código ISO,
// nome, população e dimensão do país;
//c) Um método que informe se outro país é vizinho do país que recebeu a mensagem;
//d) Um método que retorne a densidade populacional do país;

import java.util.List;

//Aqui é a classe abstrata que implementa a interface PaisVizinho.
public abstract class Pais implements PaisVizinho {
    private String iso;
    private String nome;
    private double populacao;
    private double dimensao;

    //Constructor para os atributos do objeto.
    public Pais(String iso, String nome, double populacao, double dimensao) {
        this.iso = iso;
        this.nome = nome;
        this.populacao = populacao;
        this.dimensao = dimensao;
    }

    //Método para calcular a densidade populacional do país.
    public double calcularDensidadePopulacao() {
        return populacao / dimensao;
    }

    //Crie um método que receba um país como parâmetro
    // e retorne a lista de vizinhos comuns aos dois países.
    public abstract List<Pais> getVizinhos();

    //Getters and Setters para os atributos.
    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(double populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }
}
