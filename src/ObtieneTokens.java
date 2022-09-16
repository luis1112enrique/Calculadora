
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luis1_0l42vo6
 */
public class ObtieneTokens {
    public static boolean esNumeroNaturaloPunto(char elemento){
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
            if (! esNumeroNaturaloPunto(cadena.charAt(i))){
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
    
    
    public static void main(String[] args) {
        String cadena = "-1.5+7*(5+1)-10";
        String cadena1 = "1+8";
        String cadena2 = "16-8+(3-1)";
        String cadena3 = "(5.1-2.9)*9.2";
        ArrayList<String> ejemplo = new ArrayList <String> ();
        
        ejemplo.add("-");
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
        
        System.out.println(obtieneTokens(cadena));
        System.out.println(ejemplo);
        System.out.println(obtieneTokens(cadena1));
        System.out.println(obtieneTokens(cadena2));
        System.out.println(obtieneTokens(cadena3));
        
        
    }
}
