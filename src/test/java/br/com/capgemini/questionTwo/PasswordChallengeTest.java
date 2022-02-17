package br.com.capgemini.questionTwo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordChallengeTest {

    private PasswordChallenge passwordChallenge;

    @BeforeEach
    void setUp() {
        passwordChallenge = new PasswordChallenge();
    }

    @Test
    void shouldReturnOneForSizeFiveCharacters() {
        int passwordCheckNumber = passwordChallenge.passwordChecker("Ya3&a");
        int passwordCheckNumberRegex = passwordChallenge.passwordCheckerUsingRegex("Ya3&a");
        assertEquals(1, passwordCheckNumber);
        assertEquals(1, passwordCheckNumberRegex);
    }

    @Test
    void shouldReturnZeroForAllConditionsSatisfied() {
        int passwordCheckNumber = passwordChallenge.passwordChecker("Ya3&ab");
        int passwordCheckNumberRegex = passwordChallenge.passwordCheckerUsingRegex("Ya3&ab");
        assertEquals(0, passwordCheckNumber);
        assertEquals(0, passwordCheckNumberRegex);
    }

    @Test
    void shouldReturnOneForNoEspecialCharacters() {
        int passwordCheckNumber = passwordChallenge.passwordChecker("Ya3aab");
        int passwordCheckNumberRegex = passwordChallenge.passwordCheckerUsingRegex("Ya3aab");
        assertEquals(1, passwordCheckNumber);
        assertEquals(1, passwordCheckNumberRegex);
    }

    @Test
    void shouldReturnOneForNoUpperCaseCharacters() {
        int passwordCheckNumber = passwordChallenge.passwordChecker("ya3&ab");
        int passwordCheckNumberRegex = passwordChallenge.passwordCheckerUsingRegex("ya3&ab");
        assertEquals(1, passwordCheckNumber);
        assertEquals(1, passwordCheckNumberRegex);
    }

    @Test
    void shouldReturnOneForNoLowerCaseCharacters() {
        int passwordCheckNumber = passwordChallenge.passwordChecker("YA3&AB");
        int passwordCheckNumberRegex = passwordChallenge.passwordCheckerUsingRegex("YA3&AB");
        assertEquals(1, passwordCheckNumber);
        assertEquals(1, passwordCheckNumberRegex);
    }

    @Test
    void shouldReturnThreeForNoEspecialCharacterAndSizeSmallerThanSix() {
        int passwordCheckNumber = passwordChallenge.passwordChecker("Ya3");
        int passwordCheckNumberRegex = passwordChallenge.passwordCheckerUsingRegex("Ya3");
        assertEquals(3, passwordCheckNumber);
        assertEquals(3, passwordCheckNumberRegex);
    }

}