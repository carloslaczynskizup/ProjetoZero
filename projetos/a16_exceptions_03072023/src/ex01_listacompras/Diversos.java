package projetos.a16_exceptions_03072023.src.ex01_listacompras;

import java.util.Scanner;

public class Diversos extends Alimentacao {
    private double qtd;

    public Diversos() {
        super("Diversos");

    }

    @Override
    public void lerQtd(Scanner scanner) {
        System.out.println("Informe a quantidade em unidades: ");
        String qtdString = scanner.nextLine();

        if (qtdString.isEmpty()) {
            throw new UnsupportedOperationException("A quantidade não pode ser vazia");
        }

        try {
            qtd = Integer.parseInt(qtdString);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Diversos, a quantidade deve ser informada em inteiros.");
        }
    }

    public double getQtd() {
        return qtd;
    }
}
