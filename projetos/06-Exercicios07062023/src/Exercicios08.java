//Leia um conjunto de salários, sendo que para terminar a entrada será fornecido o valor -1.
// Após toda a entrada ter sido realizada, leia o valor de um reajuste.
// Em seguida exiba todos os salários já reajustados.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Exercicios08 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        List<Float> todosSalarios = new ArrayList<>();

        System.out.println("Programa de cálculo de reajuste de salários.");
        System.out.println();
        System.out.println("Digite os salários (-1 para concluir): ");

        float cadaSalario;
        while ((cadaSalario = entrada.nextFloat()) != -1) {
            todosSalarios.add(cadaSalario);

        }

        System.out.println("Digite o valor do Reajuste dos salário: ");
        float reajusteSalario = entrada.nextFloat();

        System.out.println("Seguem os salários reajustado conforme solicitação: ");
        for (float salarioAtual : todosSalarios){

            float totalReajustado = salarioAtual * (1 + reajusteSalario / 100);
            System.out.printf("Salário atual: R$ %,.2f - Salário reajustado: R$ %,.2f ", salarioAtual, totalReajustado);
        }
    }
}