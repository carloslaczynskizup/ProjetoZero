package a07_exercicios12062023.src.quadrado;

import java.util.Scanner;
//aqui o Scanner é usado para ler o valor do lado do quadrado definido pelo usuário.

//Crie uma classe que modele um quadrado:
// 1. Atributos: Tamanho do lado
// 2. Métodos: Mudar valor do Lado, Retornar valor do Lado e calcular Área;

public class MainQuadrado {
    //aqui o MainQuadrado é declarado como uma classe sendo um ponto de entrada do programa.

    public static void main(String[] args) {
        //aqui o public void main é usado para executar o programa

        Scanner input = new Scanner(System.in);
        //aqui o Scanner input é usado para ler o valor do lado do quadrado

        System.out.println("Informar o tamanho do lado do quadrado: ");
        double tamanhoLadoDoQuadrado = input.nextDouble();
        //aqui o método double

        Quadrado quadrado = new Quadrado(tamanhoLadoDoQuadrado);
        //aqui a classe Quadrado é instanciada com o tamanho do lado do quadrado
        //e o objeto da classe Quadrado chamado quadrado, utiliza o construtor da classe Quadrado.

    }
}
