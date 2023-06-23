//Faça um programa que receba o preço de três produtos e
// informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.

import java.util.Scanner;

public class Ex02 {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Qual é o produto mais barato?");
        System.out.println("-----------------------------");

        System.out.print("Qual é o preço do Produto 1? R$ ");
        double prod1 = input.nextDouble();

        System.out.print("Qual é o preço do Produto 2? R$ ");
        double prod2 = input.nextDouble();

        System.out.print("Qual é o preço do Produto 3? R$ ");
        double prod3 = input.nextDouble();

        if (prod1 < prod2 && prod1 < prod3){
            System.out.println("O Produto 1 é o mais barato. O valor é R$ " + prod1);

        } else if (prod2 < prod1 && prod2 < prod3) {
            System.out.println("O Produto 2 é o mais barato. O valor é R$ " + prod2);

        } else {
            System.out.println("O Produto 3 é o mais barato. O valor é R$ " + prod3);

        }

    }
}
