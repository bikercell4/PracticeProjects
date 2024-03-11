package org.example;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        //      try {
        Set<String> dictionarySet = Dictionary.load();
        Set<String> inputSet = Input.loadInput(args[0]);
        Set<String> nonDictionaryWords = new HashSet<>();
        for (String word : inputSet) {
            if (!dictionarySet.contains(word)) {
                nonDictionaryWords.add(word);
            }
        }
//            UserInput userInput = new UserInput();
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.println("Enter your words:");
//            String input = scanner.nextLine();


        System.out.println("The dictionary doesn't contain these words:");
        for (String word : nonDictionaryWords) {
            System.out.println(word);
        }
//            scanner.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

}