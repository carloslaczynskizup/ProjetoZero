import java.util.Scanner;
//Faça um programa que leia n números inteiros e imprima sua média.
public class Ex02Repeticao {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("N números inteiros e imprimir a sua média.");
        System.out.println("Digite a quantidade de números: ");
        int qtdNumero = input.nextInt();

        int soma = 0;
        for (int i = 1; i <= qtdNumero; i++) {
            System.out.println("Digite o número " + i + ": ");
            int numero = input.nextInt();
            soma += numero;

        }
        double media = (double) soma / qtdNumero;
        System.out.println("A média dos números é: " + media);
        }

    }