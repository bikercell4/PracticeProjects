package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class UserInputTest {
    @Test
    public void testNotInDictionary() {
        //make a dictionary (has only 2 words)
        Set<String> dictionarySet = new HashSet<>();
        dictionarySet.add("hello");
        dictionarySet.add("world");

        UserInput userInput = new UserInput();

        //call method with user input as parameter
        Set<String> result = userInput.notInDictionary("hello good morning", dictionarySet);

        Set<String> expected = new HashSet<>();
        expected.add("good");
        expected.add("morning");

        Assertions.assertEquals(expected, result);
    }

}