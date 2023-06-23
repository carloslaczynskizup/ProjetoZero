package a13_POO_22062023.ex01_Banco;

public class MainBanco {
    public static void main(String[] args) {

        //Criando Contas

        ContaBancaria c1 = new ContaBancaria("Carlos Magno", "123456", 40000);
        ContaBancaria c2 = new ContaBancaria("Maria Aparecida", "654321", 20000);
        ContaPoupanca c3 = new ContaPoupanca("João Cláudio", "987654", 35000);
        ContaPoupanca c4 = new ContaPoupanca("Pedro Silva", "123456", 30000);
        ContaEspecial c5 = new ContaEspecial("Ana Paula", "654321", 15000);


        //Sacar dinheiro das contas
        c1.sacar(5000);
        c2.sacar(1000);
        c3.sacar(2000);
        c4.sacar(3000);
        c5.sacar(4000);
        System.out.println();

        //Depositar dinheiro nas contas
        c1.depositar(5000);
        c2.depositar(1000);
        c3.depositar(2000);
        c4.depositar(3000);
        c5.depositar(4000);
        System.out.println();

        //Mostrar onovo saldo das contas con rendimentos

        c3.calcularNovoSaldo(0.05);
        c4.calcularNovoSaldo(0.05);
        System.out.println();


        //Mostras as modificações dos dados e movimentações do cliente
        System.out.println("Dados da conta 1:");
        System.out.println("Cliente: " + c1.getNomeCliente());
        System.out.println("Número da conta: " + c1.getNumeroCC());
        System.out.println("Saldo: " + c1.getSaldoConta());
        System.out.println();
        System.out.println("Dados da conta 2:");
        System.out.println("Cliente: " + c2.getNomeCliente());
        System.out.println("Número da conta: " + c2.getNumeroCC());
        System.out.println("Saldo: " + c2.getSaldoConta());
        System.out.println();
        System.out.println("Cliente: " + c3.getNomeCliente());
        System.out.println("Número da conta: " + c3.getNumeroCC());
        System.out.println("Saldo: " + c3.getSaldoConta());
//        System.out.println("Saldo com rendimento: " + c3.getSaldoConta() * 0.05);
        System.out.println();
        System.out.println("Cliente: " + c4.getNomeCliente());
        System.out.println("Número da conta: " + c4.getNumeroCC());
        System.out.println("Saldo: " + c4.getSaldoConta());
        System.out.println();
        System.out.println("Cliente: " + c5.getNomeCliente());
        System.out.println("Número da conta: " + c5.getNumeroCC());
        System.out.println("Saldo: " + c5.getSaldoConta());
        System.out.println();

    }
}
