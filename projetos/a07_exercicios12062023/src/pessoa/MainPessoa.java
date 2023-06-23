//Crie uma classe que modele uma pessoa, toda pessoa contém nome, idade, peso e altura.
// No construtor, o peso é opcional, com valor default (padrão) zero e os
// demais atributos são obrigatórios.

package a07_exercicios12062023.src.pessoa;

import java.util.Scanner;

public class MainPessoa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Crie uma classe que modele uma pessoa, toda pessoa contém nome, idade, peso e altura.");
        System.out.println();
        System.out.print("Digite o nome da Pessoa: ");
        String nome = input.nextLine();

        System.out.print("Digite a idade da Pessoa: ");
        int idade = input.nextInt();

        System.out.print("Digite o peso da Pessoa (separador vírgula): ");
        double peso = input.nextDouble();

        System.out.print("Digite a altura da Pessoa (separador vírgula): ");
        double altura = input.nextDouble();
        System.out.println();

        //nova instância da classe Pessoas com base nos valores do usuário
        //atribuindo essa instância a variável pessoa
        Pessoa pessoa = new Pessoa(nome, idade, peso, altura);

        System.out.println("Seguem abaixo os Dados fornecidos da Pessoa.");
        System.out.println("___________");
        System.out.println("Nome completo: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade + " anos.");
        System.out.println("Peso: " + pessoa.peso + " kg.");
        System.out.println("Altura: " + pessoa.altura + " metros.");
        System.out.println();

        pessoa.emagrece(2.0);
        pessoa.engorda(5.0);
        pessoa.envelhece();


        System.out.println("Dados atualizados da pessoa.");
        System.out.println("_____________");
        System.out.println("Idade atualizada: " + pessoa.idade + " anos.");
        System.out.println("Peso atualizado: " + pessoa.peso + " kg");

    }
}
