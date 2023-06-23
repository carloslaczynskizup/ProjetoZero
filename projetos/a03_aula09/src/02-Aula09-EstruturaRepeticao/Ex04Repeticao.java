//Faça um programa que leia n números positivos e calcule a soma desses números.

import java.util.Scanner;

public class Ex04Repeticao {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("N números positivos e calcule a soma desses números");
        System.out.println("Digite a quantidade de números: ");
        int qtdNum = input.nextInt();

        int soma = 0;
        //for utilizado para entrada de n números
        for (int i = 0; i < qtdNum; i++) {
            System.out.printf("Digite o %dº número : " , i + 1);
            int numero = input.nextInt();
            //a cada dígito de entrada ele é somado na variável soma
            soma += numero;
        }
        System.out.println("A média dos números é: " + soma);
    }
}