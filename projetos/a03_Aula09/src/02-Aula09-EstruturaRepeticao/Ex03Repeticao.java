//Escreva um programa que leia 10 números e escreva o menor valor lido e o maior valor lido.
import java.util.Scanner;
public class Ex03Repeticao {
    public static void main (String[] args){
        Scanner entradaDados = new Scanner(System.in);

        System.out.println("10 números inteiros, imprimir o menor e maior valor.");

        int i, maior, menor, qtdNumeros;
        menor = Integer.MAX_VALUE;
        maior = Integer.MIN_VALUE;
        // For para entrada de 10 números
        for(i = 0; i < 10; i++) {
            System.out.printf("Digite os 10 números: ", i + 1);
            qtdNumeros = entradaDados.nextInt();

            //verifica se o número é maior que o contido em maior, se positivo
            //maior recebe qtdNumeros
            if (qtdNumeros > maior) {
                maior = qtdNumeros;

            }
            //verifica se o número é menor que o contido em menor, se positivo
            //menor recebe qtdNumeros
            if (qtdNumeros < menor) {
                menor = qtdNumeros;
            }

        }
        System.out.println("O maior é: " + maior);
        System.out.println("O menor é: " + menor);

    }
}