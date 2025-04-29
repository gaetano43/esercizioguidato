package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class RettangoloTest {

    @Test
    void testDrawStampaMessaggioCorretto() {
        // Salva il riferimento all'output originale
        PrintStream originalOut = System.out;

        // Prepara uno stream per catturare l'output
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        try {
            // Crea il rettangolo e chiama draw()
            Shape rettangolo = new Rettangolo();
            rettangolo.draw();

            // Confronta l'output con quello atteso
            String expected = "Disegno il rettangolo" + System.lineSeparator();
            assertEquals(expected, output.toString());

        } finally {
            // Ripristina System.out anche in caso di errore
            System.setOut(originalOut);
        }
    }
}
