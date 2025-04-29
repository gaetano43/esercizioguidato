package org.example;

/**
 * Classe che rappresenta un trapezio.
 * Implementa l'interfaccia Shape e fornisce una implementazione concreta del metodo draw.
 */
public class Trapezio implements Shape {

    /**
     * Implementazione del metodo draw() per il trapezio.
     * Quando viene chiamato, stampa un messaggio che indica che si sta disegnando un trapezio.
     */
    @Override
    public void draw() {
        System.out.println("Disegno il trapezio");
    }
}
