package org.example;

public class FactoryShape {

    /**
     * Metodo statico che crea un'istanza della classe corrispondente al tipo di forma specificato.
     * Utilizza un'istruzione switch con l'enum TipiShape per decidere quale oggetto Shape creare.
     *
     * @param tipo Il tipo di forma richiesto (CERCHIO, RETTANGOLO, TRAPEZIO, ecc.)
     * @return Un oggetto che implementa l'interfaccia Shape
     * @throws IllegalArgumentException Se il tipo di forma non è supportato
     */
    public static Shape crea(TipiShape tipo) {
        // Switch expression per restituire l'oggetto corretto in base al tipo specificato
        switch (tipo) {
            // Controlla se il parametro 'tipo' è null.
// In tal caso, lancia un'eccezione per segnalare che il tipo di forma non può essere null.
// Questo evita un NullPointerException più avanti nello switch e rende l'errore più comprensibile.
           case null -> {
                throw new IllegalArgumentException("Il tipo di forma non può essere null");
            }

            case CERCHIO -> {
                // Restituisce un'istanza della classe Cerchio
                return new Cerchio();
            }
            case RETTANGOLO -> {
                // Restituisce un'istanza della classe Rettangolo
                return new Rettangolo();
            }
            case TRAPEZIO -> {
                // Restituisce un'istanza della classe Trapezio
                return new Trapezio();
            }
            default ->
                // Eccezione lanciata se il tipo non è riconosciuto
                    throw new IllegalArgumentException("Tipo di forma non supportato");
        }
    }
}
