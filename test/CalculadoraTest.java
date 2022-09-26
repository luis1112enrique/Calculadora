import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
 *   · Pruebas de la clase Calculadora
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getExpresion method, of class Calculadora.
     */
//    @Test
//    public void testGetExpresion() {
//        System.out.println("getExpresion");
//        Calculadora instance = new Calculadora();
//        String expResult = "";
//        String result = instance.getExpresion();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of setExpresion method, of class Calculadora.
     */
//    @Test
//    public void testSetExpresion() {
//        System.out.println("setExpresion");
//        String nuevaExpresion = "";
//        Calculadora instance = new Calculadora();
//        instance.setExpresion(nuevaExpresion);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of procesarExpresion method, of class Calculadora.
     */
    @Test
    public void testProcesarExpresion() {
        System.out.println("procesarExpresion");
        Calculadora instance = new Calculadora("9+2");
        String expResult = "11";
        String result = instance.procesarExpresion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
