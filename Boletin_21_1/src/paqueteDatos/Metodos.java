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
    int c; // Contador util para verificar si hay existencias en cada metodo
    
    public void añadir(ArrayList<Libro> lista){
        String titulo,autor,ISBN;
        // Inputs + validaciones
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
        if(numeroDeUnidades < 0 || precio < 0){ // Si es negativo
            System.out.println("\n\t[ error ] Valor numérico no puede ser negativo.");
        }else{ // Si todo esta bien añado libro
            lista.add(new Libro(titulo,autor,ISBN,precio,numeroDeUnidades));
            System.out.println("\n\t[ info ] Libro añadido correctamente.");
        }
    }
    
    public void vender(ArrayList<Libro> lista){
        c = 0;
        System.out.print("\t- Introduzca el ISBN del libro: ");
        String ISBN = leer.next();
        Libro li;
        Iterator<Libro> it = lista.iterator();
        while(it.hasNext()){
            li = (Libro)it.next();
            if(ISBN.equalsIgnoreCase(li.getISBN())){ // Si existe libro
                c++; // Hacemos constar que existe
                if(li.getNumeroDeUnidades() > 0){ // Si hay unidades
                    li.setNumeroDeUnidades(li.getNumeroDeUnidades() - 1);
                    System.out.println("\n\t[ info ] Se ha vendido '" + li.getTitulo() + "' satisfactoriamente.");
                }else{ // Avisamos que no hay stock
                    System.out.println("\n\t[ aviso ] '" + li.getTitulo() + "' no dispone de unidades para vender.");
                }
            }
        }
        if(c == 0){ // Avisamos que no existe el libro
            System.out.println("\n\t[ aviso ] No existen libros para vender.");
        }
    }
    
    public void mostrar(ArrayList<Libro> lista){
        c = 0;
        for(Libro i : lista){ // Recorro facilmente con un foreach
            c++;
            System.out.print(i); // Imprimo en cada iteracion
        }
        if(c == 0){
            System.out.println("\n\t[ info ] No existen libros para mostrar.");
        }
    }
    
    // Para borrar elementos con Iterator se recomienda usar su metodo en vez de llamar al del array porque sino saltaria una excepcion llamada ' java.util.ConcurrentModificationException '
    // Dicha excepcion tiene lugar ya que se esta tratando de borrar un elemento mientras se itera y existe una concurrencia no controlada. Más info en: https://ide.geeksforgeeks.org/uP1Tc5
    public void baja(ArrayList<Libro> lista){
        c = 0;
        Libro li;
        Iterator<Libro> it = lista.iterator();
        while(it.hasNext()){
            li = (Libro)it.next();
            if(li.getNumeroDeUnidades() == 0){
                c ++;
                it.remove();
                System.out.println("\n\t[ info ] Se ha dado de baja '" + li.getTitulo() + "' satisfactoriamente.");
            }
        }
        if(c == 0){
            System.out.println("\n\t[ aviso ] No existen libros para dar de baja.");
        }
    }
    
    public void consultar(ArrayList<Libro> lista){
        c = 0;
        System.out.print("\t- Introduzca el ISBN del libro: ");
        String ISBN = leer.next();
        Libro li;
        Iterator<Libro> it = lista.iterator();
        while(it.hasNext()){
            li = (Libro)it.next();
            if(li.getISBN().equalsIgnoreCase(ISBN)){
                c++;
                System.out.println(li.toString());
            }
        }
        if(c == 0){
            System.out.println("\n\t[ aviso ] No existen libros para consultar.");
        }
    }
}