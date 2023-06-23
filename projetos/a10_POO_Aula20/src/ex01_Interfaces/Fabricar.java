package a10_POO_Aula20.src.ex01_Interfaces;

//Essa classe Fabricar é responsável por montar a lâmpada no tipo especificado.
//É criada uma instância do tipo Funcional correspondente das classes Incandescente e Fluorescente.
public class Fabricar {
    public Funcional montar(String tipo) {
        if (tipo.equalsIgnoreCase("I")) {
            return new Incandescente();
        } else if (tipo.equalsIgnoreCase("F")) {
            return new Fluorescente();
        } else {
            System.out.println("Tipo inválido. Selecione novamente.");
            return null;
        }
    }
}
