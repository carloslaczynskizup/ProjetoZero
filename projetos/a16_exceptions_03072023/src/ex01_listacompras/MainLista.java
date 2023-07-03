package projetos.a16_exceptions_03072023.src.ex01_listacompras;

import java.util.Locale;
import java.util.Scanner;

public class MainLista {
        public static void main(String[] args) {
                Locale.setDefault(Locale.US);
                Scanner scanner = new Scanner(System.in);

                ListaDeCompras lista = new ImplementarLista();
                lista.adicionarLista(scanner);
                lista.exibirLista();

                scanner.close();
        }
}
