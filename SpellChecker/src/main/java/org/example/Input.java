package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Input {

    public static Set<String> loadInput(String inputPath) throws IOException {

        Set<String> inputSet = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputPath))) {

            String line;

            while ((line = br.readLine()) != null) {
                if (line.trim().length() > 0) {

                    String[] words = line.split("[\\s.]+");
                    for (String word : words) {
                        inputSet.add(word.toLowerCase());
                    }
                }
            }
        }
        return inputSet;
    }
}

