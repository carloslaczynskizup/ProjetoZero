package p1_s_responsabilidade_unica;

//Na classe Calculos possui uma única responsabilidade de realizar cálculos simples matemáticos.
//Contendo os métodos de soma, subtrair, multiplicar e dividir. Sendo somente dois números inteiros.
//Esta classe segue o (S)Princípio de Responsabilidade Unica, em que somente a única função de realizar
// os cálculos.
public class Calculos {

    public int soma(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        return a / b;
    }

}
