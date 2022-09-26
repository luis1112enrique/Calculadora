
/**
 * Integrantes del equipo de desarrollo:
 *   · Luis Enrique Hernández Torres
 *   · Francisco Ríos Rodríguez
 *   · Emiliano Monroy Cruz
 *   · Paula de la Isla Reyes
 *   · Carlos Huerta Varela
 * 
 * Fecha [última modificación]:
 *   · 21 de septiembre 2022
 * 
 * Proyecto:
 *   · Calculadora básica
 * 
 * Descripción de la clase:
 *   · Excepcion por si la pila esta vacia
 */
public class ExcepcionColeccionVacia extends RuntimeException{
    
    public ExcepcionColeccionVacia (){
        
    }
    
    public ExcepcionColeccionVacia (String message){
        super (message);
    }
    
    
}