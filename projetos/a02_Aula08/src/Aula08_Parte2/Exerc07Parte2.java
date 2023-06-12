package Aula08_Parte2;

import java.util.Scanner;
//Faça um Programa que receba o quanto você ganha por hora e o número de horas trabalhadas no mês.
// Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o
// Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê respectivamente:
//Salário bruto. - Quanto pagou ao INSS. - Quanto pagou ao sindicato. - Qual o salário líquido do funcionário.
public class Exerc07Parte2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Cálculo de Horas Trabalhadas");
        System.out.print("Digite o valor da Hora Trabalhada: ");
        double horasValor = input.nextDouble();

        System.out.print("Digite o total de Horas Trabalhadas: ");
        double horasTrabalhadas = input.nextDouble();

        double totalBruto = (horasValor * horasTrabalhadas);
        double irpf = (totalBruto * 0.11);
        double inss = (totalBruto * 0.08);
        double sindicato = (totalBruto * 0.05);
        double salarioliquido = (totalBruto - irpf - inss - sindicato);
        System.out.printf("O salário bruto é R$ %.2f%n", totalBruto);
        System.out.printf("Desconto do IRPF é R$ %.2f%n", irpf);
        System.out.printf("Desconto do INSS é R$ %.2f%n", inss);
        System.out.printf("Desconto do Sindicato é R$ %.2f%n", sindicato);
        System.out.printf("O salário líquido é de R$ %.2f%n ", salarioliquido);
    }
}
