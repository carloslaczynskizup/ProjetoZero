package p3_l_substituicao_Liskov;

//Classe abstrata que implementa a interface Ferramenta.
//Representação genérica e imprime a mensagem "Usando a ferramenta!"

public abstract class BaseFerramentas implements Ferramenta {
    @Override
    public void usar() {
        System.out.println("Usando a ferramenta!");
    }

    @Override
    public void guardar() {
        System.out.println("Guardando a ferramenta!");
    }
}
