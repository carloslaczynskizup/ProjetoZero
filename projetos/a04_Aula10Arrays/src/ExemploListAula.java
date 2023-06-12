import java.util.ArrayList;
import java.util.List;

public class ExemploListAula {

    public static void main (String[] args){

        List<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);

        //lista.remove(0);

//        for (int i = 0; i < lista.size(); i++) {
//          //for para imprimir um item específico da lista
//            System.out.println(lista.get(i));
//
//        }
        //for each para imprimir a lista inteira. Não é indexado.
        for (int i : lista) {

            System.out.println(i);

        }
    }
}
