package proyectocalculadora;

/**
 * Integrantes del equipo de desarrollo:
 *   · Luis Enrique Hernández Torres
 *   · Francisco Ríos Rodríguez
 *   · Emiliano Monroy Cruz
 *   · Paula de la Isla Ríos
 *   · Carlos Huerta Varela
 * 
 * Fecha [última modificación]:
 *   · 21 de septiembre 2022
 * 
 * Proyecto:
 *   · Calculadora básica
 * 
 * Descripción de la clase:
 *   · Esta interface sirve como la base para la creación de la estructura de
 *     datos: pilaA.
 */

public interface PilaADT <T>{
    
    public void push(T dato);
    public T pop();
    public boolean isEmpty();
    public T peek();
    
}
