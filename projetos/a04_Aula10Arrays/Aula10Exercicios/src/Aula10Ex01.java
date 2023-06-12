import java.util.ArrayList;
import java.util.List;
//Escreva um programa para remover um elemento específico de uma lista.
public class Aula10Ex01 {
    public static void main(String[] args){

        List<Integer> lista = new ArrayList<>();

        //lista add com 4 elementos
        lista.add(20);
        lista.add(70);
        lista.add(500);
        lista.add(656);

        lista.remove(3);//remove o elemento da posição 3

        System.out.println(lista);

    }
}
