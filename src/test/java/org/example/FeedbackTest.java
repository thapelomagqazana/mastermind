package org.example;

import org.example.feedback.Feedback;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FeedbackTest {

    @Test
    void testFeedbackConstruction() {
        Feedback feedback = new Feedback(2, 1);
        assertEquals(2, feedback.getMatchingPositions());
        assertEquals(1, feedback.getMatchingLetters());
    }

    // Add more test methods as needed
}
