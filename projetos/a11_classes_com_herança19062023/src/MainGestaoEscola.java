package a11_classes_com_herança19062023.src;

public class MainGestaoEscola {
    public static void main(String[] args) {

        //Aqui mostrará os dados dos funcionários por cargo.

        //Professores
        Professores professor = new Professores("Maria Clara", "123", "456", "789", 1000, "Graduado", "Matemática", 3, 3, 2);
        professor.reembolsar(1000);
        professor.reajusteSalario();
        System.out.println("Nome: " + professor.nome + "\nCPF: " + professor.cpf + "\nNúmero de Registro: " + professor.numRegistro + "\nLotação: " + professor.lotacao + "\nSalario: " + professor.salario);


    }
}
