/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg152011513020materi7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
import org.junit.Test;
//import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;

/**
 *
 * @author Agiftsany Azhar
 */
public class KalkulatorTest {
    
    public KalkulatorTest() {
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
     * Test of tambah method, of class Kalkulator.
     */
    @Test
    public void testTambah() {
        double a = 15.0;
        double b = 5.0;
        Kalkulator instance = new Kalkulator();
        double expResult = 20.0;
        double result = instance.tambah(a, b);
        assertEquals(expResult, result, 0.0);
        System.out.println("tambah      ==> 15+5 = "+result);
    }

    /**
     * Test of kurang method, of class Kalkulator.
     */
    @Test
    public void testKurang() {
        double a = 19.0;
        double b = 5.0;
        Kalkulator instance = new Kalkulator();
        double expResult = 14.0;
        double result = instance.kurang(a, b);
        assertEquals(expResult, result, 0.0);
        System.out.println("kurang      ==> 19-5 = "+result);
    }

    /**
     * Test of kali method, of class Kalkulator.
     */
    @Test
    public void testKali() {
        double a = 12.0;
        double b = 3.0;
        Kalkulator instance = new Kalkulator();
        double expResult = 36.0;
        double result = instance.kali(a, b);
        assertEquals(expResult, result, 0.0);
        System.out.println("kali        ==> 12*3 = "+result);
    }

    /**
     * Test of bagi method, of class Kalkulator.
     */
    @Test
    public void testBagi() {
        double a = 24.0;
        double b = 6.0;
        Kalkulator instance = new Kalkulator();
        double expResult = 4.0;
        double result = instance.bagi(a, b);
        assertEquals(expResult, result, 0.0);
        System.out.println("bagi        ==> 24/6 = "+result);
    }
    
}
