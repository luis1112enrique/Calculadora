
import java.util.ArrayList;

/**
 *
 * @author luis1_0l42vo6
 */
public class  PilaA <T> implements PilasADT <T> {
    private T[] pila;
    private int tope;
    private final int MAXIMO = 20;
    
    public PilaA (){ // NEGATIVO PARA SABER QUE ESTA VACIA
        pila = (T[]) new Object [MAXIMO];
        tope = -1; // INDICA QUE LA PILA ESTA VACIA    
    }
    
    public PilaA (int max){  //CREADA SABIENDO CUAL SERA SU MAXIMA CAPACIDAD
        pila = (T[]) new Object [max];
        tope = -1;
    }
    
    public boolean isEmpty (){  //¿ESTA VACIA? LO SABEMOS SI EL TOPE ES IGUAL A -1
        return tope == -1;
    }
    
    public void push (T dato){ // En caso de que ya no quepa se crea uno mas grande y asignamos la direccion al mas grande
        if (tope == pila.length-1){ //La pila esta llena
            expande();
        } 
        tope++;
        pila[tope]=dato;
    }
    
    private void expande (){
        T [] masGrande =  (T[]) new  Object[pila.length *2];
        
        for (int i = 0; i <= tope; i++) { // O bien: i<pila.length
            masGrande [i] = pila[i]; //Si solo ponemos i< tope faltara por pasar un elemento
        }
        pila = masGrande; // ASIGNACION
    }
    
    public T pop (){
        T resultado;
        
        if (this.isEmpty()){
            throw new ExcepcionColeccionVacia ("Error la pila esta vacia");
        }
        resultado = pila[tope]; //Regresamos lo que sacamos
        pila[tope] = null;   // En su luhgar ponemos null
        tope --;  //Disminuimos el tope (contador)4
        return resultado;     
    }
    
    public T peek (){
        if ( this.isEmpty()){
            throw new ExcepcionColeccionVacia ("Error: la pila esta vacia");
        }
        return pila[tope];
    }
    
    public void multiPop (int n){
        if (tope+1 >= n && n>= 0){
            for (int i = 0; i < n; i++) {  // T LIMITA EL TIPO DE CLASE , OBJECT SIEMPRE ES OBJECT
                this.pop();
            }
        }
    }
    
    public String toString (){
        StringBuilder cad = new StringBuilder ();
        ArrayList <T> lista = new ArrayList <T>();
        
        while (!isEmpty()){
            lista.add(pop());
        }
        for (int i = 0; i< lista.size(); i++) {
            cad.append("\n \t"+lista.get(i));
        }
        return cad.toString();        
    }
    
}
