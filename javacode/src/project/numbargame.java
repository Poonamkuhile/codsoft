package project;
import java.util.Random;

import java.util.Scanner;



public class numbargame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int numberOfRounds = 0;
        int totalAttempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You have to guess a number between " + minRange + " and " + maxRange);

        while (true) {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            boolean hasGuessedCorrectly = false;

            System.out.println("Round " + (numberOfRounds + 1));

            while (!hasGuessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                scanner.nextLine();  // Consume the newline character

                attempts++;

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You've guessed the correct number in " + attempts + " attempts.");
                    totalAttempts += attempts;
                    numberOfRounds++;
                    hasGuessedCorrectly = true;
                } else if (userGuess < targetNumber) {
                    System.out.println("Your guess is too low.");
                } else {
                    System.out.println("Your guess is too high.");
                }
            }

            System.out.print("Do you want to play another round? (yes/no): ");
            String playAgain = scanner.nextLine().trim();
            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }

        scanner.close();

        System.out.println("Game Over! You played " + numberOfRounds + " round(s) and your average attempts per round was: " + (double) totalAttempts / numberOfRounds);;
    }
}
		// TODO Auto-generated method stub

	


