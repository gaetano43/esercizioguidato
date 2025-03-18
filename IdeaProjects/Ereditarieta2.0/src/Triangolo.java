// Classe Triangolo che estende Forma
class Triangolo extends Forma {
    private double base;
    private double altezza;

    // Costruttore per inizializzare base e altezza
    public Triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    // Override del metodo calcolaArea per calcolare l'area di un Triangolo
    @Override
    public void calcolaArea() {
        double risultato = (base * altezza)* 0.5;
        System.out.println("L'area del triangolo è di " + risultato + " metri quadrati.");
    }
}
