
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luis1_0l42vo6
 */
public class ConvertirPostFijaInfija {
    public static boolean esOperando (String letra){
        boolean res= true;
        
        if (letra.contains("+") || letra.contains("-") || letra.contains("*") || letra.contains("/") || letra.contains("^") ){
            res = false;
        }
        return res;
    }
    
    
    
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
 
    
    public static ArrayList <String> convierteInfijaApostfija(ArrayList <String> cadenaOperacion){
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
    
    public static void main(String[] args) {
        ArrayList<String> ejemplo = new ArrayList <String> ();
        ArrayList<String> ejemplo1 = new ArrayList <String> ();
        ArrayList<String> ejemplo2 = new ArrayList <String> ();
        ArrayList<String> ejemplo3 = new ArrayList <String> ();
        ArrayList<String> ejemplo4 = new ArrayList <String> ();
        
        ejemplo.add("1.5");
        ejemplo.add("+");
        ejemplo.add("7");
        ejemplo.add("*");
        ejemplo.add("(");
        ejemplo.add("5");
        ejemplo.add("+");
        ejemplo.add("1");
        ejemplo.add(")");
        ejemplo.add("-");
        ejemplo.add("10");
        ejemplo1.add("a");
        ejemplo1.add("*");
        ejemplo1.add("b");
        ejemplo1.add("-");
        ejemplo1.add("c");
        ejemplo1.add("+");
        ejemplo1.add("d");
        ejemplo1.add("/");
        ejemplo1.add("e");
        ejemplo2.add("a");
        ejemplo2.add("+");
        ejemplo2.add("b");
        ejemplo3.add("a");
        ejemplo3.add("+");
        ejemplo3.add("b");
        ejemplo3.add("*");
        ejemplo3.add("c");
        ejemplo4.add("(");
        ejemplo4.add("a");
        ejemplo4.add("+");
        ejemplo4.add("b");
        ejemplo4.add(")");
        ejemplo4.add("*");
        ejemplo4.add("c");
        
        
        //System.out.println(ConvertirPostFijaInfija.convierteInfijaApostfija(ejemplo));
        System.out.println(ConvertirPostFijaInfija.convierteInfijaApostfija(ejemplo1));
        System.out.println(ConvertirPostFijaInfija.convierteInfijaApostfija(ejemplo2));
        System.out.println(ConvertirPostFijaInfija.convierteInfijaApostfija(ejemplo3));
        System.out.println(ConvertirPostFijaInfija.convierteInfijaApostfija(ejemplo4));
        System.out.println(ConvertirPostFijaInfija.convierteInfijaApostfija(ejemplo));
        
        
    } 
    
}
