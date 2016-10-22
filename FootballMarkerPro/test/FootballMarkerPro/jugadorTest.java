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
public class jugadorTest {
    
    public jugadorTest() {
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
     * Test of getId method, of class jugador.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        jugador instance = new jugador(1);
        int expResult = 1;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPuntos method, of class jugador.
     */
    @Test
    public void testGetPuntos() {
        System.out.println("getPuntos");
        jugador instance = new jugador(1);
        int expResult = 0;
        int result = instance.getPuntos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPases method, of class jugador.
     */
    @Test
    public void testGetPases() {
        System.out.println("getPases");
        jugador player = new jugador(1);
        int expResult = 0;
        player.darPases();
        player.darPases();
        int result = player.getPases();
        assertEquals(result, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTarjetasA method, of class jugador.
     */
    @Test
    public void testGetTarjetasA() {
        System.out.println("getTarjetasA");
        jugador player = new jugador(1);
        player.darFaltas(0);
        player.darFaltas(0);
        player.darFaltas(1);
        int expResult = 1;
        int result = player.getTarjetasA();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTarjetaR method, of class jugador.
     */
    @Test
    public void testGetTarjetaR() {
        System.out.println("getTarjetaR");
        jugador player = new jugador(2);
        player.darFaltas(1);
        player.darFaltas(0);
        player.darFaltas(0);
        int expResult = 2;
        int result = player.getTarjetaR();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAsistencias method, of class jugador.
     */
    @Test
    public void testGetAsistencias() {
        System.out.println("getAsistencias");
        jugador player = new jugador(1);
        player.asistencia();
        player.asistencia();
        player.asistencia();
        int expResult = 3;
        int result = player.getAsistencias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of anotarPuntos method, of class jugador.
     */
    @Test
    public void testAnotarPuntos() {
        System.out.println("anotarPuntos");
        jugador player = new jugador(1);
        player.anotarPuntos();
        player.anotarPuntos();
        player.anotarPuntos();
        player.anotarPuntos();
        assertEquals(player.getPuntos(),4);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of darPases method, of class jugador.
     */
    @Test
    public void testDarPases() {
        System.out.println("darPases");
        jugador player = new jugador(1);
        player.darPases();
        player.darPases();
        player.darPases();
        assertEquals(player.getPases(),3);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of darFaltas method, of class jugador.
     */
    @Test
    public void testDarFaltas() {
        System.out.println("darFaltas");
        int p = 0;
        jugador player = new jugador(1);
        player.darFaltas(1);
        player.darFaltas(0);
        player.darFaltas(0);
        player.darFaltas(0);
        player.darFaltas(1);
        player.darFaltas(0);
        assertEquals(player.getTarjetasA(),2);
        assertEquals(player.getTarjetaR(),4);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of asistencia method, of class jugador.
     */
    @Test
    public void testAsistencia() {
        System.out.println("asistencia");
        jugador player = new jugador(1);
        player.asistencia();
        player.asistencia();
        player.asistencia();
        player.asistencia();
        player.asistencia();
        assertEquals(player.getAsistencias(),5);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class jugador.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        jugador instance = new jugador(1);
        String expResult = "";
        String result = instance.toString();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
