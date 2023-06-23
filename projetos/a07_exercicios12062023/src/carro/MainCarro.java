package a07_exercicios12062023.src.carro;

import java.util.Scanner;

//Crie uma classe para modelar um carro.
//Todo carro tem quantidade de portas, modelo, marca e potência.
public class MainCarro {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Todo carro tem quantidade de portas, modelo, marca e potência.");
        System.out.println("___________");

        System.out.print("Digite a Marca do carro que deseja: ");
        String marca = input.next();

        System.out.print("Digite o Modelo do carro: ");
        String modelo = input.next();

        System.out.print("Digite a quantidade de portas: ");
        int qtdPortas = input.nextInt();
        System.out.println();

        double potencia = 2.0; //valor padrão caso não digitar.

        System.out.println("Deseja informar a Potência do carro? (S/N): ");
        String respostaPotencia = input.next();

        if (respostaPotencia.equalsIgnoreCase("S")) {
            System.out.println("Qual a Potência do carro? ");
            potencia = Double.parseDouble(input.next().replace(",", "."));
            //trocar vírgula da entrada do usuário por ponto na saída.

        }

        //aqui cria um objeto da classe Carro para chamar o método ligaCarro
        //utiliza o construtor da classe Carro (this) para receber os dados neles informados.
        //Passa-se para o construtor e é usado para inicializar os atributos do objeto novoCarro.
        //
        Carro novoCarro = new Carro(marca, modelo, qtdPortas, potencia);
        novoCarro.ligaCarro();//essa linha chama o método ligaCarro na classe Carro,
        //para imprimir a mensagem na saída para o usuário.
        System.out.println("O seu carro escolhido foi: " + novoCarro.modelo + " - " + novoCarro.marca + " - " + novoCarro.qtdPortas + " portas - " + novoCarro.potencia + " cilindradas.");

    }
}