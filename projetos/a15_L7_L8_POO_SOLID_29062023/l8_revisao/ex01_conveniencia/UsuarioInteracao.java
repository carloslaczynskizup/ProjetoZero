package a15_L7_L8_POO_SOLID_29062023.l8_revisao.ex01_conveniencia;

import java.util.Scanner;

public class UsuarioInteracao {
    private Scanner scanner;
    private ListaProdutos listaProdutos;

    public UsuarioInteracao() {
        this.scanner = new Scanner(System.in);
        this.listaProdutos = new ListaProdutos();
    }

    public void menu() {
        boolean entrar = true;
        while (entrar) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    listaProdutos.listarProduto();
                    break;
                case 2:
                    addProduto();
                    break;
                case 3:
                    removeProduto();
                    break;
                case 4:
                    entrar = false;
                    break;

                default:
                    System.out.println("Opção inválida. Escolha outra opção.");
                    break;
            }

        }

    }

    private int exibirMenu() {
        System.out.println("Sistema de Produtos.");
        System.out.println("_____________________");
        System.out.println("1 - Listar produtos");
        System.out.println("2 - Adicionar produto");
        System.out.println("3 - Remover produto");
        System.out.println("4 - Sair");
        System.out.println("Escolha uma opção: ");
        return 0;
    }

    private void addProduto() {
        System.out.println("Digite o nome do produto desejado: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o preço do produto desejado: ");
        double preco = scanner.nextDouble();
        scanner.nextLine();

        listaProdutos.addProduto(nome, preco);
        System.out.println("O produto foi adicionado!");
        System.out.println();
    }

    private void removeProduto() {
        System.out.println("Digite o nome do produto que deseja excluir: ");
        String nome = scanner.nextLine();
        listaProdutos.removeProduto(nome);
        System.out.println("O produto foi removido!");
        System.out.println();
        scanner.close();

    }

}
