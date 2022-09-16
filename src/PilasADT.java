/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luis1_0l42vo6
 */
public interface PilasADT  <T> { //CLASE GENERICA
    public void push (T dato);
    public T pop ();
    public boolean isEmpty ();
    public T peek ();
    public void multiPop (int n);    
}
