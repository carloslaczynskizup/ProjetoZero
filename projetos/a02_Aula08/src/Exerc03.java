//Crie um algoritmo que leia o valor do salário de um usuário, calcule a quantidade de salários mínimos
// que esse usuário ganha e imprima o resultado. (1SM=R$1.320,00 em 01/05/2023).

import java.util.Scanner;

public class Exerc03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double salarioMinimo, salarioRecebido, QtdSalMin;
        System.out.print("Informe o valor do salário mínimo R$ ");
        salarioMinimo = input.nextDouble();
        System.out.print("Informe o valor do salario recebido pela a07_Exercicios12062023.src.pessoa R$ ");
        salarioRecebido = input.nextDouble();
        QtdSalMin = (salarioRecebido / salarioMinimo);
        System.out.printf("Uma a07_Exercicios12062023.src.pessoa que recebe um salário de R$ %.2f reais recebe %.2f salários mínimos ", salarioRecebido, QtdSalMin);
    }
}