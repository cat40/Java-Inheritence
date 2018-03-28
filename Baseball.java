
/**
 * Write a description of class Basketball here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Baseball extends Sport
{
    private int percentage, rbi, hr;
    private static String name = "Baseball";

    /**
     * Constructor for objects of class Basketball
     */
    public Baseball(int wins, int losses, int ties, int percentage, int rbi, int hr)
    {
        super(wins, losses, ties);
        this.percentage = percentage;
        this.rbi = rbi;
        this.hr = hr;
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
