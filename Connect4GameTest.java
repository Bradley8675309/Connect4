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
public class Connect4GameTest {
    
    Connect4Game instance;
    int[][] expResult = null;
    int[][] result;
    
    public Connect4GameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Connect4Game();
    }
    
    @After
    public void tearDown() {
        instance = null;
        expResult = null;
        result = null;
    }

    /**
     * Test of getGameBoard method, of class Connect4Game.
     */
    @Test
    public void testGetGameBoard() {
        System.out.println("getGameBoard");
        setUp();
        
        int[][] expResult = {{0, 0, 0, 0, 0, 0, 0},
                             {0, 0, 0, 0, 0, 0, 0},
                             {0, 0, 0, 0, 0, 0, 0},
                             {0, 0, 0, 0, 0, 0, 0},
                             {0, 0, 0, 0, 0, 0, 0},
                             {0, 0, 0, 0, 0, 0, 0}};
        int[][] result = instance.getGameBoard();
        assertArrayEquals(expResult, result);
        
        tearDown();
    }

    /**
     * Test of getPlayerTurn method, of class Connect4Game.
     */
    @Test
    public void testGetPlayerTurn() {
        System.out.println("getPlayerTurn");
        setUp();
        
        int expResult = instance.getPlayerTurn();
        if (expResult == 1){
        }
        else if (expResult == 2){
        }
        else{
            fail("The test case is a prototype.");
        }
        
        tearDown();
        
        
    }

    /**
     * Test of isValid method, of class Connect4Game.
     */
    @Test
    public void testSuccessIsValid() {
        System.out.println("getGameBoard");
        setUp();
        
        int[][] expResult = {{0, 0, 0, 0, 0, 0, 0},
                             {0, 0, 0, 0, 0, 0, 0},
                             {0, 0, 0, 0, 0, 0, 0},
                             {0, 0, 0, 0, 0, 0, 0},
                             {0, 0, 0, 0, 0, 0, 0},
                             {0, 0, 0, 0, 0, 0, 0}};
        instance.setGameBoard(expResult);
        boolean isValid = instance.isValid(0);
        assertTrue(isValid);
        tearDown();
    }
    
    public void testFailureIsValid() {
        System.out.println("getGameBoard");
        setUp();
        
        int[][] expResult = {{1, 1, 1, 1, 1, 1, 1},
                             {1, 1, 1, 1, 1, 1, 1},
                             {1, 1, 1, 1, 1, 1, 1},
                             {1, 1, 1, 1, 1, 1, 1},
                             {1, 1, 1, 1, 1, 1, 1},
                             {1, 1, 1, 1, 1, 1, 1}};
        instance.setGameBoard(expResult);
        boolean isValid = instance.isValid(0);
        assertFalse(isValid);
        tearDown();
    }

    /**
     * Test of changePlayerTurn method, of class Connect4Game.
     */
    @Test
    public void testChangePlayerTurn() {
        System.out.println("changePlayerTurn");
        Connect4Game instance = new Connect4Game();
        instance.changePlayerTurn();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeMove method, of class Connect4Game.
     */
    @Test
    public void testMakeMove() {
        System.out.println("makeMove");
        int col = 0;
        Connect4Game instance = new Connect4Game();
        boolean expResult = false;
        boolean result = instance.makeMove(col);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPiece method, of class Connect4Game.
     */
    @Test
    public void testAddPiece() {
        System.out.println("addPiece");
        int col = 0;
        Connect4Game instance = new Connect4Game();
        instance.addPiece(col);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkStalemate method, of class Connect4Game.
     */
    @Test
    public void testCheckStalemate() {
        System.out.println("checkStalemate");
        Connect4Game instance = new Connect4Game();
        boolean expResult = false;
        boolean result = instance.checkStalemate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkForWin method, of class Connect4Game.
     */
    @Test
    public void testCheckForWin() {
        System.out.println("checkForWin");
        Connect4Game instance = new Connect4Game();
        boolean expResult = false;
        boolean result = instance.checkForWin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkHorizontal method, of class Connect4Game.
     */
    @Test
    public void testCheckHorizontal() {
        System.out.println("checkHorizontal");
        Connect4Game instance = new Connect4Game();
        boolean expResult = false;
        boolean result = instance.checkHorizontal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkDiagonalBottomUp method, of class Connect4Game.
     */
    @Test
    public void testCheckDiagonalBottomUp() {
        System.out.println("checkDiagonalBottomUp");
        Connect4Game instance = new Connect4Game();
        boolean expResult = false;
        boolean result = instance.checkDiagonalBottomUp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkDiagonalTopDown method, of class Connect4Game.
     */
    @Test
    public void testCheckDiagonalTopDown() {
        System.out.println("checkDiagonalTopDown");
        Connect4Game instance = new Connect4Game();
        boolean expResult = false;
        boolean result = instance.checkDiagonalTopDown();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkVertical method, of class Connect4Game.
     */
    @Test
    public void testCheckVertical() {
        System.out.println("checkVertical");
        Connect4Game instance = new Connect4Game();
        boolean expResult = false;
        boolean result = instance.checkVertical();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
