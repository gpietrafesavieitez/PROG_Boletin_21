/**
 * Gabriel P.
 * CPR Daniel Castelao
 * @author gpietrafesavieitez
 */

package paqueteDatos;

public class Libros {
    String titulo,autor,ISBN;
    double precio;
    int numeroDeUnidades;

    public Libros() {
    }

    public Libros(String titulo, String autor, String ISBN, double precio, int numeroDeUnidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.precio = precio;
        this.numeroDeUnidades = numeroDeUnidades;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumeroDeUnidades() {
        return numeroDeUnidades;
    }

    public void setNumeroDeUnidades(int numeroDeUnidades) {
        this.numeroDeUnidades = numeroDeUnidades;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + ", precio=" + precio + ", numeroDeUnidades=" + numeroDeUnidades + '}';
    }
}