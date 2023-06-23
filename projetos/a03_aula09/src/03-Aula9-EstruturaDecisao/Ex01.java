//Faça um programa que receba dois números e imprima o maior deles.

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("O número maior é?");
        System.out.print("Digite um número: ");
        int num1 = entrada.nextInt();

        System.out.print("Digite outro número: ");
        int num2 = entrada.nextInt();

        if (num1 > num2){
            System.out.println();
            System.out.println("O número " + num1 + " é maior do que o número " + num2 +".");

        } else if(num1 < num2){
            System.out.println();
            System.out.println("O número " + num2 + " é maior do que o número " + num1 +".");

        } else {
            System.out.println();
            System.out.println(">>> Os números são iguais. <<<");
        }

    }
}
