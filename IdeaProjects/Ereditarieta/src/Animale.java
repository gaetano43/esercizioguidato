// Definizione della classe base "Animale"
public class Animale {

    // Attributo della classe che contiene il verso dell'animale
    String verso = "un mix di versi";  // Inizialmente il verso è un messaggio generico

    // Metodo per stampare il verso di un animale
    public void faiIlVerso(String verso){
        // Stampa il verso dell'animale, ottenendo dinamicamente il nome della classe
        System.out.println("Il verso della " + getClass() + " è " + verso);
    }
}