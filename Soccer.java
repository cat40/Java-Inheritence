
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
    public Soccer(int wins, int losses, int ties)
    {
        super(wins, losses, ties);
        System.out.print("Enter the player's goals: ");
        goals = input.nextInt();
        System.out.print("Enter the player's goal attempts: ");
        attempts = input.nextInt();
        System.out.print("Enter the player's penalties: ");
        penalties = input.nextInt();
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
