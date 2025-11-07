public class Libro implements Imprimible {
    private String titulo;
    private String autor;
    private int isbn;
    private double precio;

    public Libro(String titulo, String autor, int isbn, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
    }

    @Override
    public void imprimir() {
        System.out.println("Titular: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Precio: " + this.precio);
    }
}
