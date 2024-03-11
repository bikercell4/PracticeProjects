package org.example;

import java.util.HashSet;
import java.util.Set;

public class UserInput {
    public Set<String> notInDictionary(String userInput, Set<String> dictionarySet) {
        Set<String> nonDictionaryWords = new HashSet<>();
        String[] words = userInput.split("\\s+");//got caught here!

        for (String word: words) {
            if (!dictionarySet.contains(word)) {
                nonDictionaryWords.add(word);
            }
        }
        return nonDictionaryWords;
    }
}
