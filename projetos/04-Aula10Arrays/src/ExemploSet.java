import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploSet {
    public static void main (String[] args){
        //Há momentos em que a ordem dos elementos guardados
        // não nos importa,
        // porém precisamos garantir que não há repetição de elementos na lista.
        Set<Integer> listaNumeros = new HashSet<>();

        listaNumeros.add(4);
        listaNumeros.add(5);
        listaNumeros.add(6);

        Iterator<Integer> iterator = listaNumeros.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }
    }
}
