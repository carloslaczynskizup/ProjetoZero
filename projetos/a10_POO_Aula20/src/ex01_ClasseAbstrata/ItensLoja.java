package a10_POO_Aula20.src.ex01_ClasseAbstrata;

   //classe abstrata ItensLoja com atributos nome e preco, com o construtor de mesma identificação.
    public abstract class ItensLoja{
        String nome;
        double preco;
        public ItensLoja(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }
        public abstract void mostrarDetalhesItem();
        //aqui é declarado como abstrato, sendo responsável por exibir os detalhes do item.
        // Por que abstrato? Classe abstrata é uma classe que não pode ser instanciada.

    }

