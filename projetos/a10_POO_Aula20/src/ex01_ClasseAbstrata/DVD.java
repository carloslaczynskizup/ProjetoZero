package a10_POO_Aula20.src.ex01_ClasseAbstrata;

public class DVD extends ItensLoja { //aqui classe DVD herdado da classe ItensLoja.
    int duracaoMinutos;
    String categoriaDVD;
    public DVD(String nome, String categoriaDVD, double preco, int duracaoMinutos) {
        super(nome, preco); //aqui os atributos nome e preco são chamados pela classe mãe ItensLoja.
        //super é usado para chamar o construtor da classe pai/mãe.
        this.duracaoMinutos = duracaoMinutos; //construtor com o atributo duracaoMinutos.
        this.categoriaDVD = categoriaDVD; //construtor com o atributo categoriaDVD.
    }

    @Override //override é usado para chamar o método mostrarDetalhesItem da classe pai/mãe.
    public void mostrarDetalhesItem() {
        System.out.println("Título do DVD: " + nome + " - Categoria: " + categoriaDVD + " - Preço R$: " + preco + " - Duração: " + duracaoMinutos + " minutos");
        System.out.println();
    }
}
