package p2_o_aberto_fechado;

import java.util.ArrayList;
import java.util.List;

//A classe principal MainMedia é responsável por criar a lista de notas,
//instanciar a classe MediaAluno e calcular a média.
//Aqui pode-se adicionar e remover as notas da lista, sem precisar modificar a classe MediaAluno.
//Seguindo o (O)Princípio de Aberto/Fechado, adicionando/removando as notas sem precisar refatorar
// a lógica da classe MediaAluno.

public class MainMedia {
    public static void main(String[] args) {

        List<Double> notas = new ArrayList<>();

        notas.add(10.0);
        notas.add(8.0);
        notas.add(6.0);
        notas.add(7.0);

        MediaAluno mediaAluno = new MediaAluno(notas);
        double media = mediaAluno.calculaMedia();

        System.out.println("A média do Aluno é: " + media);
    }
}
