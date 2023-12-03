package Internship;
import java.util.Scanner;
import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int totalAttempts = 0;
        int totalRounds = 0;
        int bestScore = Integer.MAX_VALUE;

        System.out.println("Welcome to the Guess the Number game!");

        while (playAgain) {
            totalRounds++;
            int attempts = 0;
            int numberToGuess = random.nextInt(100) + 1;
            System.out.println("\nRound " + totalRounds + "! Guess a number between 1 and 100.");

            while (true) {
                try {
                    System.out.print("Enter your guess: ");
                    int userGuess = scanner.nextInt();
                    attempts++;

                    if (userGuess == numberToGuess) {
                        System.out.println("Congratulations! You've guessed the number " + numberToGuess + " in " + attempts + " attempts.");
                        totalAttempts += attempts;
                        if (attempts < bestScore) {
                            bestScore = attempts;
                        }
                        break;
                    } else if (userGuess < numberToGuess) {
                        System.out.println("Too low! Try a higher number.");
                    } else {
                        System.out.println("Too high! Try a lower number.");
                    }

                    if (attempts == 7) {
                        System.out.println("Sorry, you've reached the maximum number of attempts. The number was " + numberToGuess + ".");
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Please enter a valid number.");
                    scanner.nextLine();
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            playAgain = playAgainInput.startsWith("y");
        }

        double averageAttempts = (double) totalAttempts / totalRounds;
        System.out.println("\nGame Over! You played " + totalRounds + " rounds.");
        System.out.println("Your average attempts per round: " + averageAttempts);
        System.out.println("Your best score: " + bestScore + " attempts.");

        scanner.close();
    }
}


