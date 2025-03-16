// La classe "Gatto" estende la classe base "Animale", quindi eredita tutte le proprietà e i metodi di Animale
public class Gatto extends Animale {

    // Attributo specifico della classe Gatto che rappresenta il verso del gatto
    String miagola = "miaou miaou";

    // Metodo che fa l'override del metodo faiIlVerso della classe base Animale
    @Override
    public void faiIlVerso(String miagola) {
        // Chiama il metodo della classe base (Animale) e passa il verso specifico per il gatto
        super.faiIlVerso(miagola);  // Utilizza il metodo della classe genitore per stampare il verso
    }
}