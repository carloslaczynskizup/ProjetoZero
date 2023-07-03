package a11_classes_com_herança19062023.src;

//classe abstrata usada como classe base para todas as classes derivadas.
public abstract class TodosFuncionarios {
    String nome;
    String cpf;
    String numRegistro;
    String lotacao;
    double salario;


    // Construtor da classe abstrata com atributos nome e matricula. Para atribuir esses
    //valores aos atributos correspondentes da classe. Construtor é chamado sempre que uma classe
    //derivada de TodosFuncionarios é instanciada.
    public TodosFuncionarios(String nome, String cpf, String numRegistro, String lotacao, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.numRegistro = numRegistro;
        this.lotacao = lotacao;
        this.salario = salario;
    }

    public abstract void reembolsar(double valor);

    public abstract void reajusteSalario();

}
