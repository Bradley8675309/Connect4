package Core;
import java.util.Random;

/** Connect4ComputerClass implements a random number generator to generate 
 * potential game board moves for Connect4Game
 */
public class Connect4ComputerPlayer {
    
    public Connect4ComputerPlayer(){
        
    }
    
    /**Generates a random number between 1 and 7 to mimic a human player
     * making a selection. 
     * Has no logic, just produces a random number.
     * @return 
     */
    public int generateMove(){
        Random ran = new Random();
        return ran.nextInt(7) + 1;
    }
}
