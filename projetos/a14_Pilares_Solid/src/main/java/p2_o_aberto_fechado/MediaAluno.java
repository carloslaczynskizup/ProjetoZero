package p2_o_aberto_fechado;

import java.util.List;

//Esta classe é responsável por realizar os cálculos da média das noats de um aluno.
//Recebendo notas em uma lista através de um construtor e um método chamado calculaMedia.

public class MediaAluno {
    private List<Double> notas;

    public MediaAluno(List<Double> notas) {
        this.notas = notas;
    }
    public double calculaMedia() {
        double soma = 0;
        for (Double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }
}
