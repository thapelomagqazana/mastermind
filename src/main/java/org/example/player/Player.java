package org.example.player;

import org.example.Main;
import org.example.guesser.Guess;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Scanner;

/**
 * The {@code Player} class represents a player in a Mastermind game.
 * It allows the player to make guesses by taking input from the console.
 */
public class Player {

    private Scanner scanner;
    private static final Logger LOGGER = LoggerFactory.getLogger(Player.class);
    private InputStream input;

    public Player(Scanner scanner) {
        this.scanner = Objects.requireNonNull(scanner, "scanner must not be null");
    }

    public Player(InputStream in)
    {
        this.input = in;
    }

    /**
     * Gets a guess from the player by taking input from the console.
     *
     * @return A Guess object representing the player's input.
     */
    public Guess makeGuess() {
        String guess = "";
        try {
            // Prompt the player for a guess
            LOGGER.info("Enter a guess:");

            // Read the player's input from the console
            guess = scanner.nextLine();

        } catch (NoSuchElementException e) {
            LOGGER.error("There's no input from the user.");
        }
//        finally {
//            scanner.close();
//        }
        return new Guess(guess);
    }


}
