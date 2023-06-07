public class Exemplo01Aula {

    public static void main(String[]args){

        double[] temperaturas = new double[10]; //aqui entre colchetes coloca-se a limitação do array

        temperaturas[0] = 22.3;
        temperaturas[1] = 27.0;
        temperaturas[2] = 29.5;
        temperaturas[3] = 15.0;

        for (int i = 0; i < temperaturas.length; i++) {

            System.out.println("Dia " + (i + 1) + ": " + temperaturas[i]);


        }





    }


}
