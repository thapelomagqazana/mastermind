package org.example.player;

import org.example.guesser.Guess;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * The {@code Player} class represents a player in a Mastermind game.
 * It allows the player to make guesses by taking input from the console.
 */
public class Player {

    private Scanner scanner;

    public Player(Scanner scanner) {
        this.scanner = scanner;
    }


    /**
     * Gets a guess from the player by taking input from the console.
     *
     * @return A Guess object representing the player's input.
     */
    public Guess makeGuess() {
        String guess = null;
        try {
            // Prompt the player for a guess
//            System.out.println("Enter a guess:");

            // Read the player's input from the console
            guess = scanner.nextLine();

        } catch (NoSuchElementException e) {
            // Handle the case where input is not available
        }
        return new Guess(guess);
    }
}
