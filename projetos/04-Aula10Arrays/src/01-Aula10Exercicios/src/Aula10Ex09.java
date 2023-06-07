
//Crie um programa para exibir a soma de 20 números usando uma matriz.

import java.util.Scanner;
public class Aula10Ex09 {
    public static void main(String[] args){
        int[] numeros = new int[20]; //aqui é um array com tamanho de 20 inteiros que atribui a variavel números
        int soma = 0; //aqui inicializa a armazenagem da soma

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite os 20 números para somar: ");

        //aqui vai iterar 20 vezes e ler os números fornecido pelo usuário
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = entrada.nextInt();
            soma = soma + numeros[i]; //refere-se ao valor armazenado no array números
            // no índice i, permitindo a leitura dos valores.
        }

        System.out.println("A soma dos 20 números é: " + soma);

    }
}
