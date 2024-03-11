package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Set;

class InputTest {

    @Test
    void testLoadInput() throws IOException {
        final String INPUTFILE = "/Users/morgenjohnson/IdeaProjects/SpellChecker/src/test/resources/input.txt";
        Input input = new Input();
        Set<String> returnedSet = input.loadInput(INPUTFILE);
        Assertions.assertNotNull(returnedSet);
    }
}
