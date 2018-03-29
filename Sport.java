
/**
 * Write a description of class Sport here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public abstract class Sport
{
    private int wins, losses, ties;
    public final static Scanner input = new Scanner(System.in);
    public Sport(int wins, int losses, int ties)
    {
        this.wins = wins;
        this.losses = losses;
        this.ties = ties;
    }
       
    public abstract String printStats();
    
    public abstract String getName();
    
    public int getWins()
    {
        return wins;
    }
    
    public int getLosses()
    {
        return losses;
    }
    
    public int getTies()
    {
        return ties;
    }
}
