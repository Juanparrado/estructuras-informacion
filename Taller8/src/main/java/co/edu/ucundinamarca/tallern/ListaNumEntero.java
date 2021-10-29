
package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;

/**
 *
 * @author Dell
 */
public class ListaNumEntero {    
    static Logger log = Logger.getLogger(ListaNumEntero.class.getName());    
    Nodo primero;
    Nodo ultimo;
    
    
    public   ListaNumEntero(){
        primero = null;
        ultimo = null;
    }
    
    
    public void ingresarNodo(int dato){
         Nodo nodonuevo = new Nodo();
         nodonuevo.dato = dato;
         
        if(primero == null){
            primero = nodonuevo;
            primero.siguiente = null;
            ultimo = primero;            
        }else{
            ultimo.siguiente = nodonuevo;
            nodonuevo.siguiente= null;
            ultimo = nodonuevo;
        }
        
        
    }
    
    public void verLista(){
        
        Nodo actual = new Nodo();
        actual = primero;
        while(actual != null);
        System.out.println(actual.dato);
        actual = actual.siguiente;
        //System.out.println(2);
    }
    
    
    }
    
    

