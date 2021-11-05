package taller7;

import javax.swing.JOptionPane;

public class Lista {

    Nodo primero;
    Nodo ultimo;

    public Lista() {
        primero= null;
        ultimo = null;

    }

    public void  ingresar(String Nombre, String Direccion, int t, int cedula,
            String nombreLibro) {
        Nodo nuevo = new Nodo(Nombre, Direccion, cedula, t, nombreLibro);
        nuevo.Nombre=Nombre;
        nuevo.direccion=Direccion;
        nuevo.cedula=cedula;
        nuevo.nombreLibro=nombreLibro;
        if(primero == null){
            primero=nuevo;
            primero.siguiente=primero;
            primero.anterior=ultimo;
            ultimo=nuevo;
        }else{
            ultimo.siguiente=nuevo;
            nuevo.siguiente=primero;
            ultimo=nuevo;
            primero.anterior=ultimo;
        }
        
        
    }
    
    //Metodo para mostrar la lista 
    public void mostrarLista() {
        
    }
}
