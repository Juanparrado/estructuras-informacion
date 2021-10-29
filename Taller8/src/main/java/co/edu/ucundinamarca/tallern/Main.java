package co.edu.ucundinamarca.tallern;

import java.util.Scanner;
import org.apache.log4j.Logger;

/**
 * Clase Principal
 *
 * @author handresortiz
 */
public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ListaNumEntero lista = new ListaNumEntero();

       
        
        
        
        int opcion = 0;
        do {
            log.info("1. Ingresar un Nodo ");
            log.info("2. Mostrar la lista");
            log.info("4. Salir");
            log.info("Elija una Opcion");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    log.info("Ingrese un Nodo: ");
                    int dato = leer.nextInt();
                    lista.ingresarNodo(dato);
                    break;
                case 2:
                    log.info("Sulista es:");              
                    lista.verLista();
                    break;
            }

        } while (opcion != 4);

    }

}
