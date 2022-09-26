import java.util.ArrayList;

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
 *   · Metodos importantes que son auxiliares para el funcionamiento de la calculadora
 */

public class MetodosImportantes {
   /**
    * evalúa si la cadena es un signo de operación y regresa un true o false dependiendo si lo es o no
    * @param letra
    * @return boolean, true si es algo distinto a un signo
    */
    public static boolean esOperando (String letra){
        boolean res= true;
        
        if (letra.contains("+") || letra.contains("-") || letra.contains("*") || letra.contains("/") || letra.contains("^") ){
            res = false;
        }
        
        return res;
    }
    /**
     * jerarquiza las operaciones, en un switch lee el signo y decide su importancia con relación a los otros signos
     * @param operador
     * @return int, regresa el numero de prioridad de dicha operacion 
     */
    public static int prioridadOperaciones (String operador){
        int valor = 0;
        
        switch (operador){
            case "+": valor = 1;
                break;
            case "-": valor = 1;
                break;
            case "*": valor = 2;
                break;
            case "/":valor = 2;
                break;
            case "^": valor = 3;
                break;
        }
        return valor;       
    }
    /**
     * Revisa inicialmente que haya un parentesis izquierdo, si lo hay, se guarda en una pila y hasta encontrar al parentesis derecho se sale, guardando los números que estaban entre éstos. 
     * @param cadenaOperacion
     * @return ArrayList, convierte la expresion que recibio en infija convertida a postfija
     */
    public static ArrayList <String> convierteInfijaAPostfija(ArrayList <String> cadenaOperacion){
        PilaA  pilaAux = new PilaA ();
        String parIzq = "(";
        String parDer = ")";
        ArrayList<String> expPostFija = new ArrayList <String> ();
              
        for (int i = 0; i < cadenaOperacion.size(); i++) {
            if(cadenaOperacion.get(i).equals (parIzq)){
               pilaAux.push(cadenaOperacion.get(i));               
            }
            else{
                if (cadenaOperacion.get(i).equals(parDer)) {
                    while(!pilaAux.peek().equals (parIzq)){
                        expPostFija.add((String)pilaAux.pop());
                    }
                    pilaAux.pop();
                }
                else{
                    if (esOperando(cadenaOperacion.get(i))){
                        expPostFija.add(cadenaOperacion.get(i));
                    }
                    else{
                        while (!pilaAux.isEmpty() && prioridadOperaciones(cadenaOperacion.get(i)) <= prioridadOperaciones ((String)pilaAux.peek()) ){
                            expPostFija.add((String)pilaAux.pop());
                        }
                        pilaAux.push(cadenaOperacion.get(i));
                    }
                }             
            }
        }
        while (!pilaAux.isEmpty()){
            expPostFija.add((String)pilaAux.pop());
        }
        return expPostFija;
    }
    /**
     * recibe un char, el cuál evalúa y si es un número entre el 0 y el 9, o punto decimal, regresa true, de lo contrario regresa false.
     * @param elemento
     * @return boolean, si el elemento es un numero natural o un punto, es true, de lo contrario es false
     */
    public static boolean esNumeroNaturalOPunto(char elemento){
        boolean res = false;
        
        if ( elemento == '0' || elemento == '1' || elemento == '2' || elemento == '3' || elemento == '4' || elemento =='5' || elemento == '6' || elemento == '7'|| elemento == '8' || elemento == '9' || elemento == '.'){
            res = true;        
        }
        return res;
    }
    /**
     * va leyendo cada char de un string para saber si es numero o simbolo y los guarda en un ArrayList o una pila respectivamente. 
     * @param cadena
     * @return ArrayList, recibe tal cual la informacion que recibe, pero cada caracter es un elemento del arraylist
     */
    public static ArrayList <String> obtieneTokens (String cadena){
        ArrayList <String> guardaElementos = new ArrayList <String>();
        int indice= 0;
        PilaA <String>pilaAux  = new PilaA <String> ();
        String numStr;
        String charComp;
        String elementosRestantes;
        
        for( int i = cadena.length()-1 ; i >= 0 ; i--){
            if (! esNumeroNaturalOPunto(cadena.charAt(i))){
                pilaAux.push(""+cadena.charAt(i));
            }
        }
        try{
            while (indice < cadena.length()){
                charComp = ""+cadena.charAt(indice);
                if(charComp .equals(pilaAux.peek())  ){
                    guardaElementos.add(pilaAux.pop());
                    indice ++;
                }
                else{
                    numStr = "";
                    while (!charComp .equals(pilaAux.peek())){
                        numStr += cadena.charAt(indice);
                        indice++;
                        charComp = ""+cadena.charAt(indice);
                    }
                    guardaElementos.add(numStr);
                }
            }
        }
        catch(ExcepcionColeccionVacia ecv){
            if (indice < cadena.length()){
                elementosRestantes= cadena.substring(indice, cadena.length());
                guardaElementos.add(elementosRestantes);
            }
        }
        return guardaElementos;
        
    }
    
    
    
    
}