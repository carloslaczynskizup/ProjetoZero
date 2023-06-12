//Faça um algoritmo que leia a idade de uma a07_Exercicios12062023.src.pessoa expressa em anos, meses e dias e
// mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
// (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)

import java.util.Scanner;

public class Exerc04 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Escreva seu ano de nascimento: ");
        int anos = entrada.nextInt();

        System.out.print("Escreva seu mês de nascimento: ");
        int meses = entrada.nextInt();

        System.out.print("Escreva o dia do seu nascimento: ");
        int dias = entrada.nextInt();

        double idadeEmDias = dias + (anos * 365) + (meses * 30);
        System.out.printf("Sua idade total em dias é: %.2f ", idadeEmDias );
            }
        }
