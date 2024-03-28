package org.example;

import org.apache.commons.cli.*;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) throws IOException, ParseException {
        try {
            configureLogging();

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


            logger.info("The dictionary doesn't contain these words:");
            for (String word : nonDictionaryWords
                    .stream()
                    .map(String::toUpperCase)
                    .collect(Collectors.toSet())) {
                logger.info(word);
            }

        } catch (IOException | ParseException e) {
            logger.log(Level.SEVERE, "An error occurred", e);
        }
    }
        static void configureLogging() {
        Logger rootLogger = Logger.getLogger("");
        rootLogger.setLevel(Level.INFO);
    }

}