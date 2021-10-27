package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;

/**
 * Clase Principal
 *
 * @author handresortiz
 */
public class Main {

    public static void pila() {
        PilaLista pila = new PilaLista();
        pila.insertar(1);
        pila.insertar(2);
        pila.insertar(3);
        pila.insertar(4);
        pila.insertar(5);

        System.out.println("Pila" + pila.quitar());
        System.out.println("Pila" + pila.quitar());
        System.out.println("Pila" + pila.quitar());
        System.out.println("Pila" + pila.quitar());
        System.out.println("Pila" + pila.quitar());
        System.out.println("Pila" + pila.quitar());

    }
    
    public static void cola(){
        ColaLista cola = new ColaLista();
        
        cola.insertar(1);
        cola.insertar(2);
        cola.insertar(3);
        cola.insertar(4);
        cola.insertar(5);
        
        System.out.println("Cola" + cola.quitar());
        System.out.println("Cola" + cola.quitar());
        System.out.println("Cola" + cola.quitar());
        System.out.println("Cola" + cola.quitar());
        System.out.println("Cola" + cola.quitar());
        
        
        
        
        
    }

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        pila();
        cola();
    }

}
