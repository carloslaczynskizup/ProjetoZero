//Faça um algoritmo que leia uma variável e some 5 caso seja par,
// some 8 caso seja ímpar, imprimir o resultado desta operação.

import java.util.Scanner;
public class Exercicios02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Aqui caso seja PAR vai somar com 5. Se for ÍMPAR vai somar com 8.");
        System.out.println();

        System.out.println("Qual será o valor de B: ");
        int x = entrada.nextInt();

        int solucao = 0;

        if (x % 2 == 0) {
            solucao = x + 5;
        } else {
            solucao = x + 8;
        }

        System.out.println("O valor de C é: " + solucao);
    }
}
