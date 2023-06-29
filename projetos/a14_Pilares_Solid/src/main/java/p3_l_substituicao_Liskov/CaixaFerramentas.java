package p3_l_substituicao_Liskov;

import java.util.ArrayList;
import java.util.List;

//Classe representando uma Caixa de Ferramentas.

public class CaixaFerramentas {
    private List<Ferramenta> ferramentas;

    public CaixaFerramentas(){
        ferramentas = new ArrayList<>();
    }

    public void addFerramenta(Ferramenta ferramenta){
        ferramentas.add(ferramenta);
    }

    public void usarFerramenta(){
        for(Ferramenta ferramenta : ferramentas){
            ferramenta.usar();
        }

    }
    public void guardarFerramenta(){
        for(Ferramenta ferramenta : ferramentas){
            ferramenta.guardar();
        }
    }
}
