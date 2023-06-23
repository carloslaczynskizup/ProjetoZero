package a12_get_set_override_overload.src.ex02_Biblioteca;

public class MainLivraria {
    public static void main(String[] args) {

        Livros livro1 = new Livros("Ficção", "Harry Potter", "J.K. Rowling", 123456789);
        livro1.registrar1();
        System.out.println("Registro do ISBN: " + livro1.getIsbn());
        System.out.println();

        Livros livro2 = new Livros("Romance", "Shirley Jackson", "George R. R. Martin", 987654321);
        livro2.registrar2();
        System.out.println("Registro do ISBN: " + livro2.getIsbn() + " e o Nome: " + livro2.getNomeLivro());
        System.out.println();

        Livros livro3 = new Livros("Fantasia", "George Orwell", "George Orwell", 123456789);
        livro3.registrar3();
        System.out.println("Registro do ISBN: " + livro3.getIsbn() + " - Nome: " + livro3.getNomeLivro() + " - e o Gênero: " + livro3.getGeneroLivro());
        System.out.println();

        Livros livro4 = new Livros("Ficção", "H. P. Lovecraft", "H. P. Lovecraft", 987654321);
        livro4.registrar4();
        System.out.println("Registro do ISBN: " + livro4.getIsbn() + " - Nome: " + livro4.getNomeLivro() + " - Gênero: " + livro4.getGeneroLivro() + " e o Autor: " + livro4.getAutor());
        System.out.println();


    }
}
