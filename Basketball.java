
/**
 * Write a description of class Basketball here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Basketball extends Sport
{
    private int percentage, scored, assists;
    private static String name = "Basketball";

    /**
     * Constructor for objects of class Basketball
     */
    public Basketball(int wins, int losses, int ties, int percentage, int scored, int assists)
    {
        super(wins, losses, ties);
        this.percentage = percentage;
        this.scored = scored;
        this.assists = assists;
    }
        
    public String printStats() {
        String output = "";
        output += "Their win percentage is " + (this.getWins() / (this.getWins() + this.getLosses() + this.getTies())) + "%\n";
        output += "They have scored " + scored + " points with a " + percentage + "% shooting percentage\n";
        output += "They have " + assists + " assists";
        return(output);
    }
    
    public String getName() {
        return(name);
    }
    
}
