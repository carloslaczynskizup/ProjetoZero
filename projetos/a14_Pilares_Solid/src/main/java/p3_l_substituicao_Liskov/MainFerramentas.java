package p3_l_substituicao_Liskov;

//Instância da classe CaixaFerramentas e adiciona as ferramentas
//sem quebrar o comportamento definido pela interface Ferramenta.
public class MainFerramentas {
    public static void main(String[] args) {

        CaixaFerramentas caixa = new CaixaFerramentas();

        Ferramenta ChaveDeFenda = new ChaveDeFenda();
        caixa.addFerramenta(ChaveDeFenda);
        caixa.usarFerramenta();
        caixa.guardarFerramenta();
        System.out.println();
        Ferramenta ChaveDeBocaN10 = new ChaveDeBocaN10();
        caixa.addFerramenta(ChaveDeBocaN10);
        caixa.usarFerramenta();
        caixa.guardarFerramenta();

    }
}