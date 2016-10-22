/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FootballMarkerPro;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Manuel
 */
public class MenuTest {
    
    public MenuTest() {
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
     * Test of getEquipo method, of class Menu.
     */
    @Test
    public void testGetEquipo() {
        System.out.println("getEquipo");
        String liga = "España";
        Menu instance = new Menu();
        String[] expResult = {"Real madrid","Barcelona","Atletico de Madrid"};
        String[] result = instance.getEquipo(liga);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Menu.
     */
    @Test
    public void testMain() {
        //System.out.println("main");
        //String[] args = null;
        //Menu.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
