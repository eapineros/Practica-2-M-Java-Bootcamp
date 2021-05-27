package ejercicio3;

public class Libro {

    private String titulo;
    private String isbn;
    private String autor;

    //constructores
    public Libro(){

    }

    public Libro(String titulo, String isbn, String autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", isbn='" + isbn + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }

    public void prestamo(Libro libro){

    }

    public void devolucion(Libro libro){

    }

    //Getter y Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
