
package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;

/**
 * Clase Principal
 * @author handresortiz
 */
public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        
        Juego jugador = new Juego();
        jugador.vidaInicial();
        jugador.setNumeroVidas(5-1);
        jugador.mostrarVidasr();
        Juego jugadores = new Juego();
        jugadores.vidaInicial();
        jugador.mostrarVidasr();
        jugadores.QuitarVida();
        
        
        
        
         
      
        

        //log.debug("Hello World : this is a debug message");
        //log.info("Hello World : this is an info message");

    }

}


