package projetos.a16_exceptions_03072023.src.ex01_listacompras;

import java.util.Scanner;

public class Graos extends Alimentacao {
    private double qtd;

    public Graos() {
        super("Grãos");

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
            throw new NumberFormatException("Grãos, a quantidade deve ser informada com pontos.");
        }

    }
}
