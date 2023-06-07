//Escreva um algoritmo que leia uma sequência de números do usuário e
// realize a soma desses números. Encerre a execução quando um número negativo for digitado.

import java.util.Scanner;

public class Exercicios06 {
    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ler uma sequência de números e soma desses números. Encerre quando um número negativo for digitado.");
        System.out.println();

        int numero = 0;
        int adicionar = 0;

        while(numero >= 0) {
            System.out.println("Digite a sequência de números: ");
            numero = entrada.nextInt();

            if (numero >= 0) {
               adicionar += numero;
            }

        }
        System.out.println("A adição dos números informados é: " + adicionar);

    }
}
