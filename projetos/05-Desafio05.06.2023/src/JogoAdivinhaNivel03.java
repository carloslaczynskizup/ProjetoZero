//O sistema permite adicionar nível de dificuldade de alguma forma e exibe,
// além da pontuação,
//Consegui colocar colocar cores!
// os números que o usuário errou e acertou.<< Não consegui fazer as pontuações de erros e acertos.

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhaNivel03 {

    //início do jogo com caracteres em cores somente no console do IntelliJ. hahaha
    public static final String ANSI_RESET ="\u001B[0m",
            ANSI_RED = "\u001B[31m",
            ANSI_GREEN = "\u001B[32m",
            ANSI_PURPLE = "\u001B[35m",
            ANSI_YELLOW = "\u001B[33m",
            ANSI_BLUE = "\u001B[34m";
    public static void main (String[] args){
        Random gerador = new Random();
        //As instâncias da classe “Random” são objetos geradores de números aleatórios,
        // que produzem estes números em resposta a solicitações.
        boolean reiniciar = true;
        int total = 0;
        Scanner entrada = new Scanner(System.in);

        //início do jogo com caracteres em cores somente no console do IntelliJ. hahaha
        System.out.println(ANSI_RED + "Jogo de adivinhação de Número!" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "Agora revisado com Restart do jogo, a soma de todas as pontuações e com nível de dificuldade." + ANSI_RESET);
        System.out.println(ANSI_PURPLE + ">>>>>>>>>>>>>>><<<<<<<<<<<<<<<" + ANSI_RESET);

        while (reiniciar) {
            System.out.println("Escolha o nível de dificuldade: ");
            System.out.println(ANSI_GREEN + "F - Fácil (1 a 10)" + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "M - Médio (1 a 25)" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "D - Difícil (1 a 50)" + ANSI_RESET);
            System.out.println(ANSI_RED + "MD - Muito Difícil - Choraaaa! (1 a 100)" + ANSI_RESET);
            System.out.println();
            System.out.print("Digite a letra correspondente ao nível: ");
            String letraNivel = entrada.next();
            int nivelMax = 0;

            switch (letraNivel.toUpperCase()) { //aqui se colocar maiúscula ou minúscula
                case "F":
                    nivelMax = 10;
                    break;
                case "M":
                    nivelMax = 25;
                    break;
                case "D":
                    nivelMax = 50;
                    break;
                case "MD":
                    nivelMax = 100;
                    break;

            }

            int numeroSorte = gerador.nextInt(nivelMax);
            int respostaSorte;
            int pontuacaoJogo = 0;

            System.out.print("Digite um número de acordo com nível escolhido: ");
            respostaSorte = entrada.nextInt();

            if (respostaSorte == numeroSorte) {
                System.out.println();
                System.out.println("Hoje você está com sorte. Acertou o número. Ganhou 10 pontos.");
                pontuacaoJogo = 10;

            } else if (respostaSorte == numeroSorte - 1 || respostaSorte == numeroSorte + 1) {
                System.out.println();
                System.out.println("Quase acertou! Você ganhou 5 pontos!");
                pontuacaoJogo = 5;

            } else {
                System.out.println();
                System.out.println("Ih, passou longe! Você perdeu!");
            }

            total = total + pontuacaoJogo;

            System.out.println("Sua pontuação nesta rodada é de: " + pontuacaoJogo + " pontos.");
            System.out.println();
            System.out.println("Sua pontuação total é de: " + total + " pontos.");
            System.out.println();
            System.out.print("Quer jogar novamente? (S/N): ");
            String simounao = entrada.next();

            if (simounao.equalsIgnoreCase("N")) {
                reiniciar = false;

            }
        }
        System.out.println();
        System.out.println("A sua pontuação final é de: " + total + " pontos. Parabéns!");
        System.out.println(">>> FIM DO JOGO! <<<");

    }
}