package p1_s_responsabilidade_unica;


public class TesteCalculos {
    public static void main(String[] args) {

        //Instância da classe Calculos e atribui à variavel calculos
        //Em Java, quando queremos utilizar uma classe para criar objetos e chamar seus métodos,
        // primeiro precisamos criar uma instância dessa classe.
        // Essa instância é chamada de objeto ou instância da classe.
        Calculos calculos = new Calculos();

        int soma = calculos.soma(1, 2);
        int subtrair = calculos.subtrair(10, 20);
        int multiplicar = calculos.multiplicar(50, 100);
        int dividir = calculos.dividir(30, 5);

        System.out.println("Soma entre 1 e 2 = " + soma);
        System.out.println("Subtração entre 10 e 20 = " + subtrair);
        System.out.println("Multiplicação entre 50 e 100 = " + multiplicar);
        System.out.println("Divisão entre 30 e 5 = " + dividir);

    }

}
