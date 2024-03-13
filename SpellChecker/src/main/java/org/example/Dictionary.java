package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Dictionary {
    final static String FILEPATH = "/Users/morgenjohnson/IdeaProjects/PracticeProjects/SpellChecker/src/main/resources/dictionary.txt";

    public static Set<String> load() throws IOException {
         Set<String> dictionarySet = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(FILEPATH))) {

            String line;
            while ((line = br.readLine()) != null) {
                dictionarySet.add(line);
            }
        }
            return dictionarySet;
    }
}




