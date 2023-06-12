import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
    //Em outros casos precisamos armazenar valores de maneira mais organizada como se fosse um banco de dados
    // onde tenho chave e valor. Para isso podemos contar com a estrutura de memória map.

    public static void main (String[] args){

        Map<String, Double> listaCompras = new HashMap<>();

        listaCompras.put("Café", 18.90);
        listaCompras.put("Açucar", 10.90);
        listaCompras.put("Presunto", 28.90);
        listaCompras.put("Queijo Prato", 48.90);

        System.out.println(listaCompras);//mostra os dados na horizontal entre chaves

       for (String chave : listaCompras.keySet()){
           System.out.println("Produto: " + chave + " e Valor: " + listaCompras.get(chave));
           //mostrar o dado(chave/identificador) em String e o dado(valor) em Double

       }

    }
}