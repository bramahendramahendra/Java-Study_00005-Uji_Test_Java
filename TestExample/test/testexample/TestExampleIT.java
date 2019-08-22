
package testexample;

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
public class TestExampleIT {
    
    public TestExampleIT() {
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
     * Test of main method, of class TestExample.
     */
    @Test
    public void testAddString() {
        TestExample test1 = new TestExample();
        
        String result1 = test1.addString("Hello", "World");
        assertEquals("HelloWorld", result1);
       
    }
    
}
