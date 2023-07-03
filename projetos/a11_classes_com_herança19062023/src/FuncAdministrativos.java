package a11_classes_com_herança19062023.src;

public class FuncAdministrativos extends TodosFuncionarios {

    private String funcaoAdm;
    private String senior;

    public FuncAdministrativos(String nome, String cpf, String numRegistro, String lotacao, double salario, String funcaoAdm, String senior) {
        super(nome, cpf, numRegistro, lotacao, salario);
        this.funcaoAdm = funcaoAdm;
        this.senior = senior;
    }

    @Override
    public void reembolsar(double valor) {
        System.out.println("Reembolsar despesas Funcionários Administrativos: " + ": R$ " + String.format("%,.2f") + valor);
    }

    @Override
    public void reajusteSalario() {
        //setSalario(getSalario() * 1.1);
        //aumentar salario em 10% para funcionários administrativos
        //setSalario é uma expressão usada para definir um novo valor para o atributo salario
        //getSalario é uma expressão usada para obter o valor do atributo salario atual.
    }

}
