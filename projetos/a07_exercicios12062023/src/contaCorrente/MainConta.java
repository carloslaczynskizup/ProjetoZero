package a07_exercicios12062023.src.contaCorrente;

import java.util.Scanner;

public class MainConta {
    //Aqui são os dados solicitados ao usuário
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = input.nextLine();

        System.out.print("Digite o número da conta corrente: ");
        int numeroCC = input.nextInt();

        System.out.print("Digite o saldo da conta corrente: ");
        float saldoConta = input.nextFloat();
        System.out.println();

        //aqui é uma instância da classe contaCorrente de acordo com os dados fornecidos acima.
        //essa instância abaixo que chama o construtor.
        //new é usada para criar um novo objeto da classe supracitada.
        //Objeto é criado com base no construtor da classe (exemplo: this.exemplo - this é um operadot)
        contaCorrente conta = new contaCorrente(nomeCliente, numeroCC, 0.0);

        System.out.println("Dados da Conta Corrente.");
        System.out.println("__________");
        System.out.println("Nome do cliente correntista é: " + conta.nomeCliente);
        System.out.println("Número da conta corrente é: " + conta.numeroCC);
        System.out.printf("O saldo da conta é R$: %,.2f ", conta.saldoConta);
        System.out.println();

        System.out.print("Qual valor deseja depositar? ");
        float valorDepositar = input.nextFloat();
        conta.depositoCC(valorDepositar);

        System.out.print("Qual valor deseja para o Saque? ");
        float valorSacar = input.nextFloat();
        conta.saqueCC(valorSacar);

    }

}




