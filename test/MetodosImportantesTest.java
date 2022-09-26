
import java.util.ArrayList;
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
 *   · Pruebas de la clase MetodosImportantes
 */
public class MetodosImportantesTest {
    
    public MetodosImportantesTest() {
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
     * Test of esOperando method, of class MetodosImportantes.
     */
    @Test
    public void testEsOperando() {
        System.out.println("esOperando");
        String letra = "92";
        boolean expResult = false;
        boolean result = MetodosImportantes.esOperando(letra);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prioridadOperaciones method, of class MetodosImportantes.
     */
    @Test
    public void testPrioridadOperaciones() {
        System.out.println("prioridadOperaciones");
        String operador = "*";
        int expResult = 2;
        int result = MetodosImportantes.prioridadOperaciones(operador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convierteInfijaAPostfija method, of class MetodosImportantes.
     */
    @Test
    public void testConvierteInfijaAPostfija() {
        System.out.println("convierteInfijaAPostfija");
        ArrayList<String> cadenaOperacion = new ArrayList<String> (9+'+'+21);
        ArrayList<String> expResult = new ArrayList <String> (9+21+'+');
        ArrayList<String> result = MetodosImportantes.convierteInfijaAPostfija(cadenaOperacion);//.....................
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esNumeroNaturalOPunto method, of class MetodosImportantes.
     */
    @Test
    public void testEsNumeroNaturalOPunto() {
        System.out.println("esNumeroNaturalOPunto");
        char elemento = '2';
        boolean expResult = true;
        boolean result = MetodosImportantes.esNumeroNaturalOPunto(elemento);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtieneTokens method, of class MetodosImportantes.
     */
    @Test
    public void testObtieneTokens() {
        System.out.println("obtieneTokens");
        String cadena = "";
        ArrayList<String> expResult = null;
        ArrayList<String> result = MetodosImportantes.obtieneTokens(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail....................................
        fail("The test case is a prototype.");
    }
    
}
