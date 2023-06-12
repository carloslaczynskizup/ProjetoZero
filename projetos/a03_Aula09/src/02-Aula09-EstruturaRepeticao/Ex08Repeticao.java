import java.util.Scanner;
//Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.

//Calcular o fatorial de um número é multiplicá-lo pelos seus antecessores maiores que zero.
//O fatorial de um número é representado pelo número seguido de um ponto de exclamação, ou seja, n!.
//De modo geral, temos que:
//n!=n⋅(n−1)⋅(n−2)...
//2!=2⋅1=2
//3!=3⋅2⋅1=6
//4!=4⋅3⋅2⋅1=24
//5!=5⋅4⋅3⋅2⋅1=120
public class Ex08Repeticao {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Cálculo de Fatorial");
        System.out.println("Digite um número: ");
        int numero = input.nextInt();


        int cont = 2; //Qualquer número multiplicado por 1 é igual a ele mesmo.
        // Então é desnecessário começar do 1.
        int fatorial = 1;

        //Obs.1: O while executa enquanto o contador for menor ou igual ao numero.
        // Em cada iteração, multiplicamos o fatorial pelo valor do contador
        // e incrementamos o contador. Assim incrementando o contador. (cont++)
        //Obs2: A multiplicação tem que incluir o próprio numero(num), então a condição tem que ser <=.
        // E como o cont tem que aumentar de valor a cada iteração, tem que ser cont++.
        while (cont <= numero) {
           fatorial = fatorial * cont; // n!=n⋅(n−1)⋅(n−2)... // ex: 5!=5⋅4⋅3⋅2⋅1=120
            cont++;

        }

        System.out.println("O fatorial de : " + numero + " é " + fatorial);








    }
}
