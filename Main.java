/**
 * @author Ahmet Batuhan YÜRÜDÜR
 * 2024
 */


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Code chooses a random number and user tries to guess.

        // We need to call the Scanned and Random classes.
        Scanner input = new Scanner(System.in);
        Random rand= new Random();

        // Explaining the game to the user.
        System.out.println("Are you a fortune teller? Prove it!");
        System.out.println("Guess the number between 0 - 50");
        System.out.println("----------------------------------");
        System.out.println("Enter your guess now: ");

        // Detecting variables
        int randomNumber, guess;
        randomNumber = rand.nextInt(51);
        guess = input.nextInt();

        // Starting the game with while loop.

        while (true){
            if (randomNumber == guess){
                System.out.println("You NAILED IT! Number is " + randomNumber);
                break;
            }else if (guess < 0 || guess > 50){
                System.out.println("Guess can not be negative or bigger than 50");
                System.out.println("Enter your guess: ");
                guess = input.nextInt();
            }else {
                System.out.println("Try again: ");
                guess = input.nextInt();
            }
        }
    }
}