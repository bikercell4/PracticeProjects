package org.example;

import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void testDiceRoller() {
        //Create instance of Main and roll dice
        Main main = new Main();
        for (int i = 0; i < 100; i++) {
            //call diceMapper with hard coded parameters
            main.diceMapper(1,1);
        }
        Map<Integer, Integer> resultMap = Main.getDiceTotalMap();
        //expect map has one key with a value of 100
        assertEquals(1, resultMap.size());
        //expect 100 rolls for hard coded sum
        assertEquals(100, resultMap.get(2).intValue());
    }
}
