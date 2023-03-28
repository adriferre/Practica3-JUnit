/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package myutils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Adrià
 */
public class MyUtilsTest {
    
    public MyUtilsTest() {
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
     * Test of inverteix method, of class MyUtils.
     */
    @Test
    public void testInverteix() {
        System.out.println("inverteix");
        String cadena = "inverteix";
        String expResult = "xietrevni";
        String result = MyUtils.inverteix(cadena);
        assertEquals(expResult, result);
    }
    @Test
    public void testInverteix2() {
        System.out.println("inverteix");
        String cadena = null;
        String expResult = null;
        String result = MyUtils.inverteix(cadena);
        assertEquals(expResult, result);
    }

    /**
     * Test of edat method, of class MyUtils.
     */
    @Test
    public void testEdat() {
        System.out.println("edat");
        int day = 2;
        int month = 9;
        int year = 2004;
        int expResult = 18;
        int result = MyUtils.edat(day, month, year);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testEdat2() {
        System.out.println("edat");
        int day = 2;
        int month = 9;
        int year = 2050;
        int expResult = -2;
        int result = MyUtils.edat(day, month, year);
        assertEquals(expResult, result);
    }
    @Test
    public void testEdat3() {
        System.out.println("edat");
        int day = 2;
        int month = 9;
        int year = 1000;
        int expResult = -1;
        int result = MyUtils.edat(day, month, year);
        assertEquals(expResult, result);
    }

    /**
     * Test of factorial method, of class MyUtils.
     */
    @Test
    public void testFactorial() {
        System.out.println("factorial");
        double numero = 4.0;
        double expResult = 24.0;
        double result = MyUtils.factorial(numero);
        assertEquals(expResult, result, 0);
    }
    @Test
    public void testFactorial2() {
        System.out.println("factorial");
        double numero = 0.0;
        double expResult = 1.0;
        double result = MyUtils.factorial(numero);
        assertEquals(expResult, result, 0);
    }
    @Test
    public void testFactorial3() {
        System.out.println("factorial");
        double numero = -10.0;
        double expResult = -1.0;
        double result = MyUtils.factorial(numero);
        assertEquals(expResult, result, 0);
    }
    
}
