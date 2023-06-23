package a07_exercicios12062023.src.bola;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MainBola {
    public static void main(String[] args) {

        //instanciando o objeto da classe Bola e atrinuindo variáveis bolaTipo 1 e bolaTipo2
        //tipo1 e Tipo2 são instâncias diferentes para a classe Bola
        //sendo que têm as próprias características de atributos.
       Bola bolaTipo1 = new Bola();
       bolaTipo1.cor = "Branca/Amarela";
       bolaTipo1.marca = "Penalty";
       bolaTipo1.material = "Couro Sintético";
       bolaTipo1.peso = 450.0;
       bolaTipo1.circunferencia = 70.0;

       Bola bolaTipo2 = new Bola();
       bolaTipo2.cor = "Verde/Amarela";
       bolaTipo2.marca = "Topper";
       bolaTipo2.material = "Couro Sintético";
       bolaTipo2.peso = 410.0;
       bolaTipo2.circunferencia = 65.0;

       //testar os métodos para a saída de trocarCor e mostrarCor

        System.out.println("A cor da Bola Modelo 1 é: " + bolaTipo1.mostrarCor());
        System.out.println("A marca da Bola Modelo 1 é: " + bolaTipo1.marca);
        bolaTipo1.trocarCor("Vermelha/Branca");
        System.out.println("A nova cor da Bola Modelo 1 é: " + bolaTipo1.mostrarCor());
        System.out.println();
        System.out.println("A cor da Bola Modelo 2 é: " + bolaTipo2.mostrarCor());
        System.out.println("A marca da Bola Modelo 1 é: " + bolaTipo2.marca);
        bolaTipo2.trocarCor("Branca");
        System.out.println("A nova cor da Bola Modelo 2 é: " + bolaTipo2.mostrarCor());
        System.out.println();
        System.out.println("Fim dos testes de Métodos.");

        }
    }
