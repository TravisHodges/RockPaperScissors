import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args){
     userChoice();
     computerChoice();
    }

    private static void userChoice(){
        Scanner input = new  Scanner(System.in);

        int userInput = 0;

        System.out.println("Rock = 1 " + "Paper = 2 " + "Scissors = 3 ");
        System.out.println("Choose a number 1-3 >>> ");
        userInput = input.nextInt();

        String[] choice = new String[3];
        choice[0] = "Rock";
        choice[1] = "Paper";
        choice[2] = "Scissors";

        if(userInput > 3){
            System.out.println("");
            System.out.println("That is not an option, you lose!! ");
        }

        else if(userInput < 1){
            System.out.println("");
            System.out.println("That is not an option, you lose!! ");
        }

        else if(userInput == 1){
            System.out.println("You chose: " + choice[0]);
        }

        else if(userInput == 2){
            System.out.println("You chose: " + choice[1]);
        }

        else if (userInput == 3){
            System.out.println("You chose: " + choice[2]);
        }

    }

    private static void computerChoice() {
        Random rand = new Random();
        int computerChoice = rand.nextInt(3);

        String[] choice = new String[3];
        choice[0] = "Rock";
        choice[1] = "Paper";
        choice[2] = "Scissors";

        if (computerChoice == 0){
            System.out.println("Computer Chose: " + choice[0]);
        }

        else if (computerChoice == 1){
            System.out.println("Computer Chose: " + choice[1]);
        }

        else if (computerChoice == 2){
            System.out.println("Computer Chose: " + choice[2]);
        }
    }
}
