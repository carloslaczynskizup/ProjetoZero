package a13_POO_22062023.ex01_Banco;

//Elabore uma classe Conta Bancária com os seguintes atributos:
//● nomeCliente
//● numConta
//● saldo
//E os seguintes métodos:
//● sacar (o saldo não pode ficar negativo)
//● depositar
public class ContaBancaria {
    String nomeCliente;
    String numeroCC;
    double saldoConta;

    public ContaBancaria(String nomeCliente, String numeroCC, double saldoConta) {
        this.nomeCliente = nomeCliente;
        this.numeroCC = numeroCC;
        this.saldoConta = saldoConta;
    }

    public void sacar(double valorSacar) {
        if (valorSacar <= saldoConta) {
            saldoConta -= valorSacar;
            System.out.println("Você realizou um saque! Novo saldo no valor de R$ " + saldoConta);
        } else {
            System.out.println("Você não tem saldo suficiente");
        }

    }

    public void depositar(float valorDeposito) {
        saldoConta += valorDeposito;
        System.out.println("Você recebeu um depósito no valor de R$ " + saldoConta);
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumeroCC() {
        return numeroCC;
    }

    public void setNumeroCC(String numeroCC) {
        this.numeroCC = numeroCC;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }


}



