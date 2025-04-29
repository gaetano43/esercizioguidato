package elimina;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class main {

    // Enum per definire le operazioni disponibili
    enum Operazione {
        ADDIZIONE,
        SOTTRAZIONE,
        MOLTIPLICAZIONE,
        DIVISIONE,
        MIN,
        MAX
    }

    // Metodo che esegue l'operazione scelta tra due BigDecimal
    public static BigDecimal calcola(BigDecimal a, BigDecimal b, Operazione op) {
        switch (op) {
            case ADDIZIONE:
                return a.add(b); // Somma
            case SOTTRAZIONE:
                return a.subtract(b); // Sottrazione
            case MOLTIPLICAZIONE:
                return a.multiply(b); // Moltiplicazione
            case DIVISIONE:
                // Divisione con 2 decimali di precisione
                return a.divide(b, 2, RoundingMode.HALF_UP);
            case MIN:
                return a.min(b); // Ritorna il più piccolo
            case MAX:
                return a.max(b); // Ritorna il più grande
            default:
                // In caso di operazione non riconosciuta
                throw new IllegalArgumentException("Operazione non supportata");
        }
    }

    // Metodo principale di esecuzione
    public static void main(String[] args) {
        // Creazione di due oggetti BigDecimal con valori iniziali
        BigDecimal numero1 = new BigDecimal("10.50");
        BigDecimal numero2 = new BigDecimal("4.25");

        // Scelta dell'operazione da eseguire (puoi cambiarla)
        Operazione operazione = Operazione.DIVISIONE;
        // Chiamata al metodo calcola per ottenere il risultato
        BigDecimal risultato = calcola(numero1, numero2, operazione);

        //stampa i risultati
        System.out.println( "Numero 2: " + numero2    +"\n"
                +"Numero 1: " + numero1 +"\n"+
                "Operazione: " + operazione+"\n"+
                "Risultato: " + risultato);
    }
}
