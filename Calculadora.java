package proyectocalculadora;
import java.util.ArrayList;

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
 *   · Esta clase modela la calculadora básica como objeto.
 */

public class Calculadora {
    
    //Atributos
    
    private String expresion;
    private ArrayList <String> expresionPostfija;   
    private PilaA <Double> pilaAux = new PilaA <Double> ();
    
    //Funcionalidad
    
    //  · Constructores
    public Calculadora(){  
    }
    
    public Calculadora (String expresion){
        this.expresion = expresion;
        this.expresionPostfija = convertirPostFijaInfija();
    }
    
    //  · Getters y setters
    public String getExpresion() {
        return expresion;
    }
    
    private ArrayList<String> obtenerTokens (){ // PRIMERO REVISAR TODA LA SINTAXIS
        return MetodosImportantes.obtieneTokens(getExpresion());      
    }
    
    private  ArrayList <String> convertirPostFijaInfija () {
        return MetodosImportantes.convierteInfijaAPostfija(obtenerTokens());
    }
    
    
    public double evaluaExpresion (){
        double resultado = 0;
        double operando1;
        double operando2;
        ArrayList <String > arrayModificadoXnegativo = new ArrayList <String>();
        String [] arregloAux = new String [100];
        int contArreglo = 1;
        
        if (expresion.charAt(0) == '-' || expresion.charAt(0) == '+'){ // POR SI AL PRINCIO DE UNA EXPRESION DADA POR EL USUARIO EMPIEZA CON UN SIMBOLO POSITIVO O NEGATIVO
            arregloAux[0] = "0";
            for (int i = 1; i <= expresionPostfija.size(); i++) {
                arregloAux[i] = expresionPostfija.get(i-1);
                contArreglo ++;
            }
            for (int i = 0 ; i < contArreglo ; i++){
                arrayModificadoXnegativo.add(arregloAux[i]);
            }
            expresionPostfija = arrayModificadoXnegativo;
        } 
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
                        resultado = (operando1 / operando2);
                        break;
                    case "^":
                        resultado = (Math.pow(operando1, operando2));
                        break;
                }
                pilaAux.push(resultado);
            }    
        }
        return pilaAux.pop();
        
    }
    
}

    
