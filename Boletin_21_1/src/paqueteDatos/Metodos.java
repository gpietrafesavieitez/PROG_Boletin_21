/**
 * Gabriel P.
 * CPR Daniel Castelao
 * @author gpietrafesavieitez
 */

package paqueteDatos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Metodos {
    Scanner leer = new Scanner(System.in);
    
    public void añadir(ArrayList<Libro> lista){
        String titulo,autor,ISBN;
        System.out.print("\t- Introduzca el título del libro: ");
        titulo = leer.next();
        System.out.print("\t- Introduzca el autor del libro: ");
        autor = leer.next();
        System.out.print("\t- Introduzca el ISBN del libro: ");
        ISBN = leer.next();
        System.out.print("\t- Introduzca el precio (€) del libro: ");
        double precio = Double.parseDouble(leer.next());
        System.out.print("\t- Introduzca el número de unidades del libro: ");
        int numeroDeUnidades = Integer.parseInt(leer.next());
        lista.add(new Libro(titulo,autor,ISBN,precio,numeroDeUnidades));
    }
    
    public void vender(ArrayList<Libro> lista){
        int c = 0;
        System.out.print("\t- Introduzca el ISBN del libro: ");
        String ISBN = leer.next();
        Libro li = new Libro();
        Iterator<Libro> recorrer = lista.iterator();
        while(recorrer.hasNext()){
            li = (Libro)recorrer.next();
            if(ISBN.equalsIgnoreCase(li.getISBN())){
                c++;
                lista.remove(li);
            }//EXCEPCION NO CONTROLADA
        }
        if(c <= 0){
            System.out.println("\n\t[ error ] No existen libros para vender.");
        }
    }
    
    public void mostrar(ArrayList<Libro> lista){
        int c = 0;
        for(Libro i : lista){
            c++;
            System.out.print(i);
        }
        if(c <= 0){
            System.out.println("\t[ info ] No existen libros para mostrar.");
        }
    }
    
    public void baja(ArrayList<Libro> lista){
        int c = 0;
        Libro li = new Libro();
        Iterator<Libro> recorrer = lista.iterator();
        while(recorrer.hasNext()){
            li = (Libro)recorrer.next();
            if(li.getNumeroDeUnidades() <= 0){
                c ++;
                System.out.println("\t[ info ] ' " + li.getTitulo() + " ' dado de baja correctamente.");
            }
        }
        if(c <= 0){
            System.out.println("\t[ info ] No existen libros para dar de baja.");
        }
    }
}