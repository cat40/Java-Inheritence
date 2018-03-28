
/**
 * Write a description of class Soccer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Soccer extends Sport
{
    private int goals, attempts, penalties;
    private static String name = "Soccer";
    public Soccer(int wins, int losses, int ties, int goals, int attempts, int penalties)
    {
        super(wins, losses, ties);
        this.goals = goals;
        this.attempts = attempts;
        this.penalties = penalties;
    }
    
    public String printStats()
    {
        return String.format("wins:\t%d\nlosses:\t%d\nties:\t%d\n\n"+
                             "goals:\t%d\ngoal attempts:\t%d\npenalties\t%d", getWins(), getLosses(), getTies(), goals, attempts, penalties);
    }
    
    public String getName()
    {
        return name;
    }
}
