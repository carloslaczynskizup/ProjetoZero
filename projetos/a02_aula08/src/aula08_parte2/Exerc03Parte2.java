package Aula08_Parte2;

import java.util.Scanner;

//Faça um programa que converta metros para centímetros.
public class Exerc03Parte2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Conversor de metros para centímetros");
        System.out.print("Digite a medida em metros: ");
        double metros = input.nextDouble();

        double centimetros = (metros * 100);

        System.out.print("O resultado da conversão é: " + centimetros + " centímetros.");

    }
}
