//Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100.

import java.util.Scanner;

public class Exercicios05 {

    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ler 20 números e, ao final, escreva quantos estão entre 0 e 100.");
        System.out.println();

        int total = 20;
        int numeros = 0;

        for (int i = 1; i <= total; i++){
            System.out.println("Digite um número inteiro " + i + ": ");
            int numero = entrada.nextInt();

            if (numero >= 0 && numero <= 100){
                numeros++;

            }

        }

        System.out.println(" O total de números entre 0 e 100 são: " + numeros);

    }
}
