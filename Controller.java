
/**
 * Write a description of class Controller here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Controller
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the player's name: ");
        String name = input.nextLine();
        System.out.print("Enter the player's wins: ");
        int wins = input.nextInt();
        System.out.print("Enter the player's losses: ");
        int losses = input.nextInt();
        System.out.print("Enter the player's ties: ");
        int ties = input.nextInt();
        System.out.print("Enter the player's sport(Basketball, Baseball, or Soccer): ");
        Sport sport;
        Player p = new Player(name);
        String goAgain;
        do
        {
            loop:
            while(true)
            {
                String sportName = input.nextLine().toLowerCase();
                switch(sportName)
                {
                    case "basketball":
                    sport = new Basketball(wins, losses, ties);
                    break loop;
                    case "baseball":
                    sport = new Baseball(wins, losses, ties);
                    break loop;
                    case "soccer":
                    sport = new Soccer(wins, losses, ties);
                    break loop;
                    default:
                    System.out.println("you have entered an invalid sport. Try again or else");
                }
            }
            p.addSport(sport);
            System.out.println("Enter a sport again?");
            goAgain = input.nextLine();
        }while(!goAgain.equalsIgnoreCase("no"));

        p.printStats();
    }
}
