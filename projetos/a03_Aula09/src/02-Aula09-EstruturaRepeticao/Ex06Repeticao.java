//Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.
// Um número primo é aquele que é divisível somente por ele mesmo e por 1.
import java.util.Scanner;
public class Ex06Repeticao {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("É número primo?");

        System.out.println("Digite um número para saber se é número primo: ");
        int primo = input.nextInt();

        for (int i = 2; i <= primo; i++) {
            // Aqui calcula o restante de uma operação de divisão. Calculando o valor de i dividido
            //por 2. Se i é par o resultado é 0, se for ímpar será 1. Números primos são todos os
            //ímpares, menos o 2.
            if (primo % i != 0) {
                System.out.println("O número é primo!");
                break;

        } else {
                System.out.println("O número não é primo");
                break;

            }
        }

    }
}
