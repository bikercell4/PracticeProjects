package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    //initialize a store for the results
    private static Map<Integer, Integer> diceTotalMap = new HashMap<>();

    //getter for testing
    public static Map<Integer, Integer> getDiceTotalMap() {
        return diceTotalMap;
    }

    //initialize a function to populate map
    public static void diceMapper(int firstDice, int secondDice){
        int diceSum = firstDice + secondDice;

            if (diceTotalMap.containsKey(diceSum)) {
                diceTotalMap.put(diceSum, diceTotalMap.get(diceSum) + 1);
            } else {
                diceTotalMap.put(diceSum, 1);
            }

    }
    //this was already here, should I call it something else like diceRoller?
    public static void main(String[] args) {
        //Initialize an instance of the randomizer
        Random random = new Random();

        //Generate dice roller
        for (int i = 0; i < 100; i++) {
            int firstDice = random.nextInt(6) + 1;
            int secondDice = random.nextInt(6) + 1;
            diceMapper(firstDice, secondDice);
        }

        //print results
        System.out.println(diceTotalMap);
    }
}