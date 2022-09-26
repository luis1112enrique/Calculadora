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
 *   · Esta clase modela una pila polimórfica.
 */

public class PilaA <T> implements PilaADT<T>{
    
    private T[] pila;
    private int tope;
    private final int MAXIMO = 20;
    
    public PilaA(){
        pila = (T[]) new Object[MAXIMO];
        tope = -1; // indica que la pila esta vacía
    }
    
    public PilaA(int max){
        pila = (T[]) new Object[max];
        tope = -1; // indica que la pila esta vacía
    }

    public void push(T dato) {
        if(tope == pila.length - 1) // indica que la pila está llena
            expande();
        tope++;
        pila[tope] = dato;
    }
    
    private void expande(){
        T[] masGrande = (T[]) new Object[pila.length * 2];
        
        for(int i = 0; i <= tope; i++)// o bien: i < pila.length
            masGrande[i] = pila[i];
        pila = masGrande;
        
    }

    @Override
    public T pop() {
        if(this.isEmpty())
            throw new ExcepcionColeccionVacia("Error: la pila está vacía");
        T resultado;
        resultado = pila[tope];
        pila[tope] = null;
        tope--;
        return resultado;
    }

    @Override
    public boolean isEmpty() {
        return tope == -1;
    }

    @Override
    public T peek() {
        if(this.isEmpty())
            throw new ExcepcionColeccionVacia("Error: la pila está vacía");
        return pila[tope];    
    }
    
}
