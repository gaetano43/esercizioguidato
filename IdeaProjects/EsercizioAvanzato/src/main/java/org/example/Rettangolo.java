package org.example;

/**
 * Classe che rappresenta un rettangolo.
 * Implementa l'interfaccia Shape e fornisce una specifica implementazione del metodo draw.
 */
public class Rettangolo implements Shape {

    /**
     * Implementazione del metodo draw() per il rettangolo.
     * Quando viene eseguito, stampa un messaggio che indica il disegno del rettangolo.
     */
    @Override
    public void draw() {
        System.out.println("Disegno il rettangolo");
    }
}
