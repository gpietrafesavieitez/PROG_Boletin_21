/**
 * Gabriel P.
 * CPR Daniel Castelao
 * @author gpietrafesavieitez
 */

package paquetePrograma;

import paqueteDatos.Metodos;
import paqueteDatos.Libro;
import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String key = null;
        ArrayList<Libro> listaLibros = new ArrayList<>();
        listaLibros.add(new Libro("HarryPotter","JKRowling","39492151",32,2));
        listaLibros.add(new Libro("El Resplandor","Stephen King","39492152",77,0));
        listaLibros.add(new Libro("Death Note","Chino","39492153",884,8));
        listaLibros.add(new Libro("Konosuba","Japones","39492154",1362,1));
        listaLibros.add(new Libro("Sapote","Puto","39492155",9,5));
        Metodos metodos = new Metodos();
        do{
            try{
                System.out.print("\n[ MENU PRINCIPAL ]\n\t1: Añadir\n\t2: Vender\n\t3: Mostrar\n\t4: Baja\n\t5: Consultar\n\t6: Salir\n\t$: ");
                key = leer.next();
                switch(key.toLowerCase()){
                    case "añadir":
                        System.out.println("\n[ Añadir libros ]");
                        metodos.añadir(listaLibros);
                        break;
                    case "vender":
                        System.out.println("\n[ Vender libros ]");
                        metodos.vender(listaLibros);
                        break;
                    case "mostrar"://FALTA ORDENAR
                        System.out.println("\n[ Mostrar libros ]");
                        metodos.mostrar(listaLibros);
                        break;
                    case "baja":
                        System.out.println("\n[ Dar de baja ]");
                        metodos.baja(listaLibros);
                        break;
                    case "consultar":
                        System.out.println("\n[ Consultar libros ]");
                        //metodos.consultar();
                        System.out.println();
                        break;
                    case "salir":
                        System.exit(0);
                    default:
                        System.out.println("\n\t[ error ] Porfavor, seleccione una opción válida.");
                }
            }catch(NullPointerException e1){
                System.out.println("\n\t[ error ] No puede ser nulo.");
            }catch(NumberFormatException e2){
                System.out.println("\n\t[ error ] El formato introducido no es correcto.");
            }catch(Exception e){
                System.out.println("\n\t[ error ] ");
            }
        }while(!key.equalsIgnoreCase("salir"));
    }
}