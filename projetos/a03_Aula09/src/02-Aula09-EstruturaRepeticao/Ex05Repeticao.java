import java.util.Scanner;

//Faça um programa que some os números ímpares contidos em um intervalo definido pelo usuário.
// O usuário define o valor inicial do intervalo e o valor final deste intervalo e o programa
// deve somar todos os números ímpares contidos neste intervalo. Caso o usuário digite um
// intervalo inválido (começando por um valor maior que o valor final)
// deve ser escrito uma mensagem de erro na tela, “Intervalo de valores inválido” e o programa termina.
public class Ex05Repeticao {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int inicio, fim;
        System.out.println("Digite o valor inicial: ");
        inicio = input.nextInt();

        System.out.println("Digite o valor final: ");
        fim = input.nextInt();

        if (inicio > fim) {
            System.out.println("Intervalo de valores inválido.");

        } else {
            int somatorio = 0;

            //aqui for para iterar números dentro do intervalo
            for (int i = inicio; i <= fim; i++) {
                // Aqui calcula o restante de uma operação de divisão. Calculando o valor de i dividido
                //por 2. Se i é par o resultado é 0, se for ímpar será 1.
                if (i % 2 !=0) {
                    somatorio += i;
                }

            }

            System.out.println("A soma dos números ímpares é: " + somatorio);

        }
    }
}
