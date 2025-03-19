// Classe Rettangolo che estende Forma
class Rettangolo extends Forma {
    private double base;
    private double altezza;

    // Costruttore per inizializzare base e altezza
    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    // Override del metodo calcolaArea per calcolare l'area di un rettangolo
    @Override
    public double calcolaArea() {
        return base * altezza;
    }
}
