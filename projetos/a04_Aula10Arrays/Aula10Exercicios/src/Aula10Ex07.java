//Crie um programa para exibir o inteiro fornecido pelo usuário na ordem inversa.

import java.util.Scanner;
public class Aula10Ex07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numeroUsuario = entrada.nextInt();

        int numeroInvertido = 0;

        while (numeroUsuario != 0) {

            numeroInvertido = numeroInvertido * 10 + numeroUsuario % 10;
            numeroUsuario = numeroUsuario / 10;

        }

        System.out.println("Número invertido: " + numeroInvertido);


    }
}
