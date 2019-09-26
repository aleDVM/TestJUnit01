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
public class TestRestar {
        @Test
    public void testRestar() {
        System.out.println("Restar");
        Calculadora instance = new Calculadora(8, 2);
        int expResult = 6;
        int result = instance.Restar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
