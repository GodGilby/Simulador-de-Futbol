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
public class CampoTest {
    
    public CampoTest() {
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
     * Test of SetEquipos method, of class Campo.
     */
    @Test
    public void testSetEquipos() {
        System.out.println("SetEquipos");
        String teamA = "One";
        String teamB = "Two";
        Campo instance = new Campo();
        instance.SetEquipos(teamA, teamB);
        instance.teams[0].setNombre(teamA);
        instance.teams[1].setNombre(teamB);
        String name1 = instance.teams[0].getNombre();
        String name2 = instance.teams[1].getNombre();
        assertEquals(name1,"One");
        assertEquals(name2,"Two");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of change method, of class Campo.
     */
    @Test
    public void testChange() {
        System.out.println("change");
        int n = 0;
        int expResult = 1;
        int result = Campo.change(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDatosJugadores method, of class Campo.
     */
    @Test
    public void testGetDatosJugadores() {
        System.out.println("getDatosJugadores");
        equipo team = new equipo("");
        Campo instance = new Campo();
        String expResult = "";
        String result = instance.getDatosJugadores(team);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Campo.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        //String[] args = null;
        //Campo.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
