
package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;

/**
 *
 * @author Dell
 */
public class Juego {
    
     static Logger log = Logger.getLogger(Main.class.getName()); 
            
    /**
     *
     */
    public  int NumeroVidas;
    
    private int VidasIni = 5 ;
    
   
    
    

    public int getVidasIni() {
        return VidasIni;
    }

    public void setVidasIni(int VidasIni) {
        this.VidasIni = VidasIni;
    }
      
     public Juego (int NummeroVidas){
         this.NumeroVidas = NumeroVidas;
         
     }
          //get  and set 
    public int getNumeroVidas() {
        return NumeroVidas;
    }

    public void setNumeroVidas(int NumeroVidas)
    {
        this.NumeroVidas = NumeroVidas;
    }
     public Juego(){
         
     }

    void mostrarVidasr() {
        log.info("su numero de vidas :" + NumeroVidas);
    }
     
    void vidaInicial(){
        log.info("Vida inicial:"+ VidasIni);
    }

    void VidasInicial() {
        log.info("Numero de Vidas:"+NumeroVidas);
    }
    
     void QuitarVida(){         
        
        boolean vida=true;
        for (int i=NumeroVidas;i>=0;i--){
            if(i==0){
                log.info("Juego Terminado");
            }
            else{
                log.info(vida);
            }    
        }    
    
    }
    
}

