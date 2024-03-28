package org.example;

import org.junit.jupiter.api.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void testConfigureLogging() {
        Logger rootLogger = Logger.getLogger("");

        Main.configureLogging();

        assertEquals(Level.INFO, rootLogger.getLevel(), "Logging level should be INFO");
    }
}