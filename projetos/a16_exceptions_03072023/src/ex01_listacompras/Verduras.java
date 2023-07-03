package projetos.a16_exceptions_03072023.src.ex01_listacompras;

import java.util.Scanner;
//Classe que herda da classe Alimentacao
public class Verduras extends Alimentacao {
    private double qtd;

    public Verduras() {
        super("Verdura");

    }

    public double getQtd() {
        return qtd;
    }


    @Override
    public void lerQtd(Scanner scanner) {
        System.out.println("Informe a quantidade em gramas: ");
        String qtdString = scanner.nextLine();

        if (qtdString.isEmpty()) {
            throw new UnsupportedOperationException("A quantidade não pode ser vazia");
        }

        try {
            qtd = Double.parseDouble(qtdString);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Verduras, a quantidade deve ser informada com pontos.");
        }


    }

}
