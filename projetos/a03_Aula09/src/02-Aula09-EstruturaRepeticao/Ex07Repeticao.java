//Faça um programa que calcule e mostre a soma dos 50 primeiros números ímpares.

import java.util.Scanner;

public class Ex07Repeticao {
    public static void main (String[] args){
        System.out.println("Soma dos 50 primeiros números ímpares de 0 a 50!");
        System.out.println("--------------------");
        int quantidade = 50; // Quantidade de números ímpares a somar até 50
        int soma = 0;
        int contador = 0;
        int numero = 1;

        while (contador < quantidade) {
            // Aqui calcula o restante de uma operação de divisão. Calculando o valor de numero dividido
            //por 2. Se se numero é par o resultado é 0, se for ímpar será 1.
            if (numero % 2 != 0) {
                soma += numero;
                contador++;
            }
            numero++;
        }

        System.out.println("A soma dos primeiros " + quantidade + " números ímpares é: " + soma);
    }
}