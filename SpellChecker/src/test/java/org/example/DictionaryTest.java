package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryTest {
    @Test
    void testLoad() throws IOException {
        Dictionary dictionary = new Dictionary();
        Set<String> returnedSet =
        dictionary.load();
        Assertions.assertNotNull(returnedSet);


    }


}