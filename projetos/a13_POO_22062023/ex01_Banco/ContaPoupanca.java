package a13_POO_22062023.ex01_Banco;

//Crie também duas subclasses chamadas ContaPoupanca e ContaEspecial, com as
//seguintes características:
//ContaPoupanca
//● atributo diaRendimento
//● método calcularNovoSaldo, recebe taxa de rendimento da poupaça e atualiza o saldo
public class ContaPoupanca extends ContaBancaria {
    //subclasse da classe ContaBancaria
    int diaRendimento;

    //construtor da classe ContaPoupanca
    public ContaPoupanca(String nomeCliente, String numeroCC, double saldoConta) {
        super(nomeCliente, numeroCC, saldoConta);
        this.diaRendimento = diaRendimento;
    }


    //Incluir método calcularNovoSaldo, para receber o rendimento e atualizar o saldo
    public void calcularNovoSaldo(double TxRendimento) {
        double novoSaldo = getSaldoConta() + (getSaldoConta() * TxRendimento);
        setSaldoConta(novoSaldo);
        System.out.println("Novo saldo com o rendimento de R$ " + novoSaldo);

    }

}


