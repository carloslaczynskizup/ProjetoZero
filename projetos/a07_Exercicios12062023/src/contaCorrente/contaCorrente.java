package a07_Exercicios12062023.src.contaCorrente;

public class contaCorrente {

    String nomeCliente;
    int numeroCC;
    double saldoConta;

    public contaCorrente(String nomeCliente, int numeroCC, double saldoConta){
        this.nomeCliente = nomeCliente;
        this.numeroCC = numeroCC;
        this.saldoConta = saldoConta;
    }

    public void depositoCC(float valorDeposito){
        saldoConta += valorDeposito;
        System.out.printf("Você recebeu um depósito no valor de R$ %,.2f", saldoConta);
        System.out.println();

    }
    public void saqueCC(float valorSacar) {
        if (valorSacar < saldoConta) {
            saldoConta -= valorSacar;
            System.out.println("Você realizou um saque! Novo saldo no valor de R$ " + saldoConta);
        } else {
            System.out.println("O valor do saque é insuficiente para o seu saldo!");
        }

    }
}

