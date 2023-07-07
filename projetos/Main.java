import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        String x;
        int y;
        double z;
        char a;


        System.out.println("Digite uma palavra: ");
        x = scanner.next();

        System.out.println("Digite um número inteiro: ");
        y = scanner.nextInt();

        System.out.println("Digite um número real: ");
        z = scanner.nextDouble();

        System.out.println("Digite um caractere: ");
        a = scanner.next().charAt(0);

        System.out.println("Valor de x é: " + x);
        System.out.println("Valor de y é: " + y);
        System.out.printf("Valor de z é: %.2f%n", z);
        System.out.println("Valor de a é: " + a);

        System.out.println();

        scanner.close();


        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//        System.out.println("Oi teste");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Shift+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
//        }
//    }
    }
}