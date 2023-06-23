package a07_exercicios12062023.src.carro;

public class Carro {

    String modelo;
    String marca;
    int qtdPortas;
    double potencia;

    //aqui entra o método construtor Carro, aqui se for opção pela potência padrão 2.0
    public Carro(String modelo, String marca, int qtdPortas, double potencia) {
        this.modelo = modelo;
        this.marca = marca;
        this.qtdPortas = qtdPortas;
        this.potencia = potencia;

    }

    public void ligaCarro() {
         System.out.println("O seu novo carro está ligado! Pronto para partir?");
        }

    }

