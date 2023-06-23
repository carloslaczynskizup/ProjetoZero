//Escreva um algoritmo que leia a velocidade de um veículo em km/h, e então calcule
// e exiba na tela a velocidade convertida em m/s (metros por segundo).
//O algoritmo deve também informar quanto tempo irá levar uma viagem na velocidade média
// informada de São Paulo até o Rio de Janeiro.
//Dicas: Para converter de km/h para m/s divida a velocidade pelo fator 3,6.
// Considere a distância aproximada de São Paulo até o Rio de Janeiro como sendo de 435 km

import java.util.Scanner;

public class velocidadeKmMs {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a distância em km:");
        float distancia = input.nextFloat();
        System.out.print("Digite a velocidade média em km/h:");
        float velocidadeMedia = input.nextFloat();
        float tempo = distancia / velocidadeMedia;
        System.out.printf("O tempo estimado é de %.2f horas", tempo);

////Opcional: imprimir o tempo em horas, minutos e segundos
//        int tempoS = (tempo * 3600);
//        int horas = (tempoS / 3600);
//        int tempoS = (tempoS % 3600);
//        int minutos = (tempoS / 60);
//        int segundos = (tempoS % 60);
//        System.out.printf("%05d %02d %02d", horas, minutos, segundos);
    }

}
