package a07_exercicios12062023.src.bola;

public class Bola {

    String cor;
    String marca;
    String material;
    double peso;
    double circunferencia;

    public void trocarCor (String corNova) {
        cor = corNova;
    }
    public String mostrarCor (){
        return cor;
    }
}
