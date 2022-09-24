package proyectocalculadora;

import java.util.ArrayList;

/**
 *
 * @author pacot
 */

public class MetodosImportantes {
   
   //  metodo  ConvertirPostFijaInfija {
    public static boolean esOperando (String letra){
        boolean res= true;
        
        if (letra.contains("+") || letra.contains("-") || letra.contains("*") || letra.contains("/") || letra.contains("^") ){
            res = false;
        }
        
        return res;
    }
    
    //
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
 
    //De infija a postfija
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
    
     public static boolean esNumeroNaturalOPunto(char elemento){
        boolean res = false;
        
        if ( elemento == '0' || elemento == '1' || elemento == '2' || elemento == '3' || elemento == '4' || elemento =='5' || elemento == '6' || elemento == '7'|| elemento == '8' || elemento == '9' || elemento == '.'){
            res = true;        
        }
        return res;
    }
    
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
