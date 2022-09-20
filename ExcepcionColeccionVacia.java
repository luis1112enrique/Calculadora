package proyectocalculadora;

/**
 *
 * @author pacot
 */

public class ExcepcionColeccionVacia extends RuntimeException{
    
    public ExcepcionColeccionVacia (){
        
    }
    
    public ExcepcionColeccionVacia (String message){
        super (message);
    }
    
    
}
