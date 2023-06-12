//Faça um Programa que receba um número e exiba o dia correspondente da semana.
// (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer a mensagem “valor inválido”.

import java.util.Scanner;

public class Ex05 {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Dia da semana!");
        System.out.println("Digite um número de 1 a 7:");
        int num = input.nextInt();

        switch (num){

            case 1:
                System.out.println("O dia da semana é Domingo");
                break;
            case 2:
                System.out.println("O dia da semana é Segunda-feira");
                break;
            case 3:
                System.out.println("O dia da semana é Terça-feira");
                break;
            case 4:
                System.out.println("O dia da semana é Quarta-feira");
                break;
            case 5:
                System.out.println("O dia da semana é Quinta-feira");
                break;
            case 6:
                System.out.println("O dia da semana é Sexta-feira");
                break;
            case 7:
                System.out.println("O dia da semana é Sábado");
                break;
            default:
                System.out.println("Resposta inválida");
        }
    }
}
