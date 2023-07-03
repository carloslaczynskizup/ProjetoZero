package a15_L7_L8_POO_SOLID_29062023.l7_paises;

import java.util.ArrayList;
import java.util.List;

//Classe que representa a Europa Central
public class EuropaCentral extends Pais {
    private List<Pais> paisesVizinhos;

    public EuropaCentral(String iso, String nome, double populacao, double dimensao) {
        super(iso, nome, populacao, dimensao);
        this.paisesVizinhos = new ArrayList<>();
    }

    public void addVizinho(Pais paisVizinho) {
        paisesVizinhos.add(paisVizinho);

    }

    public String ehVizinho(Pais outroVizinho) {
        return ("Sim!");
    }

    @Override
    public List<Pais> getVizinhos() {
        return paisesVizinhos;
    }

    //Método para obter vizinhos comuns aos dois países.
    public List<Pais> getVizinhosEmComum(Pais outroVizinho) {
        List<Pais> vizinhosComuns = new ArrayList<>();

        for (Pais vizinho : paisesVizinhos) {
            if (paisesVizinhos.contains(vizinho)) {
                vizinhosComuns.add(vizinho);
            }
        }
        return vizinhosComuns;

    }

}