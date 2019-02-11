/**
 * Gabriel P.
 * CPR Daniel Castelao
 * @author gpietrafesavieitez
 */

package paquetePrograma;

import paqueteDatos.Metodos;
import paqueteDatos.Libro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String key = null;
        ArrayList<Libro> listaLibros = new ArrayList<>();
        listaLibros.add(new Libro("HarryPotter","JKRowling","1111",32,2));
        listaLibros.add(new Libro("El Resplandor","Stephen King","2222",77,0));
        listaLibros.add(new Libro("Death Note","Chino","3333",884,8));
        listaLibros.add(new Libro("Konosuba","Japones","4444",1362,1));
        Metodos metodos = new Metodos();
        do{
            try{
                System.out.print("\n[ MENU PRINCIPAL ]\n\t1: Añadir\n\t2: Vender\n\t3: Mostrar\n\t4: Baja\n\t5: Consultar\n\t6: Salir\n\t$: ");
                key = leer.next();
                switch(key.toLowerCase()){
                    case "añadir":
                    case "1":
                        System.out.println("\n[ Añadir libros ]");
                        metodos.añadir(listaLibros);
                        break;
                    case "vender":
                    case "2":
                        System.out.println("\n[ Vender libros ]");
                        metodos.vender(listaLibros);
                        break;
                    case "mostrar":
                    case "3":
                        System.out.println("\n[ Mostrar libros ]");
                        ArrayList<Libro> listaLibrosOrdenada = listaLibros;
                        Collections.sort(listaLibrosOrdenada);
                        metodos.mostrar(listaLibrosOrdenada);
                        break;
                    case "baja":
                    case "4":
                        System.out.println("\n[ Dar de baja ]");
                        metodos.baja(listaLibros);
                        break;
                    case "consultar":
                    case "5":
                        System.out.println("\n[ Consultar libros ]");
                        metodos.consultar(listaLibros);
                        break;
                    case "salir":
                    case "6":
                        System.exit(0);
                    default:
                        System.out.println("\n\t[ error ] Porfavor, seleccione una opción válida.");
                }
            }catch(NullPointerException e1){
                System.out.println("\n\t[ error ] El valor no puede ser nulo.");
            }catch(NumberFormatException e2){
                System.out.println("\n\t[ error ] El formato introducido no es correcto.");
            }catch(Exception e){
                System.out.println("\n\t[ error ] Ha ocurrido un error inesperado." + e.toString());
            }
        }while(!key.equalsIgnoreCase("salir"));
    }
}