//Leia a idade de 20 pessoas e exiba a média das idades.

import java.util.Scanner;

public class Exercicios04 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Leia a idade de 20 pessoas e exiba a média das idades.");
        System.out.println();

        int soma = 0;
        int total = 20;

        for (int i = 1; i <= total; i++) {
            System.out.println("Digite a idade de cada a07_Exercicios12062023.src.pessoa " + i + ":");
            int idade = entrada.nextInt();
            soma = soma + idade;
        }

        double media = (double) soma / total;

        System.out.println();
        System.out.println("A média das idades é: " + media);

    }
}
