/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FootballMarkerPro;

import java.util.ArrayList;
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
public class equipoTest {
    
    public equipoTest() {
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
     * Test of initJugadores method, of class equipo.
     */
    @Test
    public void testInitJugadores() {
        System.out.println("initJugadores");
        equipo team = new equipo("");
        team.initJugadores();
        for (int i=0;i<14;i++){
            assertEquals(team.getJugadores()[i].getId(),i);
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class equipo.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        equipo team = new equipo("TeamName");
        String expResult = "TeamName";
        String result = team.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class equipo.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String name = "Aguilas";
        equipo team = new equipo("");
        team.setNombre(name);
        assertEquals(team.getNombre(),name);
        team.setNombre("Fisicos");
        assertEquals(team.getNombre(),"Fisicos");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getJugadores method, of class equipo.
     */
    @Test
    public void testGetJugadores() {
        System.out.println("getJugadores");
        equipo team = new equipo("");
        jugador[] players = new jugador[14];
        team.initJugadores();
        for (int i=0;i<14;i++){
            players[i] = new jugador(i);
        }
        jugador[] result = team.getJugadores();
        for (int i=0;i<14;i++){
            assertEquals(players[i].getId(),result[i].getId());
            assertEquals(players[i].getPases(),result[i].getPases());
        }
        //assertArrayEquals(players, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTarjetasAmarillas method, of class equipo.
     */
    @Test
    public void testGetTarjetasAmarillas() {
        System.out.println("getTarjetasAmarillas");
        equipo team = new equipo("");
        team.falta(new ArrayList<String>(), 1, 0);
        int expResult = 0;
        int result = team.getTarjetasAmarillas();
        assertEquals(expResult, result,1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTarjetasRojas method, of class equipo.
     */
    @Test
    public void testGetTarjetasRojas() {
        System.out.println("getTarjetasRojas");
        equipo team = new equipo("");
        team.falta(new ArrayList<String>(), 1, 0);
        int expResult = 0;
        int result = team.getTarjetasRojas();
        assertEquals(expResult, result, 1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTirosdeE method, of class equipo.
     */
    @Test
    public void testGetTirosdeE() {
        System.out.println("getTirosdeE");
        equipo team = new equipo("");
        team.falta(new ArrayList<String>(), 0, 0);
        int expResult = 0;
        int result = team.getTirosdeE();
        assertEquals(expResult, result,1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSaquedeB method, of class equipo.
     */
    @Test
    public void testGetSaquedeB() {
        System.out.println("getSaquedeB");
        equipo instance = new equipo("");
        int expResult = 0;
        int result = instance.getSaquedeB();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTirofallido method, of class equipo.
     */
    @Test
    public void testGetTirofallido() {
        System.out.println("getTirofallido");
        equipo instance = new equipo("");
        int expResult = 0;
        int result = instance.getTirofallido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getBalonesPerdidos method, of class equipo.
     */
    @Test
    public void testGetBalonesPerdidos() {
        System.out.println("getBalonesPerdidos");
        equipo instance = new equipo("");
        int expResult = 0;
        int result = instance.getBalonesPerdidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPases method, of class equipo.
     */
    @Test
    public void testGetPases() {
        System.out.println("getPases");
        equipo instance = new equipo("");
        int expResult = 0;
        int result = instance.getPases();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPuntos method, of class equipo.
     */
    @Test
    public void testGetPuntos() {
        System.out.println("getPuntos");
        equipo instance = new equipo("");
        int expResult = 0;
        int result = instance.getPuntos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPosicionA method, of class equipo.
     */
    @Test
    public void testGetPosicionA() {
        System.out.println("getPosicionA");
        equipo instance = new equipo("");
        int expResult = 0;
        int result = instance.getPosicionA();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of swap method, of class equipo.
     */
    @Test
    public void testSwap() {
        System.out.println("swap");
        int A = 0;
        int B = 1;
        equipo team = new equipo("");
        team.swap(A, B);
        assertEquals(team.getJugadores()[0].getId(),1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of tiroalaPorteria method, of class equipo.
     */
    @Test
    public void testTiroalaPorteria() {
        System.out.println("tiroalaPorteria");
        ArrayList<String> historial = new ArrayList<>();
        int min = 0;
        int secs = 0;
        equipo team = new equipo("");
        boolean expResult = false;
        boolean result = team.tiroalaPorteria(historial, min, secs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pases method, of class equipo.
     */
    @Test
    public void testPases() {
        System.out.println("pases");
        equipo team = new equipo("");
        boolean expResult = false;
        boolean result = team.pases();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of falta method, of class equipo.
     */
    @Test
    public void testFalta() {
        System.out.println("falta");
        ArrayList<String> historial = new ArrayList<>();
        int min = 0;
        int secs = 0;
        equipo team = new equipo("");
        team.falta(historial, min, secs);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of saque method, of class equipo.
     */
    @Test
    public void testSaque() {
        System.out.println("saque");
        ArrayList<String> historial = new ArrayList<>();
        int min = 0;
        int secs = 0;
        equipo instance = new equipo("");
        boolean expResult = false;
        boolean result = instance.saque(historial, min, secs);
        ///assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
