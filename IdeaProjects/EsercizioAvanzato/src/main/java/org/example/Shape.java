package org.example;

/**
 * Interfaccia Shape che definisce un contratto per tutte le forme geometriche.
 * Ogni classe che implementa questa interfaccia deve fornire una propria implementazione del metodo draw().
 */
public interface Shape {

    /**
     * Metodo astratto che rappresenta l'azione di disegnare una forma.
     * Le classi che implementano questa interfaccia dovranno definire il comportamento di questo metodo.
     */
    void draw();
}
