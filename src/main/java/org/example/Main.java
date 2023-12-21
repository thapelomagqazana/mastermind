package org.example;

import org.example.codeinitializer.SecretCode;
import org.example.gameboard.GameBoard;
import org.example.guesser.Guess;
import org.example.mastermind.Mastermind;
import org.example.player.Player;

import java.util.Scanner;

/**
 * The {@code Main} class is the entry point for the Mastermind game.
 */
public class Main {

    public static void main(String[] args) {

        // Create and initialize a secretCode for the game
        String secretCode = SecretCode.initializeSecretCode();

        // Create a Mastermind game with a specific GameBoard and a Player
        Mastermind mastermind = new Mastermind(new GameBoard(secretCode), new Player(new Scanner(System.in)));

        // Start and play the Mastermind game
        mastermind.playGame();
    }
}
