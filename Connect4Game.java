package Core;
import java.util.Random;
/** Connect4Game implements a game of connect 4
 * where the user interface is handled in a separate class.
 * This class handles all the internal logic of the game and
 * will validate each move, check for the win condition
 * and store the values for each part of the game board
 * the game board is a 6 by 7 array of int which represent
 * an unused spot on the board. 
 * and whether player 2 or 1 has placed a piece there
 * @author brads
 */
public class Connect4Game {
    int[][] gameBoard;
    int playerTurn;
    int[] previousMove;
    
    
    
    /** Constructor takes no parameters
     *  initializes the game board values to 0
     *  sets playerTurn to either 1 or 2 using a random number generator
     */
    public Connect4Game(){
        Random ran = new Random();
        gameBoard = new int[6][7];
        playerTurn =  ran.nextInt(2) + 1;
        previousMove = new int[]{0, 0};
        
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 7; j++){
                gameBoard[i][j] = 0;
            }
        }
    }
    
    /** returns a deep copy of gameBoard
     * used for displaying the game board
     * deep copy ensures UI program won't alter the game board values
     * @return int[][] 
     */
    public int[][] getGameBoard(){
        
        int[][] gameBoardCopy = new int[6][7];
        
        for(int i = 0; i < 6; i++){
            for (int j = 0; j < 7; j++){
                gameBoardCopy[i][j] = gameBoard[i][j];
            }
        }
        
        return gameBoardCopy;
    }
    
    /** getPlayerTurn returns the current player value (1 or 2)
     * 
     * @return int 
     */
    public int getPlayerTurn(){
        return playerTurn;
    }
    
    /** isValid(int col) returns true when the top row
     * at the specified column is set to 0 (meaning the column isn't full)
     * @param col
     * @return boolean
     */
    public boolean isValid(int col){
        return gameBoard[5][col] == 0;
    }
    
    /** changePlayer alternates the value of changePlayer
     *  logic for when to change player is handled in make move
     * when a move is valid makeMove() will call changePlayer()
     */
    public void changePlayerTurn(){
        if(playerTurn == 1)
            playerTurn = 2;
        else if(playerTurn == 2)
            playerTurn = 1;
    }
    
    /**makeMove attempts to make a move at the specified location
     * must check that the selected column isn't already full
     * if not, will make the move then validate that the game is
     * or is not over (checks for a win)
     * returns true if a move was valid
     * returns false if move is invalid
     * @param col
     * @return boolean 
     */
    public boolean makeMove(int col){
        if(isValid(col)){
            addPiece(col);
            return true;
        }
        
        //return false is only reached if a move cannot be made
        return false;
    }
    
    /**addPiece is a helper method for makeMove
     * has logic for placing a piece within a column
     * after makeMove validates that this is possible
     * 
     * @param col 
     */
    public void addPiece(int col){
        for(int i = 0; i < 6; i++){
            if(gameBoard[i][col] == 0){
                gameBoard[i][col] = playerTurn;
                previousMove[0] = i;
                previousMove[1] = col;
                break;
            }
        }
        
    }
    
    /** checkStalemate() returns true if the entire game board is
     * filled and no more moves can be made
     * returns false otherwise
     * 
     * @return boolean 
     */
    public boolean checkStalemate(){
        for(int i = 0; i < 7; i++){
            if(gameBoard[5][i] == 0)
                return false;
        }
        
        return true;
    }
    
    /** checkForWin() calls several helper methods
     * to determine if the win condition of connect4 has been met
     * if a win is found it terminates by returning true
     * if all conditions are checked and no win is found it returns false
     * @return boolean 
     */
    public boolean checkForWin(){
        if(checkVertical())
            return true;
        else if(checkHorizontal())
            return true;
        else if(checkDiagonalBottomUp())
            return true;
        else if(checkDiagonalTopDown())
            return true;
        
        //return false is only reached if a win is not found
        return false;
    }
    
    
    /** checks for 4 pieces in the -right direction
     *  returns false if move is impossible with given dimensions
     *  returns true if 4 pieces of the same type are found in a row
     * 
     * @return boolean 
     */
    public boolean checkHorizontal(){
        int row = previousMove[0];
        int col = previousMove[1];
        int type = gameBoard[row][col];
        int winCounter = 0;
        
        col = 0;
        
        while(col < 7){
            if (type == gameBoard[row][col])
                winCounter += 1;
            else
                winCounter = 0;
            
            if (winCounter == 4)
                return true;
            
            col ++;
        }
        
        return false;
    }
    
    /** checks for 4 pieces in the down - right direction
     *  returns false if move is impossible with given dimensions
     *  returns true if 4 pieces of the same type are found in a row
     * 
     * @return boolean 
     */
    public boolean checkDiagonalBottomUp(){
        int row = previousMove[0];
        int col = previousMove[1];
        int type = gameBoard[row][col];
        int winCounter = 0;
        
        if(row <= col)
        {
            col = col - row;
            row = row - row;
            
        }
        else if (col < row){
            row = row - col;
            col = col - col;
        }
        
        
        while(row < 6 && col < 7){
            if (type == gameBoard[row][col])
                winCounter += 1;
            else
                winCounter = 0;
            
            if (winCounter == 4)
                return true;
            row++;
            col++;
        }
        
        return false;
    }
    
    public boolean checkDiagonalTopDown(){
        int row = previousMove[0];
        int col = previousMove[1];
        int type = gameBoard[row][col];
        int winCounter = 0;
        
        if(row <= (6-col))
        {
            col = col + row;
            row = row - row;
            
        }
        else if ((6-col) < row){
            row = row - (6-col);
            col = col + (6-col);
        }
        
        
        while(row < 6 && col >= 0){
            if (type == gameBoard[row][col])
                winCounter += 1;
            else
                winCounter = 0;
            
            if (winCounter == 4)
                return true;
            row++;
            col--;
            
        }
        
        
        
        return false;
    }
    
    /** checks for 4 pieces in the -down direction
     *  returns false if move is impossible with given dimensions
     *  returns true if 4 pieces of the same type are found in a row
     * 
     * @return boolean 
     */
    public boolean checkVertical(){
        int row1 = previousMove[0];
        int col = previousMove[1];
        int type = gameBoard[row1][col];
        int winCounter = 0;
        
        int row = 0;
        
        while(row < 6){
            if (type == gameBoard[row][col])
                winCounter += 1;
            else
                winCounter = 0;
            
            if (winCounter == 4)
                return true;
            
            row ++;
            
        }
        
        return false;
    }
    
}
