import java.util.Scanner;

//Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são
// do Imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e 10% para o INSS
// e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita).
// O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao usuário
// o valor da sua hora e a quantidade de horas trabalhadas no mês.
public class Exerc01Parte1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Cálculo de Folha de Pagamento");
        System.out.print("Digite o valor da Hora Trabalhada: ");
        double horasValor = input.nextDouble();

        System.out.print("Digite o total de Horas Trabalhadas: ");
        double horasTrabalhadas = input.nextDouble();

        double totalBruto = (horasValor * horasTrabalhadas);
        double descirpf;
        if (totalBruto <= 900) {
            descirpf = 0;
        } else if (totalBruto <= 1500){
            descirpf = 5;
        } else if (totalBruto <= 2500){
            descirpf = 10;
        } else {
            descirpf = 20;
        }
        double irpf = totalBruto * (descirpf / 100);
        double inss = (totalBruto * 0.10);
        double fgts = (totalBruto * 0.11);
        double descontosTotais = (irpf + inss);
        double salarioliquido = (totalBruto - descontosTotais);

        System.out.printf("Salário Bruto: R$ %,.2f %n" , totalBruto);
        System.out.printf("(-)IR: R$ %,.2f %n" , irpf);
        System.out.printf("(-)INSS (10%%): R$ %,.2f %n" , inss);
        System.out.printf("FGTS (11%%): R$ %,.2f %n" , fgts);
        System.out.printf("Total descontos: R$ %,.2f %n" , descontosTotais);
        System.out.printf("Salário liquido: R$ %,.2f %n" , (totalBruto - descontosTotais));
    }
}