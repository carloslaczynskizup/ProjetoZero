//Crie um algoritmo que receba a altura e peso do usuário, calcule seu IMC e exiba seu valor.
//OBS:  Fórmula: IMC = peso/ (altura x altura).

import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {

        System.out.println("Aqui vamos calcular o seu IMC.");
        Scanner entradaDados = new Scanner(System.in);
        System.out.print("Digite o seu peso em kg: ");
        double peso = entradaDados.nextDouble();

        System.out.print("Digite o sua altura em metros: ");
        double altura = entradaDados.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("O resultado do seu IMC é %.2f%n", imc);

    }
}