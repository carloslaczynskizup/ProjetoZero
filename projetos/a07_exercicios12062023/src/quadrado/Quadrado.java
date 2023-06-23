package a07_exercicios12062023.src.quadrado;

//aqui a Classe Quadrado é usada para criar instâncias de Quadrados, define o tamanho
// o lado do quadrado e retorna o valor calculado.
public class Quadrado {
    double ladoQuadrado;
    //é declarado o atributo ladoQuadrado como tipo double, representando o tamanho do lado do quadrado.


    //aqui o construtor Quadrado recebe o tamanho do lado do quadrado do parâmetro  valor "lado".
    public Quadrado(double lado) {
        this.ladoQuadrado = lado;
    }

    //aqui o método changeLado recebe um parametro "ladoNovo" para o novo valor do lado do quadrado.
    //Atualizando o valor do atributo ladoQuadrado com o valor fornecido.
    public void changeLado(double ladoNovo) {
        ladoQuadrado = ladoNovo;
    }

    //aqui esse método retona o valor atual do lado do quadrado, armazenado no atributo ladoQuadrado.
    public double getLado() {
        return ladoQuadrado;
    }


    //aqui o método areaCalculada calcula a área do quadrado e retorna o valor calculado.
    public double areaCalculada() {
        return ladoQuadrado * ladoQuadrado;
    }

}
