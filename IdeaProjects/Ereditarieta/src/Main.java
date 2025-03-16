// La classe Main contiene il metodo main che esegue il programma
public class Main {

    public static void main(String[] arg) {

        // Creazione degli oggetti
        Animale animale = new Animale();
        Gatto gatto = new Gatto();

        // Chiamata al metodo faiIlVerso dell'oggetto , passando il verso generico definito nella classe di apartenenza
        animale.faiIlVerso(animale.verso);
        gatto.faiIlVerso(gatto.miagola);
    }
}