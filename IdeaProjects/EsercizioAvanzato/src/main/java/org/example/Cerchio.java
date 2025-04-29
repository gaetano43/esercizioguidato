package org.example;

/**
 * Classe che rappresenta un cerchio.
 * Implementa l'interfaccia Shape e fornisce una definizione concreta del metodo draw.
 */
public class Cerchio implements Shape {

    /**
     * Implementazione del metodo draw() specifica per il cerchio.
     * Quando chiamato, stampa un messaggio che indica che si sta disegnando un cerchio.
     */
    @Override
    public void draw() {
        System.out.println("Disegno il cerchio");
    }
}
