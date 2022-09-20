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
 *   · Esta clase se encarga de revisar la sintaxis de la expresión ingresada 
 *     a la calculadora.
 */

public class MetodosRevisionSintaxis {
    
    //Este método revisa que la expresión no inicie con un operador de
    //multiplicación, división, potencia o paréntesis derecho.
    private static boolean revisarInicio (String cadena){
        boolean resp;
        
        switch(cadena.charAt(0)){
            case '*': resp = false;
            break;
            case '/': resp = false;
            break;
            case '^': resp = false;
            break;
            case ')': resp = false;
            break;
            default: resp = true;     
        }
        
        return resp;
    }
    
    //Este método revisa que la expresión no finalice con un operador de
    //suma, resta, multiplicación, división, potencia o paréntesis izquierdo.
    private static boolean revisarFinal (String cadena){
        boolean resp;
             
        switch(cadena.charAt(cadena.length() - 1)){
            case '*': resp = false;
            break;
            case '/': resp = false;
            break;
            case '^': resp = false;
            break;
            case '(': resp = false;
            break;
            case '+': resp = false;
            break;
            case '-': resp = false;
            break;
            default: resp = true;     
        }
       
        return resp;
    }
    
    //Este método revisa que los paréntesis estén balanceados
    private static boolean revisarParentesis (String cadena){ 
        PilaA pila = new PilaA ();
        boolean resp = true;  
        char parentesisIzq =  '(';
        char parentesisDer = ')';
       
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == parentesisIzq){
                pila.push(cadena.charAt(i));
            }
            else{
                if (cadena.charAt(i) == parentesisDer){
                    if (! pila.isEmpty()){
                        pila.pop();
                    }
                    else{
                        resp = false;
                    }
                }
            }
        }
        if (! pila.isEmpty() && (char)pila.pop() == parentesisIzq){
            resp = false;
        }
      
        return resp;
    }
    
    //Este método revisa que la expresión no presente dos operadores aritméticos
    //juntos (en el caso de querer hacer una operación con un número negativo
    //el usuario deberá de utilizar el botón de cambio de signo o usar paréntesis).
    private static boolean revisarOperadores (String cadena){
        boolean resp; 
        int i = 0;
        int bandera = 0;
        
        while(i < cadena.length()-1 && bandera == 0){
            if (cadena.charAt(i) == '+' || cadena.charAt(i) == '-' || cadena.charAt(i) == '*' || cadena.charAt(i) == '/' || cadena.charAt(i) == '^')
                if (cadena.charAt(i+1) == '+' || cadena.charAt(i+1) == '-' || cadena.charAt(i+1) == '*' || cadena.charAt(i+1) == '/' || cadena.charAt(i+1) == '^')
                    bandera = 1;
            i++;
        }       
        if(bandera == 0)
            resp = true;
        else
            resp = false;
        
        return resp;   
    }
    
    //Este método revisa que no haya un operador de división, multiplicación o
    //potencia después de un paréntesis de apertura.
    private static boolean revisarParentesisIzqYOperadores (String cadena){
        boolean resp;
        int i = 0;
        int bandera = 0;
        
        while(i < cadena.length()-1 && bandera == 0){
            if(cadena.charAt(i) == '(')
                if(cadena.charAt(i+1) == '*' || cadena.charAt(i+1) == '/' || cadena.charAt(i+1) == '^')
                    bandera = 1;
            i++;
        }
        if(bandera == 0)
            resp = true;
        else
            resp = false;
        
        return resp;
    }
    
    //Este método revisa que no haya paréntesis vacíos 
    private static boolean revisarParentesisVacios (String cadena){
        boolean resp;
        int i = 0;
        int bandera = 0;
        
        while(i < cadena.length()-1 && bandera == 0){
            if(cadena.charAt(i) == '(' && cadena.charAt(i+1) == ')')
                bandera = 1;
            i++;
        }
        if(bandera == 0)
            resp = true;
        else
            resp = false;
        
        return resp;
    }
    
    //Este método revisa la división entre 0
    /*
    private static boolean revisarDivision0 (String cadena){
        
    }
    */
    
    //Este método es el encargado de revisar toda la sintaxis
    public int revisarSintaxis (String cadena){
        int resp = 0;
        
        if(!MetodosRevisionSintaxis.revisarInicio(cadena))
            resp = 1;
        else
            if(!MetodosRevisionSintaxis.revisarFinal(cadena))
                resp = 2;
            else
                if(!MetodosRevisionSintaxis.revisarOperadores(cadena))
                    resp = 3;
                else
                    if(!MetodosRevisionSintaxis.revisarParentesis(cadena))
                        resp = 4;
                    else
                        if(!MetodosRevisionSintaxis.revisarParentesisIzqYOperadores(cadena))
                            resp = 5;
                        else
                            if(!MetodosRevisionSintaxis.revisarParentesisVacios(cadena))
                                resp = 6;
        //Falta la del 0
               
        return resp;
    }
    
    /*
    public static boolean revisarUnPuntoDecimal (String cadena){
           
        PilaA pila = new PilaA ();
        boolean res = true;  
        char punto =  '.';
        
        for(int i = 0; i < cadena.length(); i++){
            if (cadena.charAt(i) == punto){
                pila.push(cadena.charAt(i));
            }
            else{
                if (cadena.charAt(i) == '+' || cadena.charAt(i) == "-" || cadena.charAt(i) == ""){
                    if (! pila.isEmpty()){
                        pila.pop();
                    }
                    else{
                        res = false;
                    }
                }
            }
        }
        if (! pila.isEmpty() && (char)pila.pop() == parentesisIzq){
            res = false;
        }
      
        return res; 
            
            
        }
*/
    
    //PRUEBAS MÉTODO revisarInicio
    /*
    public static void main(String[] args){
        
        String prueba1 = "09 + 09 + 4";
        if(MetodosRevisionSintaxis.revisarInicio(prueba1))
            System.out.println("prueba1 buena");
        else
            System.out.println("prueba1 mala");
        
        String prueba2 = "+ 09 + 4";
        if(MetodosRevisionSintaxis.revisarInicio(prueba2))
            System.out.println("prueba2 buena");
        else
            System.out.println("prueba2 mala");

        String prueba3 = ".09 + 4";
        if(MetodosRevisionSintaxis.revisarInicio(prueba3))
            System.out.println("prueba3 buena");
        else
            System.out.println("prueba3 mala");
        
        String prueba4 = "*.09 + 4";
        if(MetodosRevisionSintaxis.revisarInicio(prueba4))
            System.out.println("prueba4 buena");
        else
            System.out.println("prueba4 mala");
        
        String prueba5 = "/.09 + 4";
        if(MetodosRevisionSintaxis.revisarInicio(prueba5))
            System.out.println("prueba5 buena");
        else
            System.out.println("prueba5 mala");
        
        String prueba6 = "^.09 + 4";
        if(MetodosRevisionSintaxis.revisarInicio(prueba6))
            System.out.println("prueba6 buena");
        else
            System.out.println("prueba6 mala");
        
        String prueba7 = ").09 + 4";
        if(MetodosRevisionSintaxis.revisarInicio(prueba7))
            System.out.println("prueba7 buena");
        else
            System.out.println("prueba7 mala");
        
        String prueba8 = "(.09 + 4)";
        if(MetodosRevisionSintaxis.revisarInicio(prueba8))
            System.out.println("prueba8 buena");
        else
            System.out.println("prueba8 mala");
        
        String prueba9 = "- 09 + 4";
        if(MetodosRevisionSintaxis.revisarInicio(prueba9))
            System.out.println("prueba9 buena");
        else
            System.out.println("prueba9 mala");
    }
    */
    
    //PRUEBAS MÉTODO revisarFinal
    /*
    public static void main(String[] args){
        
        String prueba1 = "09 + 09 + 4";
        if(MetodosRevisionSintaxis.revisarFinal(prueba1))
            System.out.println("prueba1 buena");
        else
            System.out.println("prueba1 mala");
        
        String prueba2 = "09 + 09 + 4.";
        if(MetodosRevisionSintaxis.revisarFinal(prueba2))
            System.out.println("prueba2 buena");
        else
            System.out.println("prueba2 mala");

        String prueba3 = "09 + 09 + 4)";
        if(MetodosRevisionSintaxis.revisarFinal(prueba3))
            System.out.println("prueba3 buena");
        else
            System.out.println("prueba3 mala");
        
        String prueba4 = "09 + 09 + 4(";
        if(MetodosRevisionSintaxis.revisarFinal(prueba4))
            System.out.println("prueba4 buena");
        else
            System.out.println("prueba4 mala");
        
        String prueba5 = "09 + 09 + 4-";
        if(MetodosRevisionSintaxis.revisarFinal(prueba5))
            System.out.println("prueba5 buena");
        else
            System.out.println("prueba5 mala");
        
        String prueba6 = "09 + 09 + 4+";
        if(MetodosRevisionSintaxis.revisarFinal(prueba6))
            System.out.println("prueba6 buena");
        else
            System.out.println("prueba6 mala");
        
        String prueba7 = "09 + 09 + 4*";
        if(MetodosRevisionSintaxis.revisarFinal(prueba7))
            System.out.println("prueba7 buena");
        else
            System.out.println("prueba7 mala");
        
        String prueba8 = "09 + 09 + 4/";
        if(MetodosRevisionSintaxis.revisarFinal(prueba8))
            System.out.println("prueba8 buena");
        else
            System.out.println("prueba8 mala");
        
        String prueba9 = "09 + 09 + 4^";
        if(MetodosRevisionSintaxis.revisarFinal(prueba9))
            System.out.println("prueba9 buena");
        else
            System.out.println("prueba9 mala");
    }
    */
    
    //PRUEBAS MÉTODO revisarOperadores
    /*
    public static void main(String[] args){
        
        String prueba1 = "09 + 09 ++ 4";
        if(MetodosRevisionSintaxis.revisarOperadores(prueba1))
            System.out.println("prueba1 buena");
        else
            System.out.println("prueba1 mala");
        
        String prueba2 = "09 + 09 *+ 4";
        if(MetodosRevisionSintaxis.revisarOperadores(prueba2))
            System.out.println("prueba2 buena");
        else
            System.out.println("prueba2 mala");
        
        String prueba3 = "(09)+(-09)+4";
        if(MetodosRevisionSintaxis.revisarOperadores(prueba3))
            System.out.println("prueba3 buena");
        else
            System.out.println("prueba3 mala");
        
        String prueba4 = "(09)+^(-09)+4";
        if(MetodosRevisionSintaxis.revisarOperadores(prueba4))
            System.out.println("prueba4 buena");
        else
            System.out.println("prueba4 mala");
        
        String prueba5 = "(09)+(-09)+4+*";
        if(MetodosRevisionSintaxis.revisarOperadores(prueba5))
            System.out.println("prueba5 buena");
        else
            System.out.println("prueba5 mala");
        
        String prueba6 = "(09)+(/09)+4+";//Para este método está bien el resultado de la prueba, pero significa que hay que agregar otros métodos de chequeo
        if(MetodosRevisionSintaxis.revisarOperadores(prueba6))
            System.out.println("prueba6 buena");
        else
            System.out.println("prueba6 mala");
    }
    */
    
    //PRUEBAS MÉTODO revisarParentesisIzqYOperadores
    /*
    public static void main(String[] args){
        
        String prueba1 = "09 + 09 ++ 4";//Debe ser buena
        if(MetodosRevisionSintaxis.revisarParentesisIzqYOperadores(prueba1))
            System.out.println("prueba1 buena");
        else
            System.out.println("prueba1 mala");
        
        String prueba2 = "09 + 09 *+ 4";//Debe ser buena
        if(MetodosRevisionSintaxis.revisarParentesisIzqYOperadores(prueba2))
            System.out.println("prueba2 buena");
        else
            System.out.println("prueba2 mala");
        
        String prueba3 = "(09)+(-09)+4";//Debe ser buena
        if(MetodosRevisionSintaxis.revisarParentesisIzqYOperadores(prueba3))
            System.out.println("prueba3 buena");
        else
            System.out.println("prueba3 mala");
        
        String prueba4 = "(09)+^(-09)+4";//Debe ser buena
        if(MetodosRevisionSintaxis.revisarParentesisIzqYOperadores(prueba4))
            System.out.println("prueba4 buena");
        else
            System.out.println("prueba4 mala");
        
        String prueba5 = "(09)+(-09)+4+*";//Debe ser buena
        if(MetodosRevisionSintaxis.revisarParentesisIzqYOperadores(prueba5))
            System.out.println("prueba5 buena");
        else
            System.out.println("prueba5 mala");
        
        String prueba6 = "(09)+(/09)+4+";//Debe ser mala
        if(MetodosRevisionSintaxis.revisarParentesisIzqYOperadores(prueba6))
            System.out.println("prueba6 buena");
        else
            System.out.println("prueba6 mala");
        
        String prueba7 = "(09)+(*09)+4+";//Debe ser mala
        if(MetodosRevisionSintaxis.revisarParentesisIzqYOperadores(prueba7))
            System.out.println("prueba7 buena");
        else
            System.out.println("prueba7 mala");
        
        String prueba8 = "(09)+(^09)+4+";//Debe ser mala
        if(MetodosRevisionSintaxis.revisarParentesisIzqYOperadores(prueba8))
            System.out.println("prueba8 buena");
        else
            System.out.println("prueba8 mala");
        
    }
    */

    //PRUEBAS MÉTODO revisarParentesisVacios
    /*
    public static void main(String[] args){
        
        String prueba1 = "09 + 09 + 4";//Debe ser buena
        if(MetodosRevisionSintaxis.revisarParentesisVacios(prueba1))
            System.out.println("prueba1 buena");
        else
            System.out.println("prueba1 mala");
        
        String prueba2 = "09 + (09) + 4";//Debe ser buena
        if(MetodosRevisionSintaxis.revisarParentesisVacios(prueba2))
            System.out.println("prueba2 buena");
        else
            System.out.println("prueba2 mala");
        
        String prueba3 = "09 + () + 4";//Debe ser mala
        if(MetodosRevisionSintaxis.revisarParentesisVacios(prueba3))
            System.out.println("prueba3 buena");
        else
            System.out.println("prueba3 mala");  
    }
    */
    
}
