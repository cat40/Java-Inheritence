
/**
 * Write a description of class Basketball here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Basketball extends Sport
{
    private int percentage, scored, assists;
    private static String name = "Basketball";
    private Scanner input = new Scanner(System.in);
    
    /**
     * Constructor for objects of class Basketball
     */
    public Basketball(int wins, int losses, int ties)
    {
        super(wins, losses, ties);
        System.out.print("Enter his/her shooting percentage:");
        this.percentage = input.nextInt();
        System.out.print("Enter his/her points scored:");
        this.scored = input.nextInt();
        System.out.print("Enter his/her assists made:");
        this.assists = input.nextInt();
    }
        
    public String printStats() {
        String output = "";
        double winP = (double)(this.getWins()) / (double)(this.getWins() + this.getLosses() + this.getTies()) * (double)100;
        output += "Their win percentage is " + winP + "%\n";
        output += "They have scored " + scored + " points with a " + percentage + "% shooting percentage\n";
        output += "They have " + assists + " assists";
        return(output);
    }
    
    public String getName() {
        return(name);
    }
    
}
