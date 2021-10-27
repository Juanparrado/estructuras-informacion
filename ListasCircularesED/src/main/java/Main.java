
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class Main {

    public static void main(String[] args) {
        ListasCircularesED listita = new ListasCircularesED();
        int opcion = 0, elemento;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.Agregar un nodo a la lista circular\n"
                        + "2.Eliminar un Nodo de la lista ciruclar\n"
                        + "3.Mostrar los datos de la lista circular\n"
                        + "4.salir\n"
                        + "Que desea hacer", "Menu de ocpiones",
                        JOptionPane.INFORMATION_MESSAGE));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "ingrese el elemento del nodo", "agregando a la lista circular",
                                JOptionPane.INFORMATION_MESSAGE));
                        listita.insertar(elemento);
                        break;
                    case 2:
                         //elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                           //     "ingrese el elemento del nodo", "agregando a la lista circular",
                             //   JOptionPane.INFORMATION_MESSAGE));
                        break;
                    case 3:
                        if(!listita.estaVacia()){
                            listita.mostrarLista();
                        }else{
                            JOptionPane.showMessageDialog(null, "aun no hya nodos",
                                    "lista vacia",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                        
                        default:
                            JOptionPane.showMessageDialog(null, "la opcionno esta en el menu",
                                    "incorrecto", JOptionPane.INFORMATION_MESSAGE );

                }
            }catch (NumberFormatException n ){
                JOptionPane.showMessageDialog(null, "Error" +n.getMessage());
            }
        } while(opcion != 4);
      
          
    }
}
