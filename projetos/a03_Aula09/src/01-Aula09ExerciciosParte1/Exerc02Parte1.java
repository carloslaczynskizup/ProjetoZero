//Um posto está vendendo combustíveis com a seguinte tabela de descontos:
//Álcool:
//até 20 litros, desconto de 3% por litro
//acima de 20 litros, desconto de 5% por litro.

//Gasolina: até 20 litros, desconto de 4% por litro
//acima de 20 litros, desconto de 6% por litro

//Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível
// (codificado da seguinte forma: A-álcool, G-gasolina),
// calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do
// litro da gasolina é R$ 2,50 e o preço do litro do álcool é R$ 1,90.

import java.util.Scanner;
public class Exerc02Parte1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cálculo de desconto de combustível");
        System.out.print("Digite quantos litros quer abastecer: ");
        double litros = input.nextDouble();

        System.out.print("Digite qual combustível. A - Alcool(R$5) / G - Gasolina(R$ 6): ");
        String combustivel = input.next();
        double alcool = 5;
        double gasolina = 6;
        //double totalpreco = 0;

        if (combustivel.equalsIgnoreCase("A")){
           double totalA = litros * alcool;

            if (litros <= 20) {
            totalA = (litros * alcool) * 0.03;
        } else {
                totalA = (litros * alcool) * 0.05;
            }

            System.out.printf("O preço a pagar é R$ %,.2f%n", totalA);

//        } else if (combustivel.equalsIgnoreCase("G")) {
//            totalpreco = gasolina * litros;
//            if (litros <= 20) {
//                totalpreco -= (gasolina * litros) * 4 / 100;
//            } else {
//                totalpreco -= (gasolina * litros) * 6 / 100;
//            }
//            }
//        System.out.printf("O preço a pagar é R$ %,.2f%n", totalpreco);

        }

    } }
