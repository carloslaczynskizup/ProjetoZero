//Faça um programa que receba duas notas parciais de um aluno. O programa deve calcular
// a média alcançada por aluno e apresentar:
//A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
//A mensagem "Reprovado", se a média for menor do que sete;
//A mensagem "Aprovado com Distinção", se a média for igual a dez.

import java.util.Scanner;
public class Ex03 {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Cálculo de Médias - Provas");
        System.out.println("----------");

        System.out.print("Digite a primeira nota: ");
        double nota1 = input.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = input.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7 && media < 10 ){
            System.out.println("Você está APROVADO!");

        } else if (media == 10){
            System.out.println("APROVADO com Distinção!");

        } else {
            System.out.println("Você está REPROVADO!");

        }

        System.out.println("Sua média é: " + media);

    }
}