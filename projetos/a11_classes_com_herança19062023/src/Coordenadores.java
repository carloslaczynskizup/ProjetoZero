package a11_classes_com_herança19062023.src;

import java.util.ArrayList;

public class Coordenadores extends TodosFuncionarios {
    private ArrayList<Professores> professoresSupervisao;


    public Coordenadores(String nome, String cpf, String numRegistro, String lotacao, double salario, int professoresSupervisao) {
        super(nome, cpf, numRegistro, lotacao, salario);
        this.professoresSupervisao = new ArrayList<>();
    }

    @Override
    public void reembolsar(double valor) {
        System.out.println("Reembolsar despesas Coordenadores(as): " + ": R$ " + String.format("%,.2f") + valor);
    }

    @Override
    public void reajusteSalario() {
        //  setSalario(getSalario() * 1.05);
        //aumentar salario em 5% para coordenadores(as)
        //setSalario é uma expressão usada para definir um novo valor para o atributo salario
        //getSalario é uma expressão usada para obter o valor do atributo salario atual.
    }

    public void adicionarProfessoresSupervisao(Professores professoresSupervisao) {
        this.professoresSupervisao.add(professoresSupervisao);
    }

}
