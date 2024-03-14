package org.example;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Dictionary {
    final static String FILEPATH = "/Users/morgenjohnson/IdeaProjects/PracticeProjects/SpellChecker/src/main/resources/dictionary.txt";

    public static Set<String> load() throws IOException {
         Set<String> dictionarySet = new HashSet<>();
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        try (InputStream is = classloader.getResourceAsStream("dictionary.txt");
             BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"))) {

            String line;
            while ((line = br.readLine()) != null) {
                dictionarySet.add(line);
            }
        }
            return dictionarySet;
    }
}




