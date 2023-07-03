package a12_get_set_override_overload.src.ex01_ICarros;

//Após a sua formação no Catalisa, o pessoal te redirecionou para o cliente chamado ICarros.
// No seu primeiro dia de trabalho , a sua tech lead te pediu que //crie um sistema simples de registro de carros
// para que o time comece a catalogar os tipos de carros que o cliente possui para financiamento.
// Ela te passou que, por enquanto, o cliente trabalha apenas com 3 marcas de carros, sendo Renault, Fiat e
//Hyundai e todos os carros possuem as seguintes informações:
//
//- Marca; - Ano; - Valor; - Cor; - Portas; - Velocidade.
//
//Depois, sua tech lead lhe informou que todos os carros iniciam a partida do motor, freiam e aceleram,
// porém, cada um faz isso de uma forma diferente.
public abstract class CatalogoCarros {

    private String marca;
    private String cor;
    private int ano;
    private int portas;
    private int velocidade;
    private double valor;


    //Construtor público para criar um objeto do tipo CatalogoCarros e com os atributos correspondentes.
    public CatalogoCarros(String marca, String cor, int ano, int portas, int velocidade, double valor) {
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.portas = portas;
        this.velocidade = velocidade;
        this.valor = valor;
    }
    //Os métodos da classe incluem as ações do carro como: ligar, frear e acelerar.

    public void ligarCarro() {
        System.out.println("Iniciando o motor. Carro ligado! A velocidade está em " + velocidade + " km/h");
    }

    public void frearCarro() {
        System.out.println("Freando o carro. A velocidade está em " + velocidade + " km/h");

    }

    public void acelerarCarro() {
        System.out.println("Acelerando o carro. A velocidade está em " + velocidade + " km/h");
    }


    //Getters e Setters para o incremento e decremento da velocidade do carro.
    public int getVelocidade() {
        return velocidade;
    }

    public int setVelocidade(int velocidade) {
        return this.velocidade = velocidade;
    }

    //Getters e Setters para as informações e dados do carro.


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}