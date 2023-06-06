import java.util.Locale;

public class Main1 {
    public static void main (String[] args) {
        //println Quebra de linha.
        System.out.println("Olá Java!");
        System.out.println("Boa tarde 22/05/2023");

        //print - sem quebra de linha
        System.out.print("Olá Java!");
        System.out.println("Boa tarde 22/05/2023");

        //Exemplo com declaração de variável.
        int y = 40;
        System.out.println(y);

        //Exemplo com ponto flutuante - número decimal
        double x = 50.987645;
        System.out.println(x);

        //Exemplo com ponto flutuante - número decimal com formatação das casas decimais
        double z = 80.987645;
        System.out.println(z);
        //printf - quer dizer formatado - %n = quebra de linha (independente da plataforma)
        System.out.printf("%.2f%n", z); //formatação de 2 casas decimais
        System.out.printf("%.4f%n", z); //formatação de 4 casas decimais
        Locale.setDefault(Locale.US); // setar localização de formatação numérica - exemplo: Americano
        System.out.printf("%.2f%n", z); //formatação de 2 casas decimais
        System.out.printf("%.4f%n", z); //formatação de 4 casas decimais

        //concatenar vários elementos na escrita
        System.out.println("Resultado = " + z + " Quilômetros");

        //concatenar vários elementos na escrita - com formatação numérica e quebra de linha
        System.out.printf("Resultado = %.2f quilômetros%n", x);

        // %f ponto flutuante - %d inteiro - %s texto - %n quebra de linha
        String nome = "José";
        int idade = 30;
        double renda = 2000.0;
        System.out.printf("%s tem %d anos e recebe R$ %.2f reais%n", nome, idade, renda);

    }
}
