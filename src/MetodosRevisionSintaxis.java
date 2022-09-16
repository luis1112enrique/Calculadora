/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luis1_0l42vo6
 */
public class MetodosRevisionSintaxis {
       public static  boolean revisarParentesis (String cadena){
        PilaA pila = new PilaA ();
        boolean res = true;
        char parAb =  '(';
        char parCe = ')';
       
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == parAb){
                pila.push(cadena.charAt(i));
            }
            else{
                if (cadena.charAt(i) == parCe){
                    if (! pila.isEmpty()){
                        pila.pop();
                    }
                    else{
                        res = false;
                    }
                }
            }
        }
        if (! pila.isEmpty() && (char)pila.pop() == parAb){
            res = false;
        }
        
        return res;
    }
    public static void main(String[] args) {
        String ejemplo1 = ("(Hola)");
        String ejemplo2 = ("((Hola)");
        String ejemplo3 = ("Como estas )))");
        String ejemplo4 = (")Hola((");
        String ejemplo5 = ("((Prueba");
        String ejemplo6 = ("((Hola como) estas)");
        String ejemplo7 = ("Hola");
        String ejemplo8 = (")Hola((Hola())");
        
        System.out.println(revisarParentesis (ejemplo1));
        System.out.println(revisarParentesis (ejemplo2));
        System.out.println(revisarParentesis (ejemplo3));
        System.out.println(revisarParentesis (ejemplo4));
        System.out.println(revisarParentesis (ejemplo5));
        System.out.println(revisarParentesis (ejemplo6));
        System.out.println(revisarParentesis (ejemplo7));
        System.out.println(revisarParentesis (ejemplo8));
        
    }
   
    
    
}
