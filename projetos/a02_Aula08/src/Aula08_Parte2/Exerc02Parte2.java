package Aula08_Parte2;

import java.util.Scanner;
//Faça um programa que receba 4 notas bimestrais e mostre a média aritmética.
        public class Exerc02Parte2 {
        public static void main(String[] args) {

            Scanner entradaUsuarioNotas = new Scanner(System.in);

            System.out.print("Digite a Primeira Nota: ");
            double primeiraNota = entradaUsuarioNotas.nextDouble();

            System.out.print("Digite a Segunda Nota: ");
            double segundaNota = entradaUsuarioNotas.nextDouble();

            System.out.print("Digite a Terceira Nota: ");
            double terceiraNota = entradaUsuarioNotas.nextDouble();

            System.out.print("Digite a Quarta Nota: ");
            double quartaNota = entradaUsuarioNotas.nextDouble();

            double mediaGeral = (primeiraNota + segundaNota + terceiraNota + quartaNota)/4;

            System.out.print("A média é: " + mediaGeral);
        }
    }

