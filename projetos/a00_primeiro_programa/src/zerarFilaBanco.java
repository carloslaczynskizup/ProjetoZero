import java.util.Scanner;

        public class zerarFilaBanco {
         public static void main(String[] args) {

                    Scanner input = new Scanner(System.in);

             System.out.println("Digite o tamanho da fila do atendimento do banco:");
             int numero = input.nextInt();

             int cont = 1;

             while (numero >= 1) {
                 System.out.println("Agora tem " + cont + " pessoas");

        }
        if (cont == 1) {
            System.out.println("Ainda tem pessoas a serem atendidas!");

        } else {
            System.out.println("Sucesso! Zerou a fila!");

        }
    }
}