package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class TrapezioTest {

    @Test
    void testDrawStampaMessaggioCorretto() {
        // Salva l'output standard originale
        PrintStream originalOut = System.out;

        // Crea un ByteArrayOutputStream per catturare l'output
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        try {
            // Crea l'oggetto Trapezio e chiama il metodo draw()
            Shape trapezio = new Trapezio();
            trapezio.draw();

            // Verifica che l'output sia quello atteso
            String expected = "Disegno il trapezio" + System.lineSeparator();
            assertEquals(expected, output.toString());

        } finally {
            // Ripristina l'output standard originale
            System.setOut(originalOut);
        }
    }
}
