import java.util.Locale;

public class exercicios {
    public static void main (String[] args){
        String product1 = "Television";
        String product2 = "Computer";

        int age = 35;
        int code = 133;
        char gender = 'F';

        double price1 = 3500.00;
        double price2 = 5000.90;
        double measure = 55.8990;

        System.out.println("Products:");
        System.out.printf("%s, wich price is %.2f%n", product1, price1);
        System.out.printf("%s, wich price is %.2f%n", product2, price2);
        System.out.println();
        System.out.printf("Record: %d years old, code %d and gender: %c %n", age, code, gender);
        System.out.println();
        System.out.printf("Measure with decimal places: %f%n", measure);
        System.out.printf("Rouded (3  BR decimals)  %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("Rouded (3  US decimals)  %.3f%n", measure);


    }

}
