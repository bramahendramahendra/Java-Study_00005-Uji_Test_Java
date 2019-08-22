
package junit.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class JUnitTestIT {
    
    public JUnitTestIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class JUnitTest.
     */
    @Test
    public void testAddString() {
        JUnitTest test = new JUnitTest();
        
        String result = test.addString("Brama", "Hendra");
        assertEquals("BramaHendra", result);
       
    }
    
}
