//O sistema sorteia o número e realiza todas as comparações, no final ele exibe a pontuação correta.
import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhaNivel01 {
    public static void main (String[] args){
        Random gerador = new Random();
        //As instâncias da classe “Random” são objetos geradores de números aleatórios,
        // que produzem estes números em resposta a solicitações.
        int numeroSorte = gerador.nextInt(20);
        int respostaSorte;

        System.out.println("Jogo de adivinhação de Número.");
        System.out.println("Digite um número entre 1 e 20: ");
        Scanner entrada = new Scanner(System.in);
        respostaSorte = entrada.nextInt();

        if (respostaSorte == numeroSorte) {
            System.out.println("Hoje você está com sorte. Acertou o número. Ganhou 10 pontos.");

        } else if(respostaSorte == numeroSorte - 1 || respostaSorte == numeroSorte + 1) {
            System.out.println("Quase acertou! Você ganhou 5 pontos!");
        } else {
            System.out.println("Ih, passou longe! Você perdeu!");
        }

    }
}
