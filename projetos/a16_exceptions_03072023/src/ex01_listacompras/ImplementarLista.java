package projetos.a16_exceptions_03072023.src.ex01_listacompras;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Esta classe implementa a intreface ListaDeCompras
//Seguindo com uma List e ceclarando o atributo lista se tornando uma lista de alimentos.
//com o switch casedas opções da lista adicionando e exibindo os alimentos e suas quantidades.
public class ImplementarLista implements ListaDeCompras {
    private List<Alimentacao> lista; //aqui uma lista de alimentos

    public ImplementarLista() {
        lista = new ArrayList<>();
    }

    public void adicionarLista(Scanner scanner) {
        while (true) {
            System.out.println("Selecionar o tipo de alimentação (Verduras, Grãos, Legumes ou Diversos): ");
            String opcao = scanner.nextLine().toUpperCase();

            Alimentacao alimentacao;

            switch (opcao) {
                case "VERDURAS":
                    alimentacao = new Verduras();
                    break;
                case "GRAOS":
                    alimentacao = new Graos();
                    break;
                case "LEGUMES":
                    alimentacao = new Legumes();
                    break;
                case "DIVERSOS":
                    alimentacao = new Diversos();
                    break;
                default:
                    throw new IllegalArgumentException("Opção inválida.");

            }

            alimentacao.lerQtd(scanner);
            lista.add(alimentacao);

            System.out.println("Deseja adicionar mais alguma coisa? (S/N)");
            String resposta = scanner.nextLine().toUpperCase();

            if (!resposta.equals("S")) {
                break;
            }

        }
    }

    //Aqui o método exibirLista é chamado e exibe as informações dos alimentos na tela para o usuário.
    @Override
    public void exibirLista() {
        for (Alimentacao alimentacao : lista) {
            System.out.println("Tipo: " + alimentacao.getTipo());
            System.out.println("Quantidade: " + alimentacao.getQtd());
            System.out.println();
        }
    }
}
