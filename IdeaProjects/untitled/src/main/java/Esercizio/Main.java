package Esercizio;

public class Main {
    public static void main(String[] args) {
        // Creazione di un oggetto Punto con coordinate (3, 4)
        Punto punto = new Punto(3, 4);

        // Stampa separata delle coordinate
        System.out.println("Coordinate del punto:");
        System.out.println("x = " + punto.x());
        System.out.println("y = " + punto.y());

        // Stampa dell'intero punto usando il toString() generato automaticamente
        System.out.println("Punto intero: " + punto);
    }
}
