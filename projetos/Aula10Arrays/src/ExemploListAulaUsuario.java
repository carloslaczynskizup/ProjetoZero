import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExemploListAulaUsuario {

    public static void main (String[] args){

        List<Integer> lista = new ArrayList<>();
        Scanner entrada = new Scanner(System.in); //valores manualmente pelo usuário

        System.out.println("Quantos valores quer incluir na lista? ");//mostrar pergunta para o usuário
        int respostaNumValores = entrada.nextInt();//pegar a resposta do usuário

        for (int i = 0; i < respostaNumValores; i++){
            //for para loop de perguntas ao usuário até finalizar a lista

            System.out.println("Qual o nome quer incluir na lista: ");
            int resposta = entrada.nextInt();
            lista.add(resposta);//add para adicionar os dados do usuário na lista
        }
        System.out.println(lista);//print na tela com os valores inseridos pelo usuário.
        //Mostra a lista dentro de colchetes na forma horizontal.

        for (int i : lista) {
            //for each para percorrer a lista e mostrar os valores da lista em cada índice.
            //Mostra os valores um abaixo do outro.

           System.out.println(i);

        }
    }
}
