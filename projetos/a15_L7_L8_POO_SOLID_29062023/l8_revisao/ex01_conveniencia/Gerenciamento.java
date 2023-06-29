package a15_L7_L8_POO_SOLID_29062023.l8_revisao.ex01_conveniencia;

public interface Gerenciamento {
    //Gerenciar as operações de produtos da loja.

    void addProduto(String nome, double preco);
    void removeProduto(String nome);
    void listarProduto();

}
