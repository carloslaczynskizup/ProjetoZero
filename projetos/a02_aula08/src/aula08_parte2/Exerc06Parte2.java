package Aula08_Parte2;

import java.util.Scanner;

//Faça um programa que leia um número inteiro e imprima o seu antecessor e seu sucessor.
public class Exerc06Parte2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Antecessor e Sucessor de um número inteiro.");
        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();
        int antecessor = (numero - 1);
        int sucessor = (numero + 1);

        System.out.println("O antecessor do número é: " + antecessor);
        System.out.println("O sucessor do número é: " + sucessor);
    }
}
