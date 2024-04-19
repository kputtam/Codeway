import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1; // Generate a random number between 1 and 100
        Scanner scanner = new Scanner(System.in);
        int guess;
        int attempts = 0; // Initialize the number of attempts

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100:");

        while (true) {
            guess = scanner.nextInt();
            attempts++; // Increment the attempt count

            if (guess == numberToGuess) {
                System.out.println("Congratulations! You guessed the number!");
                break; // Exit the loop when the correct number is guessed
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low. Try again:");
            } else {
                System.out.println("Your guess is too high. Try again:");
            }

            // Limit the number of attempts (you can adjust this as needed)
            if (attempts >= 10) {
                System.out.println("Sorry, you've reached the maximum number of attempts.");
                break;
            }
        }

        // Display the user's score (number of attempts taken)
        System.out.println("Your score: " + attempts + " attempts");

        // Ask if the user wants to play again
        System.out.println("Do you want to play again? (yes/no)");
        String playAgain = scanner.next().toLowerCase();
        if (playAgain.equals("yes")) {
            main(args); // Restart the game
        } else {
            System.out.println("Thank you for playing!");
        }

        scanner.close(); // Close the Scanner object
    }
}
