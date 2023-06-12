import java.util.ArrayList;
import java.util.List;
//Escreva um programa para inserir um elemento (posição específica) em uma lista.
public class Aula10Ex02 {
    public static void main(String[] args){

        List<Integer> lista = new ArrayList<>();

        //lista add com 4 elementos
        lista.add(20);
        lista.add(70);
        lista.add(500);
        lista.add(656);
        lista.add(600);

        System.out.println("Lista antes da remoção da posição 2: " + lista);
        System.out.println();

        lista.remove(2);

        lista.add(2,300); //inserindo o valor 300 na posição 2

        System.out.println("Lista atualizada com a inserção do novo valor: " + lista);

    }
}
