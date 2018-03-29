
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Player
{
    private ArrayList<Sport> sports = new ArrayList<Sport>();
    private String name;
    public Player(String name)
    {
        this.name = name;
    }
    
    public void addSport(Sport sport)
    {
        sports.add(sport);
    }
    
    public void printStats()
    {
        System.out.printf("%f's statistics:\n\n");
        for(Sport sport : sports)
        {
            System.out.println(sport.printStats()+"\n");
        }
    }
}
