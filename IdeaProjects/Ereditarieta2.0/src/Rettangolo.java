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
