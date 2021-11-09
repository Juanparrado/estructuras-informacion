package taller7;

public class Lista {

    Nodo primero;
    Nodo ultimo;
    String Nombre;
    String Direccion;
    int t,cedula;
    String nombreLibro;
    

    public Lista() {
        primero = null;
        ultimo = null;

    }

    public void ingresar(String Nombre, String Direccion, int cedula,
            String nombreLibro) {
        Nodo nuevo = new Nodo();
        nuevo.Nombre = Nombre;
        nuevo.direccion = Direccion;
        nuevo.cedula = cedula;
        nuevo.nombreLibro = nombreLibro;
        if (primero == null) {
            primero = nuevo;
            primero.siguiente = primero;
            primero.anterior = ultimo;
            ultimo = nuevo;
            t= t + 1;
        } else {
            ultimo.siguiente = nuevo;
            nuevo.siguiente = primero;
            ultimo = nuevo;
            primero.anterior = ultimo;
        }

    }

    //Metodo para mostrar la lista 
    public void Mostrar() {
        Nodo actual = new Nodo();
        actual = primero;
        do {
            System.out.println(actual.Nombre + "\n " + actual.direccion + " \n" +
                    actual.cedula + " \n" + actual.nombreLibro);
            actual = actual.siguiente;
        } while (actual != primero);
    }

  
}

		

		
		

		
	


