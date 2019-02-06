/**
 * Gabriel P.
 * CPR Daniel Castelao
 * @author gpietrafesavieitez
 */

package paquetePrograma;

import paqueteDatos.Metodos;
import paqueteDatos.Libros;
import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion {
    
    public static void menuAplicacion(){
        System.out.println("");
            for(int i = 0; i < 25; i ++){
                System.out.print("*");
            }
            System.out.println("\n*\t-> Añadir\t*\n*\t-> Vender\t*\n*\t-> Mostrar\t*\n*\t-> Baja\t\t*\n*\t-> Consultar\t*\n*\t-> Salir\t*");
            for(int i = 0; i < 25; i ++){
                System.out.print("*");
            }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        ArrayList<Libros> listaLibros = new ArrayList<>();
        Metodos metodos = new Metodos();
        Scanner leer = new Scanner(System.in);
        String opcion = "";
        System.out.println("Bienvenido a la librería, elige una opción:");
        do{
            menuAplicacion();
            System.out.print("\n[>]\t:");
            opcion = leer.next();
            switch(opcion.toLowerCase()){
                case "añadir":
                    System.out.println("Añadido");
                    break;
                case "vender":
                    System.out.println("Vendido");
                    break;
                case "mostrar":
                    System.out.println("Mostrado");
                    break;
                case "baja":
                    System.out.println("Dado de baja");
                    break;
                case "consultar":
                    System.out.println("Consultado");
                    break;
                case "salir":
                    System.out.println("[*]\tHasta luego! :)");
                    System.exit(0);
                default:
                    System.out.println("[!]\tNo existe esa opción.");
            }
        }while(!opcion.equalsIgnoreCase("salir"));
    }

}
