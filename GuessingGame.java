import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String playAgain = "yes";
        while (playAgain.equals("yes")) {
        int secretNumber = random.nextInt(50) + 1;
        int guess = 0;
        int attempts = 0;
        int maxAttempts = 7;
        

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 50.");
        
        
        while (guess != secretNumber ) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            int remainingAttempts = maxAttempts - attempts;
           if (attempts == maxAttempts){
                System.out.println("Sorry, you've used all your attempts. The number was " + secretNumber);
                break;
            }
            else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
                System.out.println("You have " + remainingAttempts + " attempts left.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
                System.out.println("You have " + remainingAttempts + " attempts left.");
            } 
            else {
                System.out.println("Correct! You got it in " + attempts + " attempts!");
            }
        }
        System.out.print("Play again? (yes/no): ");
        playAgain = scanner.next();
        if (guess == secretNumber) {
        int score = (maxAttempts - attempts + 1) * 10;
         System.out.println("You got it in " + attempts + " attempts! Score: " + score);
        }
        if (attempts == 1) {
    System.out.println("Insane! First try!");
} else if (attempts <= 3) {
    System.out.println("Amazing guess!");
} else if (attempts <= 5) {
    System.out.println("Nice work!");
} else {
    System.out.println("You got it!");
}
    }
        scanner.close();

    }
}
