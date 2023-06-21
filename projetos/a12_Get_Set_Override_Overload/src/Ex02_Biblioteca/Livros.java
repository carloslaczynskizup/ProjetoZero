package a12_Get_Set_Override_Overload.src.Ex02_Biblioteca;

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
