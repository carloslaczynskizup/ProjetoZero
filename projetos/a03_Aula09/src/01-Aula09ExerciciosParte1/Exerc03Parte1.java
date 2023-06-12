//Faça um programa que faça 5 perguntas para uma a07_Exercicios12062023.src.pessoa sobre um crime. As perguntas são:
//        "Telefonou para a vítima?"
//        "Esteve no local do crime?"
//        "Mora perto da vítima?"
//        "Devia para a vítima?"
//        "Já trabalhou com a vítima?"
//
//        O programa deve no final emitir uma classificação sobre a participação da a07_Exercicios12062023.src.pessoa no crime.
//        Se a a07_Exercicios12062023.src.pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita",
//        entre 3 e 4 como "Cúmplice" e 5 como "Assassino".
//        Caso contrário, ele será classificado como "Inocente".

import java.util.Scanner;

public class Exerc03Parte1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sim = 0;
        System.out.println("Programa de Investigação Criminal");
        System.out.println("Por favor, responda as perguntas abaixo. Responda com Sim ou Não.");

        System.out.print("Você telefonou para a vítima?: ");
        String resposta = input.next();
        if (resposta.equalsIgnoreCase("Sim")){
            //incremento somente das repostas positivas (++)
            sim++;
        }

        System.out.print("Você esteve no local do crime? ");
        resposta = input.next();
        if (resposta.equalsIgnoreCase("Sim")){
            sim++;
        }

        System.out.print("Você mora perto da vítima? ");
        resposta = input.next();
        if (resposta.equalsIgnoreCase("Sim")){
            sim++;
        }

        System.out.print("Você devia dinheiro para a vítima? ");
        resposta = input.next();
        if (resposta.equalsIgnoreCase("Sim")){
            sim++;
        }

        System.out.print("Você já trabalhou com a vítima? ");
        resposta = input.next();
        if (resposta.equalsIgnoreCase("Sim")){
            sim++;
        }

        switch (sim){
            //Caso for responder 2 positivas
            case 2:
                System.out.println();
                System.out.println(">>> Você pode ser possível Suspeita. <<<");
                break;

            //Caso for positiva entre 3 e 4 respostas
            case 3:
            case 4:
                System.out.println();
                System.out.println(">>> Você pode ser possível Cúmplice. <<<");
                break;

            //Caso for positiva em 5 respostas
            case 5:
                System.out.println();
                System.out.println(">>> Você é Assassino(a). <<<");
                break;

            //Caso todas respostas negativas
            default:
                System.out.println();
                System.out.println(">>> Você é Inocente. <<<");
                break;
        }

    }

}
