//Leia o nome do usuário e um número N, após isso escreva o nome dele na tela N vezes.

import java.util.Scanner;

public class Exercicios07 {

    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ler o nome do usuário e um número N, após isso escreva o nome dele na tela N vezes.");
        System.out.println();

        System.out.println("Digite o seu nome: ");
        String nome = entrada.next();

        System.out.println("Digite um número: ");
        int numero = entrada.nextInt();

        for (int i = 0; i < numero; i++){
            System.out.println("Repetindo " + (i + 1) + " vezes o seu nome: " + nome);

        }
    }
}
