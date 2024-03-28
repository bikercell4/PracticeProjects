package org.example;

import java.io.*;
import java.util.HashSet;
import java.util.List;
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
    public static boolean isFiveLetters(String word) {
//        if (word.length() == 5) {
//            return true;
//        } else {
//            return false;
//        }
        return word.length() == 5;
    }
    public static List<String> getFiveLetterWords() throws IOException {
       // return load().stream().filter(word-> isFiveLetters(word)).toList();
        return load().stream().filter(Dictionary::isFiveLetters).toList();
    }
}




