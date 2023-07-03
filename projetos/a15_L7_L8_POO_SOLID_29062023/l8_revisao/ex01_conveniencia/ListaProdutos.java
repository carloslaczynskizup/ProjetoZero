package a15_L7_L8_POO_SOLID_29062023.l8_revisao.ex01_conveniencia;

import java.util.ArrayList;
import java.util.List;

//Listando os produtos da Loja
public class ListaProdutos implements Gerenciamento {

    private List<Produtos> produtos;

    public ListaProdutos() {
        this.produtos = new ArrayList<>();
    }

    @Override
    public void addProduto(String nome, double preco) {
        Produtos produto = new Produtos(nome, preco) {
        };
        produtos.add(produto);
    }

    @Override
    public void listarProduto() {
        System.out.println("Segue a lista de produtos:");
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println("Produto: " + produtos.get(i).getNome() + " - Preço R$: " + produtos.get(i).getPreco());
            System.out.println("-----------------------");
        }
    }

    @Override
    public void removeProduto(String nome) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equals(nome)) {
                produtos.remove(i);
                System.out.println("O produto foi removido!");
                System.out.println("-------------------------");
            } else {
                System.out.println("O produto não foi encontrado!");
                System.out.println("-------------------------------");
            }
        }
    }

}
