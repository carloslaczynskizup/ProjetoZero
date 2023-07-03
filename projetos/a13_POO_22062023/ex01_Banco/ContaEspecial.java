package a13_POO_22062023.ex01_Banco;

//ContaEspecial
//● atributo limite
//● sobrescreva o método sacar com a nova lógica necessária
public class ContaEspecial extends ContaBancaria {
    double limite = 0;

    public ContaEspecial(String nomeCliente, String numeroCC, double saldoConta) {
        super(nomeCliente, numeroCC, saldoConta);
        this.limite = limite;
    }

    //Sobrescrever o método sacar com a nova lógica necessária.

    @Override
    public void sacar(double valorSacar) {
        double saldoTotal = saldoConta + limite;
        if (valorSacar <= saldoTotal) {
            setSaldoConta(getSaldoConta() - valorSacar);
            System.out.println("Você realizou um saque! Novo saldo no valor de R$ " + saldoConta);
        } else {
            System.out.println("Você não tem saldo suficiente");
        }
    }


}
