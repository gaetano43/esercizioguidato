
// Classe base che rappresenta una forma generica
class Forma {
    // Metodo per calcolare l'area di una forma generica
    public void calcolaArea() {
        System.out.println("L'area di una forma è la superficie che occupa.");
    }
}

// Classe Rettangolo che estende Forma
class Rettangolo extends Forma {
    private int base;
    private int altezza;

    // Costruttore per inizializzare base e altezza
    public Rettangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    // Override del metodo calcolaArea per calcolare l'area di un rettangolo
    @Override
    public void calcolaArea() {
        int risultato = base * altezza;
        System.out.println("L'area del rettangolo è di " + risultato + " metri quadrati.");
    }
}

// Classe principale con il metodo main
public class Main {
    public static void main(String[] args) {
        // Creazione di un'istanza di Forma
        Forma forma = new Forma();

        // Creazione di un'istanza di Rettangolo con base 10 e altezza 6
        Rettangolo rettangolo = new Rettangolo(10, 6);

        // Chiamata ai metodi calcolaArea
        forma.calcolaArea();
        rettangolo.calcolaArea();
    }
}