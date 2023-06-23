package Aula08_Parte2;

import java.util.Scanner;
//C=(F-32)/1,8 - Faça um programa que peça a temperatura em graus Fahrenheit,
// transforme e mostre a temperatura em graus Celsius.
public class Exerc05Parte2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Conversor de Fahrenheit para Celsius");
        System.out.print("Digite o valor em Fahrenheit ºF: ");
        double fahrenheit = input.nextDouble();

        double celsius = (fahrenheit - 32) / 1.8;
        System.out.print("O valor em Celsius ºC será de " + celsius);
    }
}
