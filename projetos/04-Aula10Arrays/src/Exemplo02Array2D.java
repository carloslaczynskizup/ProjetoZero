public class Exemplo02Array2D {

    public static void main (String[] args){

        double[][] notas = new double[4][4]; //linhas e colunas

        notas [0][0] = 10;
        notas [0][1] = 9;
        notas [0][2] = 8;
        notas [0][3] = 7;

        notas [1][0] = 6;
        notas [1][1] = 8;
        notas [1][2] = 4;
        notas [1][3] = 3;

        notas [2][0] = 7;
        notas [2][1] = 6;
        notas [2][2] = 9;
        notas [2][3] = 4;

        notas [3][0] = 8;
        notas [3][1] = 7;
        notas [3][2] = 6;
        notas [3][3] = 1;

        for (int iLinhas = 0; iLinhas < notas.length; iLinhas++) {

            System.out.println("Notas " + (iLinhas + 1));

            for (int xColunas = 0; xColunas < notas[iLinhas].length; xColunas++) {

                System.out.println(notas[iLinhas][xColunas] + "   ");
            }
            //System.out.println("Notas " + (iLinhas + 1));
        }

    }
}
