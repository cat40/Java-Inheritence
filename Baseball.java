
/**
 * Write a description of class Basketball here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Baseball extends Sport
{
    private int percentage, rbi, hr;
    private static String name = "Baseball";
    private Scanner input = new Scanner(System.in);
    
    /**
     * Constructor for objects of class Basketball
     */
    public Baseball(int wins, int losses, int ties)
    {
        super(wins, losses, ties);
        System.out.print("Enter his/her batting percentage:");
        this.percentage = input.nextInt();
        System.out.print("Enter his/her RBI's made:");
        this.rbi = input.nextInt();
        System.out.print("Enter his/her homeruns made:");
        this.hr = input.nextInt();
    }
        
    public String printStats() {
        String output = "";
        output += "Their win percentage is " + (this.getWins() / (this.getWins() + this.getLosses() + this.getTies())) + "%\n";
        output += "They have " + rbi + " rbi's with a " + percentage + "% batting average\n";
        output += "They have " + hr + " homeruns";
        return(output);
    }
    
    public String getName() {
        return(name);
    }
    
}
