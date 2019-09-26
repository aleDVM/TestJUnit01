package modelo;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestDividir {
       @Test
    public void testDividir() {
        System.out.println("Dividir");
        Calculadora instance = new Calculadora(8, 2);
        int expResult = 4;
        int result = instance.Dividir();
        //assertEquals(expResult, result);
        // asertTrue se usa para operaciones numericas
        assertTrue(instance.Dividir()==4);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    } 
}
