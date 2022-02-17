package br.com.capgemini.questionOne;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StairsChallengeTest {

    private StairsChallenge stairsChallenge;

    @BeforeEach
    void setUp() {
        stairsChallenge = new StairsChallenge();
    }

    @Test
    void shouldReturnNothingForSizeZero() {
        String sizeZero = stairsChallenge.stairsBuilder(0);

        assertEquals("", sizeZero);
    }

    @Test
    void shouldReturnStairsWithSizeFive() {
        String sizeFive = stairsChallenge.stairsBuilder(5);
        System.out.println(sizeFive);

        String expectedSizeFive =   "    *\n" +
                                    "   **\n" +
                                    "  ***\n" +
                                    " ****\n" +
                                    "*****";

        assertEquals(expectedSizeFive, sizeFive);
    }
}