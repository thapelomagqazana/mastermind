package org.example.codeinitializer;

import org.example.color.Color;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * The {@code SecretCode} class generates a secret code using a list of colors.
 * The colors are shuffled to randomize the order, and the first four colors are used as the secret code.
 * The secret code is then converted to a string representation.
 */
public class SecretCode {

    /**
     * Returns a list of all colors.
     *
     * @return List of colors
     */
    public static List<Color> getAllColors() {
        return Arrays.asList(Color.values());
    }

    /**
     * Initializes a secret code by shuffling the list of colors and taking the first four colors.
     *
     * @return The initialized secret code as a string
     */
    public static String initializeSecretCode() {
        List<Color> allColors = getAllColors();

        // Shuffle the list to randomize the order
        Collections.shuffle(allColors);

        // Take the first four colors as the secret code
        List<Color> secretCode = allColors.subList(0, 4);

        return convertListOfColorstoChars(secretCode);

    }

    /**
     * Converts a list of colors to a string representation.
     * Black color is represented by 'b', and other colors are represented by their first character.
     *
     * @param colors The list of colors to be converted
     * @return The string representation of the colors
     */
    public static String convertListOfColorstoChars(List<Color> colors) {
        StringBuilder result = new StringBuilder();
        for (Color color : colors) {
            if (color.equals(Color.BLACK)) {
                result.append('b');
            } else {
                result.append(color.name().charAt(0));
            }
        }
        return result.toString();
    }
}