//Crie uma hierarquia de classes para uma loja que venda livros, CDs e DVDs.
// Sendo separados por: uma classe para Livros, uma classe para CDS,
// classe para DVD e outra classe para Main.
//
//Sobrescreva o método mostrarDetalhesDoItem para que imprima:
//
//- Para livros: nome, preço e autor;
//- Para CDs: nome, preço e número de faixas;
//- Para DVDs: nome, preço e duração.
//
//Evite ao máximo repetição de código. Em seguida, crie uma classe Loja com o
//método main() que adicione 5 produtos diferentes (a sua escolha) a um vetor e, por
//fim, imprima o conteúdo.

package a10_POO_Aula20.src.ex01_ClasseAbstrata;

//aqui permite uma hierarquia de classes para diferentes tipos de itens em uma loja.
//para tratar cada item de forma polimórfica e evitar repetição de código.
public class MainLoja { //classe principal ponto de entrada do programa
    public static void main(String[] args) {
        //array ItensLoja chamado produtos com cinco itens
        ItensLoja[] produtos = new ItensLoja[5];    // cria um vetor de ItensLoja

        //aqui instâncias diferentes itens da loja
        produtos [0] = new Livros("Harry Potter e a Pedra Filosofal", 39.90, "J.K. Rowling");
        produtos [1] = new CDmusic("AC/DC - Highway to Hell", "Rock Internacional",30.90, 12);
        produtos [2] = new DVD("Star Wars", "Ficção Científica", 54.90, 200);
        produtos [3] = new Livros("Harry Potter e o Prisioneiro de Azkaban", 49.90, "J.K. Rowling");
        produtos [4] = new CDmusic("Barão Vermelho - Declare Guerra", "Rock Nacional", 25.90, 10);

        System.out.println("Seguem abaixo os itens da Loja.");
        System.out.println(">>>>>>>>>> <<<<<<<<<<");

        //loop para mostrar cada item do vetor/array produtos.
        for (ItensLoja item: produtos) {
                        item.mostrarDetalhesItem();//aqui possui o metodo mostrarDetalhesDoItem.
            //quando chamado o metodo mostrarDetalhesDoItem,
            //cada item detalhado é impresso na tela.
            //for para percorrer cada item do array produtos e chamar o método mostrarDetalhesItem
            //para a exibição dos itens na tela.

        }

    }

}
