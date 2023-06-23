package a10_POO_Aula20.src.ex01_ClasseAbstrata;

class Livros extends ItensLoja { //aqui classe Livro herdado da classe ItensLoja.
        String autor;
    public Livros(String nome, double preco, String autor) {
        super(nome, preco); //aqui os atributo nome e preco são chamados pela classe mãe ItensLoja.
        //super é usado para chamar o construtor da classe pai/mãe.
        this.autor = autor; //aqui adiciona novo atributo chamado autor.
        //acima um Construtor que recebe os atributos nome e preco e autor
    }

    @Override //@Override é usado para chamar o método mostrarDetalhesItem da classe pai/mãe.
    public void mostrarDetalhesItem() {
        System.out.println("Título do Livro: " + nome + " - Preço R$: " + preco + " - Autor: " + autor);
        System.out.println();
    }
}