package proyectocalculadora;


import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pacot
 */
public class PruebasMetodos {
    
    
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
        System.out.println(MetodosImportantes.convierteInfijaAPostfija(ejemplo1));
        System.out.println(MetodosImportantes.convierteInfijaAPostfija(ejemplo2));
        System.out.println(MetodosImportantes.convierteInfijaAPostfija(ejemplo3));
        System.out.println(MetodosImportantes.convierteInfijaAPostfija(ejemplo4));
        System.out.println(MetodosImportantes.convierteInfijaAPostfija(ejemplo));
        
        String cadena = "-1.5+7*(5+1)-10";
        String cadena1 = "1+8";
        String cadena2 = "16-8+(3-1)";
        String cadena3 = "(5.1-2.9)*9.2";
        ArrayList<String> ej = new ArrayList <String> ();
        
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
        
        System.out.println(MetodosImportantes.obtieneTokens(cadena));
        System.out.println(ej);
        System.out.println(MetodosImportantes.obtieneTokens(cadena1));
        System.out.println(MetodosImportantes.obtieneTokens(cadena2));
        System.out.println(MetodosImportantes.obtieneTokens(cadena3));
        
        
    
        /*
        String ej1 = ("(Hola)");
        String ej2 = ("((Hola)");
        String ej3 = ("Como estas )))");
        String ej4 = (")Hola((");
        String ej5 = ("((Prueba");
        String ej6 = ("((Hola como) estas)");
        String ej7 = ("Hola");
        String ej8 = (")Hola((Hola())");
        
        System.out.println(MetodosIm.revisarParentesis (ej1));
        System.out.println(MetodosImportantes.revisarParentesis (ej2));
        System.out.println(MetodosImportantes.revisarParentesis (ej3));
        System.out.println(MetodosImportantes.revisarParentesis (ej4));
        System.out.println(MetodosImportantes.revisarParentesis (ej5));
        System.out.println(MetodosImportantes.revisarParentesis (ej6));
        System.out.println(MetodosImportantes.revisarParentesis (ej7));
        System.out.println(MetodosImportantes.revisarParentesis (ej8));
        */
        
        
        
    
    
    
    }
}
