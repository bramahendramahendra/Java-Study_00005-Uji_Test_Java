/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Brama Hendra Mahendra
 */
public class pengujiankalkulatorJUnitTest {
    
    Kalkulator kalkulator;
   
    public pengujiankalkulatorJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        kalkulator = new Kalkulator();
    }
    
    @After
    public void tearDown() {
    }
   
 
    @Test
    public void testKali() {
        assertEquals(20, kalkulator.kali(10, 2),0);
    }
 
    @Test
    public void testBagi() {
        assertEquals(5, kalkulator.bagi(10, 2),0);
    }
 
    @Test
    public void testTambah() {
        assertEquals(12, kalkulator.tambah(10, 2),0);
    }
 
    @Test
    public void testKurang() {
        assertEquals(8, kalkulator.kurang(10, 2),0);
    }
}
