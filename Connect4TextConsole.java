package UI;
import Core.Connect4ComputerPlayer;
import Core.Connect4Game;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;

/** Connect4TextConsole is a program that works with Connect4Game to produce 
 a console based UI for the user to play the game with
 includes a main method to drive the program
 method allow user to make selections and interact with the game object
 and the user. The class Connect4Game contains the logic for how the 
 * game operates
 * 
 */
public class Connect4TextConsole{
    
    static boolean useComputerPlayer;
    Connect4ComputerPlayer computerPlayer = new Connect4ComputerPlayer();
    
    public Connect4TextConsole(){
        useComputerPlayer = false;
        
    }
    
    public static void main(String[] args) {
        runGame();
    }
    
    /**The driver for running a connect 4 game from the console.
     * Contains the algorithmic logic for asking for moves
     * and requesting if those moves can be made from the game object.
     * Asks the user if they want 2 human players or 1 human 1 computer player.
     * When the game ends this will also call the appropriate methods
     * to print out the game over text.
     */
    public static void runGame(){
        Scanner scanner = new Scanner(System. in);
        Connect4Game game = new Connect4Game();
        Connect4TextConsole gameUI = new Connect4TextConsole();
        
        
        boolean validSelection = false;
        String inputPlayerType = "O";
        String inputInterface = "O";                
        int nextMove;
        boolean isValidMove = false;
        boolean hasWin = false;
        
        
        
        
        
        while(!validSelection){
            System.out.println("Console (C) or GUI (G) output?");
            
            inputInterface = scanner.nextLine();
            
            if(inputInterface.equals("C") || inputInterface.equals("G")){
                validSelection = true;
            }
            else{
                System.out.println("Only C and G are valid inputs.");
            }
        }
        
        
        
        if(inputInterface.equals("G")){
            //Connect4GUI gameGUI = new Connect4GUI();
            try {
                String[] args = new String[0];
                Application.launch(Connect4GUI.class, args);
            } catch (Exception ex) {
                Logger.getLogger(Connect4TextConsole.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else if(inputInterface.equals("C")){
            validSelection = false;
            
            while(!validSelection){
            System.out.println("Enter P to use 2 human players, C to use 1 human "
                + "and 1 computer player.");
            
            inputPlayerType = scanner.nextLine();
            
            if(inputPlayerType.equals("P") || inputPlayerType.equals("C")){
                validSelection = true;
            }
            else{
                System.out.println("Only P and C are valid inputs.");
            }
            
            if (inputPlayerType.equals("P"))
            useComputerPlayer = false;
            else if(inputPlayerType.equals("C"))
            useComputerPlayer = true;
            }
            
            while(!hasWin){
                nextMove = gameUI.getNextMove(game.getPlayerTurn(), 
                    game.getGameBoard());
                isValidMove = game.makeMove(nextMove);
            
                if(isValidMove){
                    game.changePlayerTurn();
                    hasWin = game.checkForWin();
                }
            
                else if(!isValidMove)
                    gameUI.invalidMove();
            
                if(game.checkStalemate())
                    break;
            }
        
            //above logic changes player if a valid move is made
            //must change player back if that valid move led to a win
            if(hasWin){
                game.changePlayerTurn();
                gameUI.displayWin(game.getPlayerTurn(), game.getGameBoard());
            }
            else
                gameUI.displayStalemate();
    }
        
        
    }
    
    /** getNextMove asks the user for their move choice
     *  in the console. Has logic to ensure the correct input is made
     *  
     * @param player
     * @param gameBoard
     * @return int 
     */
    public int getNextMove(int player, int[][] gameBoard){
        Scanner scanner = new Scanner(System.in);
        
        int col = 0;
        String playerName = "X";
        if (player == 1)
            playerName = "O";
        
        
        
        
        if(player == 1 || (player == 2 && !useComputerPlayer)){
            printGameBoard(gameBoard);
            System.out.println("It's player " + playerName + "'s turn.");
            System.out.println("Please enter the next move, select 1 - 7");
        
            while(col != 1 && 
            col != 2 &&
            col != 3 && 
            col != 4 && 
            col != 5 && 
            col != 6 &&
            col != 7){
            
            while(!scanner.hasNextInt()){
                invalidMove();
                if(scanner.hasNext()){
                    scanner.nextLine();
                }
                }
            
                if(scanner.hasNextInt()){
                    col = scanner.nextInt();
                }
            
                if( col != 1 && 
                col != 2 &&
                col != 3 && 
                col != 4 && 
                col != 5 && 
                col != 6 &&
                col != 7){
                invalidMove();
                }
            }
        }
        
        else if(player == 2 && useComputerPlayer){
            col = computerPlayer.generateMove();
        }
        
        return col-1;
    }
        
    
    
    /**informs user that they made an invalid move
     * 
     */
    public void invalidMove(){
        System.out.println("Invalid move");
    }
    
    /** Prints the final state of the gameBoard
     *  and announces who won the game
     * 
     * @param player
     * @param gameBoard 
     */
    public void displayWin(int player, int[][] gameBoard){
        String playerName = "X";
        if (player == 1)
            playerName = "O";
        
        printGameBoard(gameBoard);
        
        System.out.println("\nPlayer " + playerName + " has won!");
    }
    
    /** if there is a stalemate this method announces that in the console
     * 
     */
    public void displayStalemate(){
        System.out.println("No winner this time! Out of valid moves!");
    }
    
    /** printGameBoard prints out the gameBoard to the console
     *  so the user can see the current game state 
     * 
     * @param gameBoard 
     */
    public void printGameBoard(int[][] gameBoard){
        for(int i = 5; i >= 0; i--){
            System.out.print("|");
            for(int j = 0; j < 7; j++){
                if(gameBoard[i][j] == 0)
                    System.out.print(" |");
                else if (gameBoard[i][j] == 2)
                    System.out.print("X|");
                else if (gameBoard[i][j] == 1)
                    System.out.print("O|");
            }
            System.out.println();
        }
    }
    
    /** Helper method that returns if a computer player is to be used
     * 
     * @return boolean
     */
    public boolean getCompPlay(){
        return useComputerPlayer;
    }
}
