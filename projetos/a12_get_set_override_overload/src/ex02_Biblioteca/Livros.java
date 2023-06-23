package a12_get_set_override_overload.src.ex02_Biblioteca;

//Elabore um sistema para biblioteca no qual a pessoa bibliotecária possa registrar
//pelo menos 3 tipos diferentes de gêneros de livros, o nome do livro, o ISBN e a
//pessoa autora do livro. Crie alguns livros exemplo e mostre em tela as informações
//de cada livro criado.

//Adicione também o método registrarLivro, onde seja possível registrar um livro
//apenas com o ISBN e deve mostrar em tela a mensagem “O livro foi registrado
//com o isbn [ISBN]”.

//Adicione também o método registrarLivro, onde seja possível registrar um livro
//apenas com o ISBN e o nome do livro e deve mostrar em tela a mensagem “O livro
//foi registrado com o isbn [ISBN] e o nome [NOME]”.

//Adicione também o método registrarLivro, onde seja possível registrar um livro
//apenas com o ISBN, nome do livro e o gênero e deve mostrar em tela a mensagem
// “O livro foi registrado com o isbn [ISBN], o nome [NOME] e o gênero [GENERO]”.

//Adicione também o método registrarLivro, onde seja possível registrar um livro com
//todos os atributos e deve mostrar em tela a mensagem “O livro foi registrado com todos os atributos”.

//Crie um objeto para cada método no método main.

public class Livros {

    String generoLivro;
    String nomeLivro;
    String autor;
    int isbn;

    public Livros(String generoLivro, String nomeLivro, String autor, int isbn) {

        this.generoLivro = generoLivro;
        this.nomeLivro = nomeLivro;
        this.autor = autor;
        this.isbn = isbn;
    }

    public void registrar1() {
        System.out.println("O livro foi registrado com o ISBN.");
    }

    public void registrar2() {
        System.out.println("O livro foi registrado com o ISBN e o nome.");
    }

    public void registrar3() {
        System.out.println("O livro foi registrado com o ISBN, o nome e o gênero.");

    }
    public void registrar4() {
        System.out.println("Todos os atributos do livro foram registrados.");
    }

    public String getGeneroLivro() {
        return generoLivro;
    }

    public void setGeneroLivro(String generoLivro) {
        this.generoLivro = generoLivro;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}
