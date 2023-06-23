package a07_exercicios12062023.src.pessoa;

public class Pessoa {

    String nome;
    int idade;
    double peso;
    double altura;

    //Nesse caso, this.nome se refere ao atributo nome da instância atual da classe Pessoa,
    // enquanto nome (sem o this) se refere ao parâmetro local do construtor.
    //O uso do this é opcional nesse caso, mas é uma prática comum para deixar claro
    // que estamos referenciando o atributo da instância em vez do parâmetro local.
    // Ajuda a evitar ambiguidades e torna o código mais legível.
    public Pessoa(String nome, int idade, double peso, double altura){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;

    }


    public void cresce(double maisAltura){
        altura = altura + maisAltura;

    }

    public void emagrece(double perdePeso){
        peso = peso - perdePeso;
    }

    public void engorda(double aumentaPeso){
        peso = peso + aumentaPeso;

    }

    public void envelhece() {

        if (idade < 21) {
            cresce(0.5);

        }
        idade++;
    }

}
