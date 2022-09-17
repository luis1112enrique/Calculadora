
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luis1_0l42vo6
 */
public class Calculadora {
    private String expresion;
    private ArrayList <String> expresionPostfija;   
    private PilaA <Double> pilaAux = new PilaA <Double> ();
    
    public Calculadora(){
        
    }

    public String getExpresion() {
        return expresion;
    }
      
    public Calculadora (String expresion){
        this.expresion = expresion;
        this.expresionPostfija = convertirPostFijaInfija();
    }
    
    private ArrayList<String> obtenerTokens (){ // PRIMERO REVISAR TODA LA SINTAXIS
        return ObtieneTokens.obtieneTokens(getExpresion());      
    }
    
    private  ArrayList <String> convertirPostFijaInfija () {
        return ConvertirPostFijaInfija.convierteInfijaApostfija(obtenerTokens());
    }
    
    
    public double evaluaExpresion (){
        double resultado = 0;
        double operando1;
        double operando2;
        ArrayList <String > arrayModificadoXnegativo = new ArrayList <String>();
        String [] arregloAux = new String [100];
        int contArreglo = 1;
        
        if (expresion.charAt(0) == '-' || expresion.charAt(0) == '+'){ // POR SI ALPRINCIO DE UNA EXPRESION DADA POR EL USUARIO EMPIEZA CON UN SIMBOLO POSITIVO O NEGATIVO
            arregloAux[0] = "0";
            for (int i = 1; i <= expresionPostfija.size(); i++) {
                arregloAux[i] = expresionPostfija.get(i-1);
                contArreglo ++;
            }
            for (int i = 0 ; i < contArreglo ; i++){
                arrayModificadoXnegativo.add(arregloAux[i]);
            }
            expresionPostfija = arrayModificadoXnegativo;
            System.out.println(expresionPostfija);
        } 
        for (int i = 0; i < expresionPostfija.size(); i++) {
            if (ConvertirPostFijaInfija.esOperando(expresionPostfija.get(i))){
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
                        resultado = (Math.pow(operando2, operando1));
                        break;
                }
                pilaAux.push(resultado);
            }    
        }
        return pilaAux.pop();
    }
    
    public static void main(String[] args) {
        Calculadora cal = new Calculadora ("(-3+5)^2");
        
        System.out.println(cal.evaluaExpresion());
    }
}

