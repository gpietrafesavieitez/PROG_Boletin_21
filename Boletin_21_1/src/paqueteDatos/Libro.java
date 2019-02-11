/**
 * Gabriel P.
 * CPR Daniel Castelao
 * @author gpietrafesavieitez
 */

package paqueteDatos;

public class Libro implements Comparable {
    String titulo,autor,ISBN;
    double precio;
    int numeroDeUnidades;

    public Libro() {
    }

    public Libro(String titulo, String autor, String ISBN, double precio, int numeroDeUnidades) {
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
        return "\n\tTítulo: '" + titulo + "' \n\tAutor: '" + autor + "' \n\tISBN: '" + ISBN + "' \n\tPrecio: " + precio + "\n\tUnidades: " + numeroDeUnidades + "\n";
    }
    
    @Override
    public int compareTo(Object t){
        Libro l = (Libro)t; 
        if(this.titulo.compareToIgnoreCase(l.titulo) > 0){
            return 1;
        }else if(this.titulo.compareToIgnoreCase(l.titulo) < 0){
            return -1;
        }else{
            return 0;
        }
    } 
}