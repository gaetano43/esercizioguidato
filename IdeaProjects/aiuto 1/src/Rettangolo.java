
// Implementazione della classe Rettangolo
class Rettangolo implements Forma {
    private double base, altezza;

    // Costruttore
    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    // Implementazione del metodo per calcolare l'area
    @Override
    public double calcolaArea() {
        return base * altezza;
    }
}
