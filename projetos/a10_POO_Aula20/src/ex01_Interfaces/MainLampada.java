package a10_POO_Aula20.src.ex01_Interfaces;

import java.util.Scanner;

//- Crie uma interface Lampada com métodos ligar() e desligar(), cujo
//contrato significa simplesmente imprimir mensagens informativas na
//tela;
//- Crie uma classe FabricaLampada que possui duas classes filhas que
//implementam a interface Lampada: Incandescente e Fluorescente;
//- Crie ainda um método construir(), que receba um parâmetro indicando
//o tipo de lâmpada e retorne o objeto Lampada criado;
//- Crie uma classe Exercicio01 com o método main(). Pergunte ao
//usuário qual lâmpada ele quer construir, ligue e desligue a lâmpada.
public class MainLampada {

    //Aqui é o ponto de entrada do programa.
    //Criada a instância da classe FabricaLampada e ler o tipo de lâmpada escolhida pelo usuário(a).
    //Aqui é impressa a mensagem informando a ação que foi realizada.
    //Os métodos ligar e desligar são chamados no objeto Funcional para iniciar a ação da lampada escolhida.

    public static void main(String[] args) {
        Fabricar funcional = new Fabricar();
        Scanner input = new Scanner(System.in);

        System.out.print("Qual o tipo de lâmpada quer montar? (I) para Incandescente ou (F) para Fluorescente): ");
        String tipo = input.nextLine();

        try {
            System.out.println("A Lâmpada está sendo montada...Aguarde... ");

            Thread.sleep(3000); // Pausa a execução por 3 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Funcional lampada = funcional.montar(tipo);
        if( lampada != null ) {
            lampada.ligarLampada();

            try {
                System.out.println();
                System.out.println("Lâmpada desligando em 3 segundos... ");

                Thread.sleep(3000); // Pausa a execução por 3 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            lampada.desligarLampada();
            System.out.println();
            System.out.println("A lâmpada foi montada e testada!");
        }
    }
}
