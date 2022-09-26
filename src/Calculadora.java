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
 *   · Esta clase modela la calculadora básica como objeto.
 */

public class Calculadora {
    
    //Atributos
    
    private String expresion;   
    private PilaA <Double> pilaAux = new PilaA <Double> ();
    
    //Funcionalidad
    
    /**
     * constructor vacío
     */
    public Calculadora(){  
    }
    
    public Calculadora (String expresion){
        this.expresion = expresion;
    }
    
    /**
     * getters y setters, funcionalidad básica
     * @return String
     */
    public String getExpresion() {
        return expresion;
    }
    
    public void setExpresion(String nuevaExpresion){
        this.expresion = nuevaExpresion;
    }
    
    /**
     * en evaluaExpresion se va leyendo carácter por carácter la cadena y de acuerdo al signo, se lleva a cabo una operación
     * @return String
     */
    
    private String evaluaExpresion (){
        double resultado = 0;
        boolean indeterminacion = false;
        StringBuilder cad = new StringBuilder ();
        ArrayList <String> guardaTokens; //= new ArrayList <String> ()
        String [] arregloAux = new String [1000];
        int contArreglo = 0;
        double operando1;
        double operando2;
        String res;
        ArrayList <String> expresionPostfija;
        
        if (expresion.charAt(0) == '-'){
            arregloAux[0] = "0";
            contArreglo ++;
        }
        for (int i = 0; i < expresion.length(); i++) {
            if (expresion.charAt(i) == '(') {
                arregloAux[contArreglo] =""+expresion.charAt(i);
                contArreglo++;
                arregloAux[contArreglo] = "0";        
            }
            else{
                arregloAux[contArreglo] = ""+expresion.charAt(i);
            }
            contArreglo++;
        }
        for (int j = 0; j < contArreglo; j++) {
            cad.append(arregloAux[j]);
        }
        guardaTokens = MetodosImportantes.obtieneTokens(cad.toString());
        expresionPostfija = MetodosImportantes.convierteInfijaAPostfija(guardaTokens); 
        for (int i = 0; i < expresionPostfija.size(); i++) {
            if (MetodosImportantes.esOperando(expresionPostfija.get(i))){
                pilaAux.push(Double.parseDouble(expresionPostfija.get(i)));
            }
            else{
                operando2 = pilaAux.pop();
                operando1 = pilaAux.pop();
                switch (expresionPostfija.get(i)){
                    case "+":
                        resultado = (operando1 + operando2);
                        break;
                    case "-":
                        resultado = (operando1 - operando2);
                        break;
                    case "*":
                        resultado = (operando1 * operando2);
                        break;
                    case "/":
                        if (operando2 == 0){
                            indeterminacion  = true;
                        }
                        else{
                            resultado = (operando1 / operando2);
                        }
                        break;
                    case "^":
                        resultado = (Math.pow(operando1, operando2));
                        break;
                }
                pilaAux.push(resultado);
            }    
        }
        if (indeterminacion){
            res = "Indeterminado";
        }
        else{
            res = ""+pilaAux.pop();
        }
        
        return res;
    }
    /**
     * en caso de que la sintaxis sea incorrecta, arroja un mensaje que lo indica
     * @return, si la sintaxis es correcta, se evalua la expresion, de lo contrario se regresa el mensaje de "error de sintaxis"
     */
    public String procesarExpresion(){
        String resp = "ERROR DE SINTAXIS";
        
        if(MetodosRevisionSintaxis.revisarSintaxis(expresion))
            resp = evaluaExpresion();
        
        return resp;
    }

    
}