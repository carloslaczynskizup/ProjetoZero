package a15_L7_L8_POO_SOLID_29062023.l7_paises;

//Essa implementação utiliza os princípios do SOLID
//onde cada classe tem uma unica responsabilidade e o princípio da segregação de interfaces,
//ao criar a interface PaisVizinho em separado.
// Em contrapartida a parte bônus implemantada permite obter a lista de paises vizinhos,
// entre dois países da região da Europa Central.
// Loucura, loucura, loucura. Hahaha!!!

import java.util.List;

public class MainPais {
    public static void main(String[] args) {

        //Criando os Países
        Pais polonia = new EuropaCentral("POL", "Polônia", 37877771, 322575);
        Pais alemanha = new EuropaCentral("DEU", "Alemanha", 83000000, 357588);
        Pais ucrania = new EuropaCentral("UCR", "Ucrânia", 43790000, 603700);
        Pais hungria = new EuropaCentral("HUN", "Hungria", 9981334, 93025);

        //Definindo as fronteiras
        polonia.addVizinho(alemanha);
        polonia.addVizinho(ucrania);
        ucrania.addVizinho(hungria);

        //Vizinhos
        System.out.println("Polônia e Alemanha são vizinhos? " + polonia.ehVizinho(alemanha));
        System.out.println("Polônia e Ucrânia são vizinhos? " + polonia.ehVizinho(ucrania));
        System.out.println("Ucrânia e Hungria são vizinhos? " + ucrania.ehVizinho(hungria));
        System.out.println();

        //Calcular a densidade populacional
        System.out.println("A densidade populacional da Polônia é: " + polonia.calcularDensidadePopulacao() + " hab./km²");
        System.out.println("A densidade populacional da Alemanha é: " + alemanha.calcularDensidadePopulacao() + " hab./km²");
        System.out.println("A densidade populacional da Ucrânia é: " + ucrania.calcularDensidadePopulacao() + " hab./km²");
        System.out.println("A densidade populacional da Hungria é: " + hungria.calcularDensidadePopulacao() + " hab./km²");
        System.out.println();

        //Listar os vizinhos em comum entre 2 países
        List<Pais> vizinhosComuns = ((EuropaCentral) polonia).getVizinhosEmComum(alemanha);
        System.out.println("Vizinhos em comum entre a" + polonia.getNome() + " são:");
        for (Pais vizinho : vizinhosComuns) {
            System.out.println(vizinho.getNome());
        }
    }
}
