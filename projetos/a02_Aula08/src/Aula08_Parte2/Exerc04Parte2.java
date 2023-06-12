package Aula08_Parte2;

import java.util.Scanner;

//Faça um Programa que recebe o quanto você ganha por hora e o número de horas trabalhadas no mês.
// Calcule e mostre o total do seu salário no referido mês.
public class Exerc04Parte2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Cálculo de Horas Trabalhadas");
        System.out.print("Digite o valor da Hora Trabalhada: ");
        double horasValor = input.nextDouble();

        System.out.print("Digite o total de Horas Trabalhadas: ");
        double horasTrabalhadas = input.nextDouble();

        double totalGanho = (horasValor * horasTrabalhadas);
        System.out.print("O valor total será de R$ " + totalGanho);

    }
}
