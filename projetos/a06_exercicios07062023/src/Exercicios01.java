import java.util.Scanner;

//Faça um algoritmo que leia dois valores inteiros A e B se os valores forem iguais deverá
// se somar os dois, caso contrário multiplique A por B. Ao final de qualquer um dos cálculos
// deve-se atribuir o resultado para uma variável C e mostrar seu conteúdo na tela.
public class Exercicios01 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Aqui se A = B irá somar - senão irá multiplicar.");
        System.out.println();

        System.out.println("Qual será o valor de A: ");
        int a = entrada.nextInt();

        System.out.println("Qual será o valor de B: ");
        int b = entrada.nextInt();

        int c = 0;

        if (a == b) {
            c = a + b;
        } else {
            c = a * b;
        }

        System.out.println("O valor de C é: " + c);


    }

}
