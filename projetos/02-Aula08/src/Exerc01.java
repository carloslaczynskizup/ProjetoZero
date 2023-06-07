
// 1 - João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento
// diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo
// regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$4,00 por quilo excedente.
// João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso.
// Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João
// deverá pagar.
// Imprima os dados do programa com as mensagens adequadas.
import java.util.Scanner;
public class Exerc01 {
    public static void main(String[] args) {

        Scanner pesoReal = new Scanner(System.in);
        System.out.print("Digite o peso total de peixe: ");
        double peso = pesoReal.nextDouble();
        double excesso = 0;
        double multa = 0;

        if (peso <= 50) {
            System.out.printf("Não há peso excedente e multa!");
        }

        else {
        excesso = peso - 50;
        multa = excesso * 4;
        System.out.printf("Excesso: %.2f kg %n", excesso);
        System.out.printf("Multa: %.2f reais %n", multa);

        }
    }
}