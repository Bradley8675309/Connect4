/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author brads
 */
public class Connect4ComputerPlayerTest {
    Connect4ComputerPlayer player;
    int testInt;
    
    public Connect4ComputerPlayerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
            
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        player = new Connect4ComputerPlayer();
        testInt = 0;
    }
    
    @After
    public void tearDown() {
        player = null;
        testInt = 0;
    }

    /**
     * Test of generateMove method, of class Connect4ComputerPlayer.
     */
    @Test
    public void testGenerateMove() {
        System.out.println("generateMove");
        setUp();
        
        boolean withinParam = true;
        testInt = player.generateMove();
        if(testInt < 1 || testInt >7){
            withinParam = false;}
        
        assertTrue(withinParam);
        
        tearDown();
    }
    
}
