import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(10) + 1;
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a guess
        System.out.print("Guess the number between 1 and 10: ");
        
        // Check if the input is valid
        if (input.hasNextInt()) {
            int guess = input.nextInt();
            if (guess < 1 || guess > 10) {
                System.out.println("Invalid guess: the number must be between 1 and 10.");
            } else {
                // Check if the guess is correct
                if (guess == number) {
                    System.out.println("Congratulations, you guessed the number!");
                } else if (guess < number) {
                    System.out.println("Sorry, your guess is too low. The number was " + number + ".");
                } else {
                    System.out.println("Sorry, your guess is too high. The number was " + number + ".");
                }
            }
        } else {
            System.out.println("Invalid guess: please enter a number.");
        }
    }
}
