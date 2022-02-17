package br.com.capgemini.questionThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AnagramChallengeTest {

    private AnagramChallenge anagramChallenge;

    @BeforeEach
    void setUp() {
        anagramChallenge = new AnagramChallenge();
    }

    @Test
    void shouldReturnTrueForAnagram() {
        boolean isAnagram = anagramChallenge.isAnagram("capgemini", "nimigecap");
        assertTrue(isAnagram);
    }

    @Test
    void shouldReturnFalseForAnagram() {
        boolean isAnagram = anagramChallenge.isAnagram("capgemini", "wimigecap");
        assertFalse(isAnagram);
    }

    @Test
    void shouldCreateListOfSubstrings() {
        //ovo
        List<String> expectedList = Arrays.asList("o", "ov", "ovo", "v", "vo", "o");
        List<String> actualList = anagramChallenge.createSubstringList("ovo");

        assertEquals(expectedList, actualList);
    }

    @Test
    void shouldFindNoSubstringAnagrams() {
        int numberOfAnagrams = anagramChallenge.findSubstringAnagrams("aeiou");
        assertEquals(0, numberOfAnagrams);
    }

    @Test
    void shouldFindThreeSubstringAnagrams() {
        int numberOfAnagrams = anagramChallenge.findSubstringAnagrams("ifailuhkqq");
        assertEquals(3, numberOfAnagrams);
    }
}