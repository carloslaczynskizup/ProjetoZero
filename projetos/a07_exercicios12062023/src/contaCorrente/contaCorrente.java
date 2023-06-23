package a07_exercicios12062023.src.contaCorrente;

public class contaCorrente {
    //atributos
    String nomeCliente;
    int numeroCC;
    double saldoConta;

    //método construtor
    public contaCorrente(String nomeCliente, int numeroCC, double saldoConta){
        this.nomeCliente = nomeCliente;
        this.numeroCC = numeroCC;
        this.saldoConta = saldoConta;
    }
    //métodos para permitir fazer depósitos e saques
    public void depositoCC(float valorDeposito){
        //aqui adiciona o valor fornecido pelo usuário a conta
        saldoConta += valorDeposito;
        System.out.printf("Você recebeu um depósito no valor de R$ %,.2f", saldoConta);
        System.out.println();

    }
    public void saqueCC(float valorSacar) {
        //aqui verifica se o saldo é sufuciente para realizar o saque. Se sim, subtrai o valor.
        if (valorSacar < saldoConta) {
            saldoConta -= valorSacar;
            System.out.println("Você realizou um saque! Novo saldo no valor de R$ " + saldoConta);
        } else {
            System.out.println("O valor do saque é insuficiente para o seu saldo!");
        }

    }
}

