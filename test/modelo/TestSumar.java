/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author pella
 */
public class TestSumar {
        @Test
    public void testSumar() {
        System.out.println("Sumar");
        Calculadora instance = new Calculadora(8, 2);
        int expResult = 10;
        int result = instance.Sumar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
