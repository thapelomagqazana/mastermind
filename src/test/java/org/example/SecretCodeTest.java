package org.example;

import org.example.codeinitializer.SecretCode;
import org.example.color.Color;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SecretCodeTest {

    @Test
    void initializeSecretCode_ShouldGenerateValidCode() {
        String secretCode = SecretCode.initializeSecretCode();

        // Check if the generated code has the correct length
        assertEquals(4, secretCode.length());

        // Check if the generated code contains only valid characters
        assertTrue(secretCode.matches("[b" + Color.BLUE.name().charAt(0) + Color.YELLOW.name().charAt(0) +
                Color.GREEN.name().charAt(0) + Color.WHITE.name().charAt(0) + Color.RED.name().charAt(0) + "]+"));
    }

    @Test
    void convertListOfColorstoChars_ShouldConvertColorsToValidString() {
        // Test with a list of colors
        List<Color> colors = Arrays.asList(Color.BLUE, Color.YELLOW, Color.GREEN, Color.RED);

        String result = SecretCode.convertListOfColorstoChars(colors);

        // Check if the result has the correct length
        assertEquals(4, result.length());

        // Check if the result contains only valid characters
        assertTrue(result.matches("[b" + Color.BLUE.name().charAt(0) + Color.YELLOW.name().charAt(0) +
                Color.GREEN.name().charAt(0) + Color.WHITE.name().charAt(0) + Color.RED.name().charAt(0) + "]+"));
    }

    @Test
    void getAllColors_ShouldReturnAllColors() {
        List<Color> allColors = SecretCode.getAllColors();

        // Check if the list contains all color enums
        assertEquals(Arrays.asList(Color.values()), allColors);
    }
}