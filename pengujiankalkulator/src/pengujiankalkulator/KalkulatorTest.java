/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengujiankalkulator;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
 
/**
 *
 * @author awanlabs
 */
public class KalkulatorTest {
    
    Kalkulator kalkulator;
    
    @Before
    public void init(){
        kalkulator=new Kalkulator();
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
