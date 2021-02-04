
/**
 * Write a description of class Craps here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Craps
{
    public static void main(String[] args)
    {
        Die d1 = new Die();
        Die d2 = new Die();
        Scanner in = new Scanner(System.in);
        while (true)
        {
            int roundCounter = 1;
            System.out.println("Want to play craps?!");
            String startGame = in.next();
            while (!startGame.equals("no"))
            {
                System.out.println("Ok YAY! Do you want me to explain the rules?");
                String explainRules = in.next();
                if (explainRules.equals("yes"))
                {
                    System.out.println("RULES OF CRAPS:");
                    System.out.println("if you roll a 7 or 11 on the first round, you win!");
                    System.out.println("If you roll a 2, 3, or 12 on the first round, you lose!");
                    System.out.println("If you roll anything else, your roll numberis now your point, and you roll again"); 
                    System.out.println("If you roll your point on the next round, you win!");
                    System.out.println("If you roll a 7 on the next round you lose! Keep rolling until you win or lose!");
                }
                System.out.print("Press <Enter> to roll...");
                String pause = in.nextLine();
                int firstRoll = (int) (Math.random() * 12 + 1); 
                System.out.println("First roll: " + firstRoll);
                if (firstRoll == 7 || firstRoll == 11)
                {
                    System.out.println("WOW! You won on the first round congratulations!");
                }
                else if (firstRoll == 2 || firstRoll == 3 || firstRoll == 12)
                {
                    System.out.println("Dang, you lost on the first round :(");
                }
                else 
                {
                    System.out.println("Ok, you didn't win or lose yet!"); 
                    System.out.println("Your point number is now:" + firstRoll);
                    System.out.println("Let's move on to the next round");
                    int secondRoll = (int) (Math.random() * 12 + 1); 
                    System.out.println("Second roll: " + secondRoll);
                    if (secondRoll != 7 && secondRoll != firstRoll)
                    {
                        System.out.println("Ok, you still didn't win or lose yet!");
                        int nextRoll = (int) (Math.random() * 12 + 1);
                        if (nextRoll == firstRoll)
                        {
                            System.out.println("You finally won! Congratulations");
                        }
                        else if(nextRoll == 7)
                        {
                            System.out.println("You lost, sorry!");
                        }
                    }
                    if (secondRoll == 7)
                    {
                        System.out.println("Sorry! You lost");
                    }
                    else if (secondRoll == firstRoll)
                    {
                        System.out.println("Congrats! You won!");
                    }
                    System.out.println("Want to play again?");
                    String playAgain = in.next();
                    if (playAgain.equals("no"))
                    {
                        break;
                    }

                }
                break;
            }
            break;
        }
    }
}