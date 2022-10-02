import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);

        String player1;
        String player2;
        String playAgain;
        boolean playing =true;

        do {

            System.out.print("Player 1 enter your move [R,P,S]: ");
            player1 = in.nextLine();
            System.out.print("Player 2 enter your move [R,P,S]: ");
            player2 = in.nextLine();

            if (player1.equals(player2))
            {
                System.out.println("Both players had the same move you tie");
            } else if (player1.equalsIgnoreCase("R"))
            {
                if (player2.equalsIgnoreCase("P"))
                {
                    System.out.println("R x P Paper covers rock! Player 2 wins");
                } else if (player2.equalsIgnoreCase("S"))
                {
                    System.out.println("R x S Rock breaks Scissors! Player 1 wins");
                }else {
                    System.out.println("You have entered an invalid input");
                }
            }
            else if (player1.equalsIgnoreCase("P"))
            {
                if (player2.equalsIgnoreCase("R"))
                {
                    System.out.println("P x R Paper covers Rock. Player 1 wins");
                } else if (player2.equalsIgnoreCase("S"))
                {
                    System.out.println("P x S Scissors cuts paper. Player 2 wins");
                }else {
                    System.out.println("You have entered an invalid input");
                }
            }
            else if (player1.equalsIgnoreCase("S"))
            {
                if (player2.equalsIgnoreCase("P"))
                {
                    System.out.println("S x P Scissors cuts paper. Player 1 wins");
                } else if (player2.equalsIgnoreCase("R"))
                {
                    System.out.println("S x R Rock breaks Scissors. Player 2 wins");
                }else {
                    System.out.println("You have entered an invalid input");
                }
            }
            else {
                System.out.println("You have entered an invalid input");
            }

            System.out.print("Do you want to play again [Y,N]: ");
            playAgain = in.nextLine();
            if (playAgain.equalsIgnoreCase("N")) {
                playing = false;

            }
            else if (playAgain.equalsIgnoreCase("Y"))
            {
                playing = true;


            }
        } while(playing);


    }


}
 