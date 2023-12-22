package org.example;

import org.example.feedback.Feedback;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FeedbackTest {

    @Test
    void testFeedbackConstructor() {
        Feedback feedback = new Feedback(2, 1);

        assertEquals(2, feedback.getMatchingPositions(), "Matching positions should be 2");
        assertEquals(1, feedback.getMatchingLetters(), "Matching letters should be 1");
    }

    @Test
    void testFeedbackToString() {
        Feedback feedback = new Feedback(3, 2);

        assertEquals("2/3", feedback.toString(), "String representation should be '2/3'");
    }

    @Test
    void testIsCorrect() {
        Feedback correctFeedback = new Feedback(4, 0);
        Feedback incorrectFeedback = new Feedback(3, 1);

        assertTrue(correctFeedback.isCorrect(), "Feedback with 4 matching positions should be correct");
        assertFalse(incorrectFeedback.isCorrect(), "Feedback without 4 matching positions should not be correct");
    }

    @Test
    void testFeedbackIsCorrectWithMoreThan4MatchingPositions() {
        Feedback feedback = new Feedback(5, 2);

        assertFalse(feedback.isCorrect(), "Feedback with more than 4 matching positions should not be correct");
    }

    // Add more test methods as needed
}
