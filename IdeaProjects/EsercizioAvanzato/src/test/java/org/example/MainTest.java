package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {

    @Test
    void testMainOutputContieneDisegniForme() {
        // Reindirizza l'output per catturare quello stampato dal main
        PrintStream originalOut = System.out;
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        try {
            // Esegue il main
            Main.main(new String[]{});

            String outputStr = output.toString();

            // Controlla che l'output contenga i messaggi attesi
            assertTrue(outputStr.contains("Disegno il cerchio"));
            assertTrue(outputStr.contains("Disegno il rettangolo"));
            assertTrue(outputStr.contains("Disegno il trapezio"));

        } finally {
            // Ripristina System.out
            System.setOut(originalOut);
        }
    }
}
