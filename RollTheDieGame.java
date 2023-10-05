package cwiczeniaJava;

import java.util.Random;

public class RollTheDieGame {
    public static void main(String[] args) {
        int currentPosition = 0;
        int maxSpaces = 20; // Maximum number of spaces on the game board
        int rolls = 0; //Number of rolls


        Random random = new Random();
        while (currentPosition < maxSpaces && rolls < 5) {
            int diceRoll = random.nextInt(6) + 1; // Generate a random number between 1 and 6
            System.out.println("Roll " + (rolls + 1) + ": You rolled a " + diceRoll);
            currentPosition += diceRoll; // Advance the user that number of spaces

            if (currentPosition > maxSpaces){
                currentPosition = maxSpaces; // Ensure the user doesn't go beyond the maximum number of spaces
            }
            System.out.println("You are now at space " + currentPosition + " on the game board.");

            int spacesToGo = maxSpaces - currentPosition;
            System.out.println("You have " + spacesToGo + " more spaces to go to win.");

            rolls++;

        }
        if (currentPosition == maxSpaces) {
            System.out.println("Congratulations! You've reached the end of the game board. You win!");
        } else {
            System.out.println("Sorry, you didn't reach the end of the game board. You lose.");
        }
    }
}
