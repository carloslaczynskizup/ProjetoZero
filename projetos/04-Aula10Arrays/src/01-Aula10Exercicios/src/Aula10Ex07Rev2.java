//Crie um programa para exibir o inteiro fornecido pelo usuário na ordem inversa.
//Entrada: 1234 Saída: 4321
import java.util.Scanner;
    public class Aula10Ex07Rev2 {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite um número inteiro para inverter: ");
            int numeroUsuario = entrada.nextInt();

            String numeroInvertido = new StringBuilder(String.valueOf(numeroUsuario)).reverse().toString();
            // Explicação desse código está abaixo.

            System.out.println("O número invertido é: " + numeroInvertido);

        }
    }
//observações: https://www.devmedia.com.br/a-classe-stringbuilder-em-java/25609#:~:text=A%20classe%20StringBuilder%20faz%20parte,mesmo%20sentido%20que%20classe%20String.
//A classe StringBuilder faz parte do pacote java.lang. Essa classe permite criar e manipular dados
// de Strings dinamicamente, ou seja, podem criar variáveis de String modificáveis.
//O significado da classe StringBuilder não tem o mesmo sentido que classe String.
//reverse – Retorna os caracteres invertidos;
//
//Então eu pesquisei e achei uma melhor forma de inverter os números usando a classe StringBuilder.
//A forma foi tentar alguma classe que poderia converter um valor de qualquer tipo em String, que é o
//método String.valueOf(numeroUsuario).
//.reverse() inverte a ordem dos caracteres dentro da classe StringBuilder
//toString (https://acervolima.com/metodo-stringbuilder-tostring-em-java-com-exemplos/)
//O método toString() da classe StringBuilder é o método embutido usado para retornar uma string
// que representa os dados contidos pelo objeto StringBuilder.
