import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Peça ao usuário dois números e exiba em ordem decrescente (suponha números diferentes).
public class Aula10Ex03 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        List<Integer> numerosUsuario = new ArrayList<>();

        System.out.println("Colocando os números fornecidos em ordem decrescente.");
        System.out.println("Digite o primeiro número: ");
            int numero1 = entrada.nextInt();
            numerosUsuario.add(numero1);

        System.out.println("Digite o segundo número: ");
            int numero2 = entrada.nextInt();
            numerosUsuario.add(numero2);


            //Collections.reverse(numerosUsuario);

        Collections.sort(numerosUsuario, Collections.reverseOrder());//coloca os números em ordem descrecente

        System.out.println("Números em ordem descrecente são " + numerosUsuario);

    }
}
