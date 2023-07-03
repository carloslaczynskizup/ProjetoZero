package a11_classes_com_herança19062023.src;

//A classe Professores herda/estende a classe abstrata de TodosFuncionarios.
//Tem os atributos nome e matricula. e o atributo específico qtdEstagiarios que o professor supervisiona.
//
public class Professores extends TodosFuncionarios {

    private String nivelGraduacao;
    private String disciplinaAplicada;
    private int qtdAlunos;
    private int qtdTurmas;
    private int qtdEstagiarios;


    public Professores(String nome, String cpf, String numRegistro, String lotacao, double salario, String nivelGraduacao, String disciplinaAplicada, int qtdAlunos, int qtdTurmas, int qtdEstagiarios) {
        super(nome, cpf, numRegistro, lotacao, salario);
        this.nivelGraduacao = nivelGraduacao;
        this.disciplinaAplicada = disciplinaAplicada;
        this.qtdAlunos = qtdAlunos;
        this.qtdTurmas = qtdTurmas;
        this.qtdEstagiarios = qtdEstagiarios;
    }

    @Override
    public void reembolsar(double valor) {
        System.out.println("Reembolsar despesas Professores(as): " + ": R$ " + valor);

    }

    @Override
    public void reajusteSalario() {
        //   setSalario(getSalario() * 1.1);
        //aumentar salario em 10% para professores(as)
        //setSalario é uma expressão usada para definir um novo valor para o atributo salario
        //getSalario é uma expressão usada para obter o valor do atributo salario atual.

    }

}
