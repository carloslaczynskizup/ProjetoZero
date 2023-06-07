// Os gestores da Zup resolveram dar um aumento de salário aos seus colaboradores
// e lhe contrataram para desenvolver o programa que calcula os reajustes.
// Portanto, faça um programa que recebe o salário de um colaborador e o
// reajuste segundo o seguinte critério, baseado no salário atual:
//
//Salários até R$ 280,00 (incluindo), receberão aumento de 20%
//Salários entre R$ 280,00 e R$ 700,00 (incluindo), receberão aumento de 15%
//Salários entre R$ 700,00 e R$ 1500,00 (incluindo), receberão aumento de 10%
//Salários de R$ 1500,00 em diante, receberão aumento de 5%
//
//Após o aumento ser realizado, informe na tela:
//O salário antes do reajuste;
//O percentual de aumento aplicado;
//O valor do aumento;
//O novo salário, após o aumento;

import java.util.Scanner;
public class Ex04 {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Cálculo de Reajuste de Salário");
        System.out.println("------------------------------");

        System.out.println("Digite o seu salário atual: R$ ");
        double salarioAntes = input.nextDouble();
        double reajuste, salarioDepois, valorAumento;

        if (salarioAntes <= 280) {
            reajuste = 20;
        } else if (salarioAntes <= 700) {
            reajuste = 15;
        } else if (salarioAntes <= 1500) {
            reajuste = 10;
        } else {
            reajuste = 5;
        }

        valorAumento = salarioAntes * (reajuste /100);
        salarioDepois = salarioAntes + valorAumento;
        System.out.printf("O salário anterior foi de: R$ %,.2f%n " , salarioAntes);
        System.out.println("O reajuste foi de (%): " + reajuste);
        System.out.printf("O valor do aumento foi de: R$ %,.2f%n" , valorAumento);
        System.out.printf("O Novo salário é de: R$ %,.2f%n " , salarioDepois );

    }
}
