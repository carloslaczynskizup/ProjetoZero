import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Criar um programa que calcule a média de salários de uma empresa, pedindo ao usuário a grade de
// funcionários e os salários, e devolvendo a média salarial.
public class Aula10Ex05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a quantidade de funcionários: ");
        int qtdFuncionarios = input.nextInt();

        List<Double> salariosFuncionarios = new ArrayList<>();

        for (int i = 0; i < qtdFuncionarios; i++){
            System.out.println("Digite o salário do funcionário " + (i + 1) +": ");
            double salario = input.nextDouble();
            salariosFuncionarios.add(salario);
        }
        double somaSalarios = 0;
        for (double salario : salariosFuncionarios){
            somaSalarios += salario;

        }
        double media = somaSalarios / qtdFuncionarios;

        System.out.printf("A média salarial é: R$ %,.2f%n",  media);

    }
}
