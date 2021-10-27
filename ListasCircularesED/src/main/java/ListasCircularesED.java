
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dell
 */
public class ListasCircularesED {

    Nodo ultimo;

    public ListasCircularesED() {
        ultimo = null;
    }

    //Metodo para saber cuando la lista esta vacia 
    public boolean estaVacia() {
        return ultimo == null;
    }

    //Metodo para insertar nodos
    public ListasCircularesED insertar(int elemento) {
        Nodo nuevo = new Nodo(elemento);
        if (ultimo != null) {
            nuevo.siguiente = ultimo.siguiente;
            ultimo.siguiente = nuevo;
        }
        ultimo = nuevo;
        return this;
    }

    //Metodo para mostrar la lista 
    public void mostrarLista() {
        Nodo auxiliar = ultimo.siguiente;
        String cadena = "";
        do {
            cadena = cadena + "Silla" + auxiliar.dato + "]->";
            auxiliar=auxiliar.siguiente;
        } while (auxiliar != ultimo.siguiente);
        JOptionPane.showMessageDialog(null, cadena,
                "Mostrando la lista circular", JOptionPane.INFORMATION_MESSAGE);
    }
}
