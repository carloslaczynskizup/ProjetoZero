//Revisão do sistema que permite jogar mais de uma vez e soma todas as pontuações.
package EntregaNivel02;
import java.util.Random;
import java.util.Scanner;
public class JogoAdivinhaNivel02 {
   public static void main (String[] args){
       Random gerador = new Random();
       //As instâncias da classe “Random” são objetos geradores de números aleatórios,
       // que produzem estes números em resposta a solicitações.
       boolean reiniciar = true;
       int total = 0;
       Scanner entrada = new Scanner(System.in);


       System.out.println("Jogo de adivinhação de Número!");
       System.out.println("Agora revisado com Restart do jogo e a soma de todas as pontuações.");
       System.out.println(">>>>>>>>>>>>>>><<<<<<<<<<<<<<<");

       while (reiniciar) {
           int numeroSorte = gerador.nextInt(20);
           int respostaSorte;
           int pontuacaoJogo = 0;

       System.out.println("Digite um número entre 1 e 20: ");
       respostaSorte = entrada.nextInt();

            if (respostaSorte == numeroSorte) {
                System.out.println("Hoje você está com sorte. Acertou o número. Ganhou 10 pontos.");
                pontuacaoJogo = 10;

            } else if (respostaSorte == numeroSorte - 1 || respostaSorte == numeroSorte + 1) {
                System.out.println("Quase acertou! Você ganhou 5 pontos!");
                pontuacaoJogo = 5;

            } else {
                System.out.println("Ih, passou longe! Você perdeu!");
            }

            total = total + pontuacaoJogo;

           System.out.println("Sua pontuação nesta rodada é de: " + pontuacaoJogo + " pontos.");
           System.out.println();
           System.out.println("Sua pontuação total é de: " + total + " pontos.");
           System.out.println();
           System.out.println("Quer jogar novamente? (S/N): ");
           String simounao = entrada.next();

           if (simounao.equalsIgnoreCase("N")) {
                reiniciar = false;

           }
       }

       System.out.println("A sua pontuação final é de: " + total + " pontos. Parabéns!");
       System.out.println("FIM DO JOGO!");

        }
    }