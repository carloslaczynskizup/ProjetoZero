//Criar um vetor A com 10 elementos inteiros. Implementar um programa que
// defina e escreva a média aritmética simples dos elementos ímpares armazenados neste vetor.

import java.util.Scanner;
public class Aula10Ex10 {
    public static void main(String[] args) {
        int[] vetor = new int[10]; //aqui é um array com tamanho de 10 inteiros que atribui a variavel números
        int soma = 0;//aqui inicializa a armazenagem da soma
        int contador = 0; //contador para incrementar os números ímpares

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite os 10 números para a média dos ímpares: ");

        for (int i = 0; i < vetor.length; i++)
        //Continuação do loop até atingir o tamanho do vetor. i++ para incrementar em 1 e avançar o loop.
        {
            vetor[i] = entrada.nextInt();
            if (vetor[i] % 2 != 0) // aqui a divisão por dois em que o seu resto é diferente de zero.
            //Então o seu número é ímpar.
            {
                soma = soma + vetor[i];
                contador++;

            }
        }

        double media = (double) soma / contador++; //aqui calcula a média

        System.out.println("A média dos ímpares é igual a " + media);
    }

}