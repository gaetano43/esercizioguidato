package org.example;
// Classe principale per testare tutto
public class Main {
    public static void main(String[] args) {
        // Ciclo su tutti i tipi di forma definiti nell'enum
        for (TipiShape type : TipiShape.values()) {
            Shape shape = FactoryShape.crea(type); // Usa la factory per ottenere l'oggetto Shape
            shape.draw(); // Stampa il risultato della funzione draw
        }
    }
}
