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
 *   · Esta clase se encarga de revisar la sintaxis de la expresión ingresada 
 *     a la calculadora.
 */

public class MetodosRevisionSintaxis {
    
    /**
     *este método revisa que la expresión no inicie con un operador de
     *multiplicación, división, potencia o paréntesis derecho.
     * @param cadena
     * @return boolean, regresa false si el inicio de la expresion es un signo
     */
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
    
    /**
     *revisa que la expresión no finalice con un operador de
     *suma, resta, multiplicación, división, potencia o paréntesis izquierdo.
     * @param cadena
     * @return boolean, lo mismo que el anterior, la diferencia es que en este se revisa el ultimo elemento de la cadena
     */
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
    
    /**
     * se asegura de que los paréntesis estén equilibrados
     * @param cadena
     * @return boolean, si hay un parentesis izquierdo, y posteriormente en la misma expresion hay un parentesis derecho, regresa true, es decir, deben estar equilibrados
     */
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
    
    /**
     * revisa que la expresión no presente dos operadores aritméticos
     *juntos (en el caso de querer hacer una operación con un número negativo
     *el usuario deberá de utilizar el botón de cambio de signo o usar paréntesis).
     * @param cadena
     * @return boolean, regresa true si no hay ningun signo de operacion seguido de otro, o pegado a un parentesis 
     */
    private static boolean revisarOperadores (String cadena){
        boolean resp = false; 
        int i = 0;
        int bandera = 0;
        
        while(i < cadena.length()-1 && bandera == 0){
            if (cadena.charAt(i) == '+' || cadena.charAt(i) == '-' || cadena.charAt(i) == '*' || cadena.charAt(i) == '/' || cadena.charAt(i) == '^')
                if (cadena.charAt(i+1) == '+' || cadena.charAt(i+1) == '-' || cadena.charAt(i+1) == '*' || cadena.charAt(i+1) == '/' || cadena.charAt(i+1) == '^')
                    bandera = 1;
            i++;
        }       
        if(bandera == 0){

            //Esta parte del método revisa que no haya un operador de división, multiplicación o
            //potencia después de un paréntesis de apertura; y  que no haya un perador de división, 
            //multiplicación, suma, o resta antes de un paréntesis de cerradura.
            i = 0;
            while(i < cadena.length()-1 && bandera == 0){
                if(cadena.charAt(i) == '(')
                    if(cadena.charAt(i+1) == '*' || cadena.charAt(i+1) == '/' || cadena.charAt(i+1) == '^')
                        bandera = 1;
                i++;
            }
            if(bandera == 0){
                i = 1;
                while(i < cadena.length() && bandera == 0){                       
                    if(cadena.charAt(i) == ')')
                        if(cadena.charAt(i-1) == '*' || cadena.charAt(i-1) == '/' || cadena.charAt(i-1) == '^' || cadena.charAt(i-1) == '-' || cadena.charAt(i-1) == '+')
                            bandera = 1;
                    i++;
                }
                if(bandera == 0)
                    resp = true;
            }
        }
        return resp;   
    }
    
    /**
     * revisa que no hayan parentesis sin contenido
     * @param cadena
     * @return boolean, si hay unos parentesis pegados, es decir "()", regresa false
     */
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
    /**
     * revisa si la expresión tiene un punto decimal y de ser así,lo conserva dentro de una pila 
     * @param cadena
     * @return boolean, true si el caracter es un punto
     */
    private static boolean revisarUnPuntoDecimal (String cadena){ 
        PilaA pila = new PilaA ();
        boolean res = true;  
        char punto =  '.';
        
        for(int i = 0; i < cadena.length(); i++){
            if (cadena.charAt(i) == punto){
                if(pila.isEmpty())
                    pila.push(cadena.charAt(i));
                else
                    res = false;
            }
            else
                if (cadena.charAt(i) == '+' || cadena.charAt(i) == '-' || cadena.charAt(i) == '*' || cadena.charAt(i) == '/' || cadena.charAt(i) == '^' || cadena.charAt(i) == '(' || cadena.charAt(i) == ')')
                        if(!pila.isEmpty())
                            pila.pop();
        }
 
        return res; 
    }

    /**
     * Este método es el encargado de revisar toda la sintaxis al llamar a los métodos programados anteriormente
     * @param cadena
     * @return boolean, true si se cumplieron todos los apartados anteriores
     */

    public static boolean revisarSintaxis (String cadena){
        boolean resp = false;
        
        if(MetodosRevisionSintaxis.revisarInicio(cadena))
            if(MetodosRevisionSintaxis.revisarFinal(cadena))
                if(MetodosRevisionSintaxis.revisarOperadores(cadena))
                    if(MetodosRevisionSintaxis.revisarParentesis(cadena))
                        if(MetodosRevisionSintaxis.revisarParentesisVacios(cadena))
                            if(MetodosRevisionSintaxis.revisarUnPuntoDecimal(cadena))                        
                                resp = true;
               
        return resp;
    }
    
    /**
     * PRUEBAS MÉTODO revisarUnPuntoDecimal
     * @param args 
     */
    
    public static void main(String[] args){
       /**
     * PRUEBAS MÉTODO revisarUnPuntoDecimal
     *  
     */
        String prueba1 = "09.+09+4";//debe ser buena
        if(MetodosRevisionSintaxis.revisarUnPuntoDecimal(prueba1))
            System.out.println("prueba1 buena");
        else
            System.out.println("prueba1 mala");
        
        String prueba2 = "09.0+09+4";//debe ser buena
        if(MetodosRevisionSintaxis.revisarUnPuntoDecimal(prueba2))
            System.out.println("prueba2 buena");
        else
            System.out.println("prueba2 mala");
        
        String prueba3 = "09..0+09+4";//debe ser mala
        if(MetodosRevisionSintaxis.revisarUnPuntoDecimal(prueba3))
            System.out.println("prueba2 buena");
        else
            System.out.println("prueba2 mala");

        String prueba4 = "09.0232323.0+09+4";//debe ser mala
        if(MetodosRevisionSintaxis.revisarUnPuntoDecimal(prueba4))
            System.out.println("prueba4 buena");
        else
            System.out.println("prueba4 mala");
        
        String prueba5 = "09.02323230+0.9+4.";//debe ser buena
        if(MetodosRevisionSintaxis.revisarUnPuntoDecimal(prueba5))
            System.out.println("prueba5 buena");
        else
            System.out.println("prueba5 mala");
        
        String prueba6 = "09..";//debe ser mala
        if(MetodosRevisionSintaxis.revisarUnPuntoDecimal(prueba6))
            System.out.println("prueba6 buena");
        else
            System.out.println("prueba6 mala");
    
    
    
    /**
     * PRUEBAS MÉTODO revisarInicio
     */
    
    
        
        String prueba7 = "09 + 09 + 4";
        if(MetodosRevisionSintaxis.revisarInicio(prueba7))
            System.out.println("prueba7 buena");
        else
            System.out.println("prueba7 mala");
        
        String prueba8 = "+ 09 + 4";
        if(MetodosRevisionSintaxis.revisarInicio(prueba8))
            System.out.println("prueba8 buena");
        else
            System.out.println("prueba8 mala");

        String prueba9 = ".09 + 4";
        if(MetodosRevisionSintaxis.revisarInicio(prueba9))
            System.out.println("prueba9 buena");
        else
            System.out.println("prueba9 mala");
        
        String prueba10 = "*.09 + 4";
        if(MetodosRevisionSintaxis.revisarInicio(prueba10))
            System.out.println("prueba10 buena");
        else
            System.out.println("prueba10 mala");
        
        String prueba11 = "/.09 + 4";
        if(MetodosRevisionSintaxis.revisarInicio(prueba11))
            System.out.println("prueba11 buena");
        else
            System.out.println("prueba11 mala");
        
        String prueba12 = "^.09 + 4";
        if(MetodosRevisionSintaxis.revisarInicio(prueba12))
            System.out.println("prueba12 buena");
        else
            System.out.println("prueba12 mala");
        
        String prueba13 = ").09 + 4";
        if(MetodosRevisionSintaxis.revisarInicio(prueba13))
            System.out.println("prueba13 buena");
        else
            System.out.println("prueba13 mala");
        
        String prueba14 = "(.09 + 4)";
        if(MetodosRevisionSintaxis.revisarInicio(prueba14))
            System.out.println("prueba14 buena");
        else
            System.out.println("prueba14 mala");
        
        String prueba15 = "- 09 + 4";
        if(MetodosRevisionSintaxis.revisarInicio(prueba15))
            System.out.println("prueba15 buena");
        else
            System.out.println("prueba15 mala");
    
    
    /**
     * /PRUEBAS MÉTODO revisarFinal
     */
    
  
        String prueba16 = "09 + 09 + 4";
        if(MetodosRevisionSintaxis.revisarFinal(prueba16))
            System.out.println("prueba16 buena");
        else
            System.out.println("prueba16 mala");
        
        String prueba17 = "09 + 09 + 4.";
        if(MetodosRevisionSintaxis.revisarFinal(prueba17))
            System.out.println("prueba17 buena");
        else
            System.out.println("prueba17 mala");

        String prueba18 = "09 + 09 + 4)";
        if(MetodosRevisionSintaxis.revisarFinal(prueba18))
            System.out.println("prueba18 buena");
        else
            System.out.println("prueba18 mala");
        
        String prueba19 = "09 + 09 + 4(";
        if(MetodosRevisionSintaxis.revisarFinal(prueba19))
            System.out.println("prueba19 buena");
        else
            System.out.println("prueba19 mala");
        
        String prueba20 = "09 + 09 + 4-";
        if(MetodosRevisionSintaxis.revisarFinal(prueba20))
            System.out.println("prueba20 buena");
        else
            System.out.println("prueba20 mala");
        
        String prueba21 = "09 + 09 + 4+";
        if(MetodosRevisionSintaxis.revisarFinal(prueba21))
            System.out.println("prueba21 buena");
        else
            System.out.println("prueba21 mala");
        
        String prueba22 = "09 + 09 + 4*";
        if(MetodosRevisionSintaxis.revisarFinal(prueba22))
            System.out.println("prueba22 buena");
        else
            System.out.println("prueba22 mala");
        
        String prueba23 = "09 + 09 + 4/";
        if(MetodosRevisionSintaxis.revisarFinal(prueba23))
            System.out.println("prueba23 buena");
        else
            System.out.println("prueba23 mala");
        
        String prueba24 = "09 + 09 + 4^";
        if(MetodosRevisionSintaxis.revisarFinal(prueba24))
            System.out.println("prueba24 buena");
        else
            System.out.println("prueba24 mala");
    
    
    
    /**
     * PRUEBAS MÉTODO revisarOperadores
     */
    
    
        
        String prueba25 = "09 + 09 ++ 4";
        if(MetodosRevisionSintaxis.revisarOperadores(prueba25))
            System.out.println("prueba25 buena");
        else
            System.out.println("prueba25 mala");
        
        String prueba26 = "09 + 09 *+ 4";
        if(MetodosRevisionSintaxis.revisarOperadores(prueba26))
            System.out.println("prueba26 buena");
        else
            System.out.println("prueba26 mala");
        
        String prueba27 = "(09)+(-09)+4";
        if(MetodosRevisionSintaxis.revisarOperadores(prueba27))
            System.out.println("prueba27 buena");
        else
            System.out.println("prueba27 mala");
        
        String prueba28 = "(09)+^(-09)+4";
        if(MetodosRevisionSintaxis.revisarOperadores(prueba28))
            System.out.println("prueba28 buena");
        else
            System.out.println("prueba28 mala");
        
        String prueba29 = "(09)+(-09)+4+*";
        if(MetodosRevisionSintaxis.revisarOperadores(prueba29))
            System.out.println("prueba29 buena");
        else
            System.out.println("prueba29 mala");
        
        String prueba30 = "(09)+(/09)+4+";//Para este método está bien el resultado de la prueba, pero significa que hay que agregar otros métodos de chequeo
        if(MetodosRevisionSintaxis.revisarOperadores(prueba30))
            System.out.println("prueba30 buena");
        else
            System.out.println("prueba30 mala");
    
    
    
    /**
     * PRUEBAS MÉTODO revisarOperadores (Relacion parentesis izquierdo y operadores)
     */
    
   
        
        String prueba31 = "09 + 09 + 4";//Debe ser buena
        if(MetodosRevisionSintaxis.revisarOperadores(prueba31))
            System.out.println("prueba31 buena");
        else
            System.out.println("prueba31 mala");
        
        String prueba32 = "09 + 09 *+ 4";//Debe ser mala
        if(MetodosRevisionSintaxis.revisarOperadores(prueba32))
            System.out.println("prueba32 buena");
        else
            System.out.println("prueba32 mala");
        
        String prueba33 = "(09)+(-09)+4";//Debe ser buena
        if(MetodosRevisionSintaxis.revisarOperadores(prueba33))
            System.out.println("prueba33 buena");
        else
            System.out.println("prueba33 mala");
        
        String prueba34 = "(09)^(-09)+4";//Debe ser buena
        if(MetodosRevisionSintaxis.revisarOperadores(prueba34))
            System.out.println("prueba34 buena");
        else
            System.out.println("prueba34 mala");
        
        String prueba35 = "(09)+(-09)+4*";//Debe ser buena
        if(MetodosRevisionSintaxis.revisarOperadores(prueba35))
            System.out.println("prueba35 buena");
        else
            System.out.println("prueba35 mala");
        
        String prueba36 = "(09)+(/09)+4+";//Debe ser mala
        if(MetodosRevisionSintaxis.revisarOperadores(prueba36))
            System.out.println("prueba36 buena");
        else
            System.out.println("prueba36 mala");
        
        String prueba37 = "(09)+(*09)+4+";//Debe ser mala
        if(MetodosRevisionSintaxis.revisarOperadores(prueba37))
            System.out.println("prueba37 buena");
        else
            System.out.println("prueba37 mala");
        
        String prueba38 = "(09)+(^09)+4+";//Debe ser mala
        if(MetodosRevisionSintaxis.revisarOperadores(prueba38))
            System.out.println("prueba38 buena");
        else
            System.out.println("prueba38 mala");
        
    
    

    
    
        /**
         * PRUEBAS MÉTODO revisarParentesisVacios
         */
        
        String prueba39 = "09 + 09 + 4";//Debe ser buena
        if(MetodosRevisionSintaxis.revisarParentesisVacios(prueba39))
            System.out.println("prueba39 buena");
        else
            System.out.println("prueba39 mala");
        
        String prueba40 = "09 + (09) + 4";//Debe ser buena
        if(MetodosRevisionSintaxis.revisarParentesisVacios(prueba40))
            System.out.println("prueba40 buena");
        else
            System.out.println("prueba40 mala");
        
        String prueba41 = "09 + () + 4";//Debe ser mala
        if(MetodosRevisionSintaxis.revisarParentesisVacios(prueba41))
            System.out.println("prueba41 buena");
        else
            System.out.println("prueba41 mala");  
    }
}