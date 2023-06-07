//Escreva um programa que escreva na tela, de 1 até 100, de 1 em 1 e 2 vezes.
//
// A primeira vez com "for" e a segunda com "while".
public class Ex01Repeticao {
    public static void main (String[] args){
        for (int i = 0; i <= 100; i++){
            System.out.println(i);
        }

        int i = 0;
        while (i <= 100){
            System.out.println(i);
            i = i + 2;
        }
    }
}
