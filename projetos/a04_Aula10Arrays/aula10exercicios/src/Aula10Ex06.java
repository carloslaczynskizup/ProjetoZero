import java.util.Scanner;

//Crie um programa para verificar se o inteiro fornecido é um múltiplo de 5 e 7.
//Exemplo de 5 e 7 - (35, 70, 105, 140, 175, 210,...)
public class Aula10Ex06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número para verificar se é múltiplo de 5 e 7: ");
        int numeroUsuario = entrada.nextInt();

        //abaixo utilizando o array para saber se é ou não múltiplo
        int[] multiplos5e7 = {5, 7};
        boolean contaMultiplo = false;

        for (int i : multiplos5e7) {
            if (numeroUsuario % i == 0) {
                contaMultiplo = true;

            }

            if (contaMultiplo) {
                System.out.println("O número " + numeroUsuario + " é múltiplo de 5 e 7");
                break;
            } else {
                System.out.println("O número " + numeroUsuario + " não é múltiplo de 5 e 7");
                break;

            }
        }
    }
}