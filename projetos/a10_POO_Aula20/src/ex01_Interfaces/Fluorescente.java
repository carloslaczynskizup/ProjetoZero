package a10_POO_Aula20.src.ex01_Interfaces;

//Essa subclasse Fluorescente implementa a interface Funcional.
//Aqui será impressa a mensagem informando a ação que foi realizada.
public class Fluorescente implements Funcional{

    public void ligarLampada() {
        System.out.println("Lâmpada Fluorescente ligou.");
    }

    public void desligarLampada() {
        System.out.println("Lâmpada Fluorescente desligou.");
    }
}
