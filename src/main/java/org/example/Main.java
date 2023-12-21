package org.example;

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
        // Create a Mastermind game with a specific GameBoard and a Player
        Mastermind mastermind = new Mastermind(new GameBoard("RGBW"), new Player(new Scanner(System.in)));

        // Start and play the Mastermind game
        mastermind.playGame();
    }
}
