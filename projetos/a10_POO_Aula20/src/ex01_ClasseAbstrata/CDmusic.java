package a10_POO_Aula20.src.ex01_ClasseAbstrata;

public class CDmusic extends ItensLoja { //aqui classe CDmusic herdado da classe ItensLoja.
    int numeroDeFaixas;
    String estiloCD;
    public CDmusic(String nome, String estiloCD, double preco, int numeroDeFaixas) {
        super(nome, preco);//aqui os atributo nome e preco são chamados pela classe mãe ItensLoja.
        //super é usado para chamar o construtor da classe pai/mãe.
        this.numeroDeFaixas = numeroDeFaixas; //construtor com o atributo numeroDeFaixas.
        this.estiloCD = estiloCD; //construtor com o atributo estiloCD.
    }

    @Override //override é usado para chamar o método mostrarDetalhesItem da classe pai/mãe.
    public void mostrarDetalhesItem() {
        System.out.println("Título do CD: " + nome + " - Estilo: " + estiloCD + " - Preço R$: " + preco + " - Faixas: " + numeroDeFaixas);
        System.out.println();
    }


}
