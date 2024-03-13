package org.example;

import org.apache.commons.cli.*;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        CommandLineParser parser = new DefaultParser();

        Options options = new Options();

        options.addOption("i", true, "input file path");

        CommandLine cmd = parser.parse(options, args);

        //      try {
        Set<String> dictionarySet = Dictionary.load();
        Set<String> inputSet = Input.loadInput(cmd.getOptionValue("i"));
        //Set<String> inputSet = Input.loadInput(args[0]);
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