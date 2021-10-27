
package co.edu.ucundinamarca.tallern;

/**
 *
 * @author Dell
 */
public class NodoCola {
    int elemento;
    NodoCola siguiente;
    
    public NodoCola(int x){
        elemento = x;
        siguiente = null;
    }
}
 
//declararcion de la clase Colalista
class ColaLista{
    
    protected NodoCola frente;
    protected NodoCola fin;
    
    public ColaLista(){
        frente = fin = null;
    }
    
    public void insertar(int elemento){
        NodoCola a;
         a = new NodoCola(elemento);
         if(colaVacia()){
             frente = a;
         }else{
             fin.siguiente = a;
         }
         fin = a;
    }
     
    public int quitar(){
        int aux;
        if(!colaVacia()){
            aux = frente.elemento;
            frente = frente.siguiente;
        }else{
            return -1;
        }
        return aux;
    } 
    public void borrarCola(){
        while(frente != null){
            frente = frente.siguiente;
        }
    }
    
    public boolean colaVacia(){
      if(frente==null){
          return true;
      } else{
          return false;
      } 
    }
    
 }