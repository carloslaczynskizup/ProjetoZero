package a11_classes_com_herança19062023.src;

public abstract class Estagios extends TodosFuncionarios {
    private Professores vinculado;
    private double bolsaEstagio;

    public Estagios(String nome, String cpf, String numRegistro, String lotacao, Professores vinculado) {
        super(nome, cpf, numRegistro, lotacao, 0);
        this.bolsaEstagio = bolsaEstagio;
        this.vinculado = vinculado;

    }

    public void reembolsar(double valor) {
        System.out.println("Reembolsar despesas Estágios: " + ": R$ " + String.format("%,.2f") + valor);

    }
}
