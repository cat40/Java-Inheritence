
/**
 * Write a description of class Sport here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Sport
{
    private int wins, losses, ties;
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
