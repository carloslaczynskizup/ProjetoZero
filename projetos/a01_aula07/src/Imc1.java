public class Imc1 {
    public static void main(String[] args) {
        // Crie um algoritmo que receba a altura e peso do usuário, calcule seu IMC e exiba seu valor.
        //OBS:  Fórmula: IMC = peso/ (altura x altura).
        double altura = 1.74;
        double peso = 73.83;
        double imc = peso / (altura * altura);

        //System.out.println("O resultado do IMC é " + imc);

        System.out.printf("O resultado do IMC é %.2f%n", imc);

    }
}