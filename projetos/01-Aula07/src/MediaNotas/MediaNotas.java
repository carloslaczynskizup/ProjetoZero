package MediaNotas;
//Faça um programa que receba 4 notas bimestrais e mostre a média aritmética.

import java.util.Scanner;
public class MediaNotas {
    public static void main(String[] args) {

        Scanner entradaUsuarioNotas = new Scanner(System.in);

        System.out.println("Digite a Primeira Nota: ");
        double primeiraNota = entradaUsuarioNotas.nextDouble();

        System.out.println("Digite a Segunda Nota: ");
        double segundaNota = entradaUsuarioNotas.nextDouble();

        System.out.println("Digite a Terceira Nota: ");
        double terceiraNota = entradaUsuarioNotas.nextDouble();

        System.out.println("Digite a Quarta Nota: ");
        double quartaNota = entradaUsuarioNotas.nextDouble();

        double mediaGeral = (primeiraNota + segundaNota + terceiraNota + quartaNota)/4;

        System.out.println("A média é: " + mediaGeral);

    }
}
